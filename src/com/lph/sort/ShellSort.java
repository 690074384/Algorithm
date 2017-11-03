package com.lph.sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 2, 4, 5};
        sort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }

    public static void sort(int[] a) {
        int temp;
        int n=a.length;
        for (int gap = n / 2; gap >0; gap /= 2) {
            for(int i=gap;i<n;i++){
                for(int j=i-gap;j>=0&&a[j]>a[j+gap];j-=gap){
                    temp=a[j];
                    a[j]=a[j+gap];
                    a[j+gap]=temp;
                }
            }
        }
    }
}
