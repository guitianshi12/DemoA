package com.cnki;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class TestSorted {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 2, 8, 3, 4, 9, 0};
        int[] c = sortedArry(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }

//    public static int[] sortedArry1(int[] a){
//        for(int i=a.length-1;i>0;i--){
//            for(int j=0;j<i)
//        }
//        return a;
//    }a


    public static int[] sortedArry(int[] a) {
        int temp;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j + 1] > a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }


}
