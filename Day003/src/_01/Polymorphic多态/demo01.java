package _01.Polymorphic多态;
/*
概念：
一类事物的多种形态
父类引用指向子类对象

1，父类 变量名 = new 子类();
2，接口 变量名 = new 实现类();

多态的前提
1，有继承/实现关系
2，要有方法重写

多态好处
左边写父类，右边可以是任意子类，提高代码扩展性
 */

public class demo01 {
    public static void main(String[] args) {
        //以前我们创建对象，普通的面向对象
        //类名 变量名 = new 类名();
        //Dog d = new Dog();

        //多态
        //父类/接口 变量名 = new 子类/实现类();
        Animal ad = new Dog();
        ad.eat();

        //多态走的是重写方法
        Animal ac = new Cat();
        ac.eat();
        //不能调用子类特有方法
        //ac.catchMouse(); 报错
        //使用

    }

    //多态真正运用场景（假设你同事写了一个方法）
    //可以传入所有的动物，调用eat方法，eat();
    public static void go(Dog d){
        d.eat();
    }
}
