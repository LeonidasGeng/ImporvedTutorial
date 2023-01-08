package _01.JUnit;

import org.junit.Assert;
import org.junit.Test;

/*
步骤
    1，定义测试方法
    2，在方法上添加@test注解
    3，运行测试方法

测试方法的要求
    1，必须是public修饰
    2，返回值必须是void
    3，不能有参数
 */
public class testFirst {
    @Test
    public void test01(){
        System.out.println("I'm unit test");

//        int a =10/0;
//        System.out.println("a= "+a);

        //断言：你觉得
        //assertEquals（真实值，期望值） 你觉得要相等
        int a = 1+2;
        Assert.assertEquals(3,a);
    }
}
