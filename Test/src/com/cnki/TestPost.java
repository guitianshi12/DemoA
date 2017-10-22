package com.cnki;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
public class TestPost {

    @Test
    public void testSendPost() {
        String url = "http://www.atestyun.com/Login";
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("userName", "jack");
            jsonObject.put("userPassword", 123456);
            StringEntity entity = new StringEntity(jsonObject.toString(), "utf-8");
            entity.setContentEncoding("utf-8");
            entity.setContentType("application/json");
            sendPost(url, entity);

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void sendPost(String url, StringEntity entity) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        HttpEntity httpEntity = null;
        String responseContent = null;

        httpClient = HttpClients.createDefault();
        try {
            httpResponse = httpClient.execute(httpPost);
            httpEntity = httpResponse.getEntity();
            System.out.println("status:" + httpResponse.getStatusLine());
            responseContent = EntityUtils.toString(httpEntity, "utf-8");
            System.out.println(responseContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpResponse.close();
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
