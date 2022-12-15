package _04.staticTools;

import java.util.Random;

public class codeUtilities {
    //生成验证码的方法
    public static String getCode(){
        Random random = new Random();
        StringBuilder sB = new StringBuilder();//创建字符串合集
        //生成4个验证码
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(10);//10: 0~9
            sB.append(i1);
        }
        return sB.toString();
    }
}
