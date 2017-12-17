package com.lph.jianzhi;

/**
 * 凡普金科笔试题
 */

public class A {
	
	public static void main(String[] args) {
		System.out.println(changeNum(12));
	}
	
	public static int changeNum(int n) {
		int num;
		int x = n;
		for(int i = n ;;i++) {
			num = i;
			while (num != 0) {
				x -= num % 10;
				num = num / 10;
			}
			if(x>=n) {
				return i;
			}
			x = i+1;
			
		}
		
	}
}