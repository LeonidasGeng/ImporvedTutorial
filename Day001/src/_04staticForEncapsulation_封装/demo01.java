package _04staticForEncapsulation_封装;

/*
生成验证码
设计一个工具类的好处：
方便使用
提高了代码复用性
 */
public class demo01 {
    public static void main(String[] args) {
        //假设程序3个地方要生成验证码
        //第一个地方要用
        //codeUtilities cu1 = new codeUtilities();
        System.out.println(codeUtilities.getCode());

        //第二个地方要用
        //codeUtilities cu2 = new codeUtilities();
        System.out.println(codeUtilities.getCode());

        //第三个地方要用
        //codeUtilities cu3 = new codeUtilities();
        System.out.println(codeUtilities.getCode());

    }
}
