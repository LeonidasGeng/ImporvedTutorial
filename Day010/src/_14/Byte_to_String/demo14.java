package _14.Byte_to_String;

import java.util.Arrays;

public class demo14 {
    public static void main(String[] args) {
        //String 转 byte[]
        String str = "您好";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] b = {1,2,3};
        //byte[]转String
        //String(byte[] bytes)
        String str2 = new String(b);
        System.out.println("str2" + str2);

        //转数组的一部分
        //String(byte[] bytes,int offset, int length)
        String str3 = new String(b, 0, 3);
        System.out.println("str3" + str3);


    }
}
