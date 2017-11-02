package com.lph.sort;

/**
 * 冒泡排序
 */

public class BubbleSort {

    public static void main(String[]args){
        int[]a = new int[]{3,1,2,4,5};
        sort(a);
        for (int i=0;i<a.length;i++)
        System.out.print(a[i]);
    }



    public static void sort(int[]a){
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
}
