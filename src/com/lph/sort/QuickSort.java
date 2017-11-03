package com.lph.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 2, 4, 5};
        sort(a,0,4);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }

    public static int partition(int[]a,int low,int high){
        int key = a[low];
        while(low<high){
            while (a[high]>=key&&high>low){
                high--;
            }
            a[low]=a[high];

            while(a[low]<=key&&high>low){
                low++;
            }
            a[high]=a[low];
        }

        a[high] = key;
        return high;
    }

    public static void sort(int[]a,int low,int high){

        if(high<=low)
            return;

        int index = partition(a,low,high);
        sort(a,low,index-1);
        sort(a,index+1,high);
    }
}
