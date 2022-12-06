package _01.Abstract;
/*
抽象方法：
没有方法体
public abstract 返回值类型 方法名 (参数列表);

抽象方法必须放在抽象类中

抽象类：
public abstract class 类名{
    ......
}
抽象类使用步骤
1，定义类继承抽象类
2，重写抽象方法
3，使用子类对象

目的：
抽象不能创建对象，让子类继承抽象类，重写抽象方法

父类方法可以不写，但实际工作中会出现问题，其他的teammates不知道写什么
 */
public class demo01 {
    public static void main(String[] args) {
        //抽象类不能创建对象（实例化）
        //因为抽象方法没有方法体，无法执行
        //Card c1 = new Card()
        GoldCard c2 = new GoldCard();
        c2.pay();

        SilverCard c3 = new SilverCard();
        c3.pay();
    }
}
