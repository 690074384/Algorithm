package com.lph.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 2, 4, 5};
        sort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }

    public static void sort(int[] a) {

        int  temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i - 1; j >= 0 && a[j] >a[j+1]; j--) {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}
