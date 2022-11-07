package _04staticForEncapsulation_封装;

import java.util.Random;

public class codeUtilities {

    private codeUtilities(){

    }
    //生成验证码的方法
    public static String getCode(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int rd = r.nextInt(10);//0~9
            sb.append(rd);
        }
        return sb.toString();
    }
}
