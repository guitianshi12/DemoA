package com.cnki;

/**
 * Created by Administrator on 2017/9/9 0009.
 */
public class TestSwitch {
    public static void main(String[] args) {
        out:
        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 4; i++) {
                if (i == 2) {
                    System.out.println(i);
                    continue out;
                }
                System.out.println(j);
            }
            System.out.println(j);
        }
        System.out.println(111);
    }
}
