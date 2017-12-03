package com.lph.jianzhi;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */

public class MathPower {
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1.0;
        else if (exponent == 1)
            return base;
        else if (exponent % 2 == 1) {
            base *= Power(base, exponent - 1);
        } else if (exponent % 2 == 0) {
            base = Power(base, exponent / 2) * Power(base, exponent / 2);
        } else if (exponent < 0) {
            return 1 / Power(base, -exponent);
        }
        return base;
    }
}
