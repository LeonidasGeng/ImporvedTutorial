package _05.Error_and_Exception;
/*
勇敢面对异常，读异常类型和原因，分析异常信息，解决问题

程序可能出现不正常的情况

错误类型：
    1，Error 错误
        严重的问题，通过代码无法处理
        例：电源断了
    2，Exception 异常
        可以通过代码处理
        2.1编译时异常
            例：必须去医院，治疗
        2.2运行时异常
            例：可以不去医院，自愈
 */
public class demo05_01 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        int num = arr[6];
        System.out.println(num);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 3
        //	at _05.Error.demo05_01.main(demo05_01.java:8)
        //异常的类型：java.lang.ArrayIndexOutOfBoundsException
        //异常的原因：Index 6 out of bounds for length 3
    }
}
