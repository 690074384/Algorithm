package com.lph.jianzhi;

/**
 * 题目描述:
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class SpaceReplace {
    public static String replaceSpace(StringBuffer str) {
        int strLength = str.length();
        int finalLength = strLength;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                finalLength += 2;
            }
        }
        int oldIndex = strLength - 1;
        int newIndex = finalLength - 1;
        str.setLength(finalLength);
        for (;oldIndex>=0 && oldIndex<newIndex;--oldIndex) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }else{
                str.setCharAt(newIndex-- , str.charAt(oldIndex));
            }
        }
        return str.toString();
    }

    public static void main(String[]args){
        replaceSpace(new StringBuffer("Hello World"));
    }
}
