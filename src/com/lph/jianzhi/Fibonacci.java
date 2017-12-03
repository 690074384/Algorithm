package com.lph.jianzhi;

/**
 * 1、一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 2、Fibonacci数列
 */
public class Fibonacci {
    public int Fibonacci1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int small = 0;
        int big = 1;
        int finalNum = 0;
        for (int i = 2; i <= n; i++) {
            finalNum = small + big;
            small = big;
            big = finalNum;
        }
        return finalNum;
    }

    public int Fibonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int small = 0;
        int big = 1;

        while ((n--) != 0) {
            big += small;
            small = big - small;
        }
        return small;

    }

    /**
     * 执行效率太低
     *
     * @param n
     * @return
     */
    public int Fibonacci3(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci3(n - 1) + Fibonacci3(n - 2);
    }
}