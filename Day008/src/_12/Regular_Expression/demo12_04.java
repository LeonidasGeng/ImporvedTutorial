package _12.Regular_Expression;
/*
判断是否是手机号
 */
public class demo12_04 {
    public static void main(String[] args) {
        //手机号规则
        //1，11位数字
        //2，第一位是1
        //3.第二位只能是35789中的一位
        //                                                 👇第二位是35789中的一个
        //                                             👇第一位是1
        System.out.println("15956000506".matches("1[35789]\\d{9}"));
        //                                                         👆后面9个数字是0-9中的任意一位
        //                                                     \\d=[0-9]
        System.out.println("15956000506".matches("1[35789][0-9]{9}"));
    }
}
