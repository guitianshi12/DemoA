package com.cnki;

import jdk.nashorn.internal.runtime.ECMAException;
import org.jsoup.*;
import org.jsoup.nodes.Document;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class TestJsoup {
    public static void main(String[] args) {
        TestJsoup test = new TestJsoup();
        test.getJsoup("http://www.baidu.com");

    }

    public Document getJsoup(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public void getConnet() {
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream("c:/tet.tesxt"));

            //sdfgsdfgsdfgsdfgsfdg
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class A {

}

