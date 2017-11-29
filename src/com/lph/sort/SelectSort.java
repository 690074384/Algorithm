package com.lph.sort;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[]args){
        int[]a = new int[]{3,1,2,4,5};
        sort(a);
        for (int anA : a) System.out.print(anA);
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


    public static void selectSort(int[] a, int n){
        int temp;
        for(int i=0;i<n;i++){
            int index = i;
            for (int j=i+1;j<n;j++){
                if (a[j]<a[index]){
                    index = j;
                }
            }
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        for (int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
