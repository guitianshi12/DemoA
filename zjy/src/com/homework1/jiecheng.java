package com.homework1;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class jiecheng {
    public static void main(String[] args) {
        int sum = 0;
        int k = 1;
        for (int i = 1; i <= 20; i++) {
            k = k * i;
            sum += k;
        }
        System.out.println(sum);

    }
}
