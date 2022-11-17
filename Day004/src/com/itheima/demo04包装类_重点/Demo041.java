package com.itheima.demo04包装类_重点;

/*
字符串的"5" -> 数字的5

目标:学习String和int之间互相转换

讲解:
    我们之前学过基本数据类型有8种.基本数据类型效率高,但是功能及其有限,只能做加减乘除运算.
    为了对基本数据类型进行更多的操作,Java为每种基本数据类型提供了对应的类(包装类)
    5 + 3

    基本数据类型(关键字)      包装类(类)
        byte                Byte
        short               Short
        int                 Integer     *****
        long                Long
        float               Float
        double              Double
        char                Character   *****
        boolean             Boolean

    包装类的规律: 首字母大写,特殊的两个 int -> Integer, char -> Character
 */
public class Demo041 {
    public static void main(String[] args) {
        // int转成String  5 -> "5"
        String str1 = 5 + ""; // "5"
        String str2 = String.valueOf(5); // "5"

        // String转成int  "5" -> 5  重点
        int i = Integer.parseInt("5"); // 5

        // 扩展: "6.66" -> double的 6.66
        double d = Double.parseDouble("6.66"); // 6.66
    }
}
