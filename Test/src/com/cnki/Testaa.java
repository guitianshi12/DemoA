package com.cnki;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/17 0017.
 */
public class Testaa {
    public static void main(String[] args) {
        System.out.print(Testaa.re());
    }

    @BeforeMethod
    public static String re() {
        FileInputStream fis = null;
        try {
            System.out.println("try");
            fis = new FileInputStream("e:/sdf.txt");
        } catch (IOException e) {
            System.out.println("catch");
            return "sdd";

        } finally {
            System.out.println("finally");

            try {
                fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return "qw";
        }
    }
}
