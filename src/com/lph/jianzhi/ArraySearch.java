package com.lph.jianzhi;

/**
 * 题目描述:
     在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     每一列都按照从上到下递增的顺序排序。
     请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 * 思路：
 * 从右上角开始，若小，向下走，删除一行，若大，向左走，删除一列
 */

public class ArraySearch {
    public boolean Find(int[][] array,int n){
        int row = 0;
        int col = array[0].length;
        while(row<=array[0].length&&col>=0){
            if(n == array[row][col]){
                return true;
            }else if(n>array[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
