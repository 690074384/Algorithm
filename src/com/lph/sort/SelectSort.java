package com.lph.sort;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[]args){
        int[]a = new int[]{3,1,2,4,5};
        sort(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }

    private static void sort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            int temp=a[i];
            int flag = i;
            for (int j=i+1;j<a.length;j++){
                if(temp>a[j]){
                    flag = j;
                    temp =a[j];
                }
            }
            if(temp!=a[i]){
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }
}
