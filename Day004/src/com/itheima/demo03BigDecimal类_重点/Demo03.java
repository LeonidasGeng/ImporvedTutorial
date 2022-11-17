package com.itheima.demo03BigDecimal类_重点;

import java.math.BigDecimal;

/*
目标:学习BigDecimal的加减乘除方法

    BigDecimal类的说明:
        可以表示任意精度的数字

    构造方法:
        BigDecimal​(double val) 将 double转换为 BigDecimal。
        BigDecimal​(String val) 将 String转换为 BigDecimal。

    普通方法:
        BigDecimal add​(BigDecimal augend) 相加
        BigDecimal subtract​(BigDecimal subtrahend) 相减
        BigDecimal multiply​(BigDecimal multiplicand) 相乘
        BigDecimal divide​(BigDecimal divisor) 相除
 */
public class Demo03 {
    public static void main(String[] args) {
        // 小数在计算机中是近似值(浮点型)
        double d = 0.1 + 0.2; // 期望结果0.3
        System.out.println("d = " + d); // 0.30000000000000004

        // BigDecimal​(double val) 将 double转换为 BigDecimal。 0.4
        BigDecimal b1 = new BigDecimal(0.4);
        System.out.println("b1 = " + b1); // 0.40000000000000002220446049250313080847263336181640625

        // BigDecimal​(String val) 将 String转换为 BigDecimal。 ***** 这个创建时没有误差
        BigDecimal b2 = new BigDecimal("0.4");
        System.out.println("b2 = " + b2); // 0.4

        BigDecimal b3 = new BigDecimal("0.2");

        // BigDecimal add​(BigDecimal augend) 相加
        System.out.println(b2.add(b3)); // 0.4 + 0.2 = 0.6

        // BigDecimal subtract​(BigDecimal subtrahend) 相减
        System.out.println(b2.subtract(b3)); // 0.4 - 0.2 = 0.2

        // BigDecimal multiply​(BigDecimal multiplicand) 相乘
        System.out.println(b2.multiply(b3)); // 0.4 * 0.2 = 0.08

        // BigDecimal divide​(BigDecimal divisor) 相除
        System.out.println(b2.divide(b3)); // 0.4 / 0.2 = 2

        // 扩展特殊情况,除数有可能除不尽
        BigDecimal b4 = new BigDecimal("20");
        BigDecimal b5 = new BigDecimal("3");
        // System.out.println(b4.divide(b5)); // 20 / 3 = 6.6666666无限循环小数 6.67
        // 要指定保留小数位数
        // ROUND_HALF_UP: 最后一位,看下一位进行四舍五入      3.3333333333333333333333   ROUND_HALF_UP  3.33
        System.out.println(b4.divide(b5, 2, BigDecimal.ROUND_HALF_UP)); // 6.67
    }
}
