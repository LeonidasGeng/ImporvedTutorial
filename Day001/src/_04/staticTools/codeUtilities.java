package _04.staticTools;

import java.util.Random;

public class codeUtilities {
    //生成验证码的方法
    public static String getCode(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        //生成4个验证码
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(10);
            stringBuilder.append(i1);

        }
        return stringBuilder.toString();
    }
}
