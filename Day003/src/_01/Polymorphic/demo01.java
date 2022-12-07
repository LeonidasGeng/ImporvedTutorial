package _01.Polymorphic;
/*
概念：
一类事物的多种形态

父类 变量名 = new 子类();
接口 变量名 = new 实现类();

多态的前提
1，有继承/实现关系
2，要有方法重写

多态好处
左边写父类，右边可以是任意子类，提高代码扩展性
 */

public class demo01 {
    public static void main(String[] args) {
        //以前我们创建对象
        //类名 变量名 = new 类名();
        //Dog d = new Dog();

        //多态
        //父类/接口 变量名 = new 子类/实现类();
        Animal ad = new Dog();
        ad.eat();

        Animal ac = new Cat();
        ac.eat();
        //不能调用子类特有方法
        //ac.catchMouse(); 报错
        //使用

    }

    //多态真正运用场景
    //可以传入所有的动物，调用eat方法，eat();
    public static void go(Dog d){
        d.eat();
    }
}
