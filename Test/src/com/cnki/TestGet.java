package com.cnki;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
public class TestGet {

    @Test
    public void testGet() {
        String url = "https://www.baidu.com/s?";
/*         JSONObject jsonObject = new JSONObject();
       try {
            jsonObject.put("wd","test");
            jsonObject.put("ie","utf-8");
            String json = jsonObject.toString();
            System.out.println(json);
            url = url + URLEncoder.encode(json,"utf-8");
            System.out.println(url);
        } catch (JSONException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }*/

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("ie", "utf-8"));
        params.add(new BasicNameValuePair("wd", "test"));
        url = url + URLEncodedUtils.format(params, "UTF-8");
        System.out.println(url);
        httpGetTest(url);
    }

    public static void httpGetTest(String url) {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        HttpEntity entity = null;
        String responseContent = null;
        httpClient = HttpClients.createDefault();

        try {
            httpResponse = httpClient.execute(httpGet);
            entity = httpResponse.getEntity();
            System.out.println("status" + httpResponse.getStatusLine());
            responseContent = EntityUtils.toString(entity, "UTF-8");
            System.out.println(responseContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (httpResponse != null) {
                try {
                    httpResponse.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
