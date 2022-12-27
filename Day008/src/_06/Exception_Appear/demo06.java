package _06.Exception_Appear;
/*

JVM收到异常
    1，打印异常信息
    2，停止程序

 */

public class demo06 {
    public static void main(String[] args) {
        int[] arr = new int[] {11,22,33};

        int number = getNumber(arr);
        System.out.println("number2 = " + number);

    }

    private static int getNumber(int[] arr) {
        int number = arr[5]; //ArrayIndexOutOfBoundsException
        System.out.println("number1 = " + number);
        return number;
    }
}
