package _04.staticTools;
/*
Encapsulation封装一个工具，供使用
1，方便使用
2，调用方便
 */
public class demo04 {
    public static void main(String[] args) {
        /*
        //类是public，无static
        //假设该程序有3个地方要生成验证码
        //第1处，创建对象，调用方法
        codeUtilities cl1 = new codeUtilities();
        System.out.println(cl1.getCode());

        //第2处，创建对象，调用方法
        codeUtilities cl2 = new codeUtilities();
        System.out.println(cl2.getCode());

        //第3处，创建对象，调用方法
        codeUtilities cl3 = new codeUtilities();
        System.out.println(cl3.getCode());
        */

        //把类变为static，用类名去调用，更快更容易，方便简单
        System.out.println(codeUtilities.getCode());//第1处
        System.out.println(codeUtilities.getCode());//第2处
        System.out.println(codeUtilities.getCode());//第3处

    }
}
