package com.homework1;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/9 0009.
 */
public class paixu {
    public static void main(String[] args) {
        int x;
        Scanner sca = new Scanner(System.in);
//        for (int j = 0;j<3;j++){
//            System.out.println("please input a number:");
//            int x = sca.nextInt();
//            System.out.println(x);
//        }
        System.out.println("please input three numbers:");
        String s = sca.nextLine();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i <= str.length - 1; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        ;
        //选择排序
//        for (int a=0;a<arr.length;a++){
//            for (int b = a+1;b<arr.length;b++){
//                if (arr[a]>arr[b]){
//                    x = arr[a];
//                    arr[a] = arr[b];
//                    arr[b] = x;
//                }
//            }
//        }
//        for (int k:arr){
//            System.out.print(k+"\t");
//        }
        //冒泡排序
        for (int z = 0; z < arr.length - 1; z++) {
            for (int y = 0; y < arr.length - z - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    x = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = x;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k + "\t");
        }
    }
}

