package com.homework1;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class sushu {
    public static void main(String[] args) {
        out:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue out;
                }
            }
            System.out.print(i + "\t");
        }
    }
}
