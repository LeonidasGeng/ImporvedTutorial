package _01AbstractClassAndMethods;
/*
抽象方法是关键

加油站2种打折卡
金卡：8折
银卡：8.5折
都有1：姓名，余额
都有2：支付功能

父类：姓名，余额，支付功能
子类1：支付功能，金卡8折
子类2：支付功能，银卡8.5折


抽象方法abstract method格式：
public abstract 返回值类型 方法名(参数列表);

抽象方法abstract method必须放在抽象类abstract class中
public abstract class 类名{

}

步骤：
1，定义类继承抽象类
2，重写抽象方法
3，创建子类去使用

目的：
抽象类不能创建对象，让子类继承抽象类，重写抽象方法
 */
public class demo01 {
    public static void main(String[] args) {
        //抽象类不能创建对象(实例化)
        //为什么？
        //因为方法是空的，没有方法体，无法执行
//        Card c1 = new Card(); //会报错
        //如何使用？

        //使用子类
        GoldCard c2 = new GoldCard();
        c2.pay();

        SilverCard c3 = new SilverCard();
        c3.pay();
    }
}
