package com.lph.sort;

/**
 * 冒泡排序
 */

public class BubbleSort {

    public static void main(String[]args){
        int[]a = new int[]{3,1,2,4,5};
        sort(a);
        for (int anA : a) System.out.print(anA);
    }



    private static void sort(int[] a){
        int temp;
        for (int i=0;i<a.length-1;i++){
            boolean flag = false;
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    flag = true;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void BubbleSort2(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
