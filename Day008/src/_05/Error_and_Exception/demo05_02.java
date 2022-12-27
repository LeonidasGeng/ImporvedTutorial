package _05.Error_and_Exception;

import java.util.Date;

public class demo05_02 {
    //运行时异常
    public static void main(String[] args) {
//        //数组索引越界异常，运行时异常
//        int[] arr={11,22,33};
//        int num = arr[6];
//        System.out.println(num);
//        //ArrayIndexOutOfBoundsException

//        //空指针异常，运行时异常
//        String str = null;
//        System.out.println(str.length());
//        //NullPointerException

//          //类型转换异常，运行时异常
//        Object obj = new String("aaa");
//        Date d =(Date) obj;
//        System.out.println(d);
//        //ClassCastException

        //数学计算异常，运行时异常
        int a = 10/0;
        System.out.println(a);
        //ArithmeticException



    }
}
