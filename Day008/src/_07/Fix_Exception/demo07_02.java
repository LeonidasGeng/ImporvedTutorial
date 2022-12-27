package _07.Fix_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
try……catch

try{
    可能出现异常的代码
}catch(异常类名 变量名){
    异常的处理代码
}

好处：
    可以让代码继续往下执行

细节：
    处理异常可以写父类

快捷键：
    1，alt+回车 选第二个，复杂
    2，框住有可能有异常的代码 ctrl + alt + t ->try/catch

catch捕获异常后
getMessages();  返回异常原因信息
toString();     返回异常详细信息
printStackTrace();  内部打印异常信息
 */
public class demo07_02 {
    public static void main(String[] args) {
        test01();
        test02();
    }
    public static void test01() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = sdf.parse("2022-2月22日");
            System.out.println("parse = "+parse);
        } catch (ParseException e) {
            System.out.println("我处理了异常");
            System.out.println(e.getMessage());//返回异常简短信息
            System.out.println("====================");
            System.out.println(e.toString());//返回异常详细信息
            System.out.println("====================");
            e.printStackTrace();//内部打印异常信息
        }
    }

    public static void test02() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1 = sdf.parse("2022-2-22 22:22:22");
            System.out.println(d1);
        } catch (ParseException e) {
        //} catch (Exception e) {
            System.out.println("我处理了异常"); //以后可以把异常信息保存到文件中，或者通过网页给用户提示
        }

        System.out.println("我可以运行吗？");
    }
}
