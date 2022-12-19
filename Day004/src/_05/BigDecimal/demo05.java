package _05.BigDecimal;

import java.math.BigDecimal;
/*
double类型是近似值
保证精度准确
用BigDecimal有两种
BigDecimal(String value) 绝对准确
BigDecimal(double value)

BigDecimal add(BigDecimal augend) 相加
 */
public class demo05 {
    public static void main(String[] args) {
        //小数在计算机中是近似值
        double a = 0.1+0.2;
        System.out.println("a="+a);

        //BigDecimal(double val), 将double转为BigDecimal,精度会有误差
        BigDecimal b1 = new BigDecimal(0.4);
        System.out.println(b1);

        ////BigDecimal(String val), 将String转为BigDecimal,无精度误差
        BigDecimal b2 = new BigDecimal("0.4");
        System.out.println(b2);

        BigDecimal b3 = new BigDecimal("0.3");
        BigDecimal b6 = new BigDecimal("0.2");
        System.out.println(b3);
        System.out.println("=====");

        //BigDecimal add(BigDecimal augend) 相加 +
        System.out.println(b2.add(b3)); //0.4+0.3
        System.out.println("=====");

        //BigDecimal subtract(BigDecimal augend) 相减 -
        System.out.println(b2.subtract(b3)); //0.4-0.3
        System.out.println("=====");

        //BigDecimal multiply(BigDecimal augend) 相乘 *
        System.out.println(b2.multiply(b3)); //0.4 * 0.3
        System.out.println("=====");

        //BigDecimal divide(BigDecimal augend) 相除 /
        System.out.println(b2.divide(b6)); //0.4/0.2


        //特殊情况，除不尽
        BigDecimal b4 = new BigDecimal("3");
        BigDecimal b5 = new BigDecimal("11");
        System.out.println(b4.divide(b5,2,BigDecimal.ROUND_UP));//0.2727272727 ≈ 0.28
        System.out.println(b4.divide(b5)); //3 / 11，报错，异常，数学计算异常，需要指定保留小数位数



    }
}
