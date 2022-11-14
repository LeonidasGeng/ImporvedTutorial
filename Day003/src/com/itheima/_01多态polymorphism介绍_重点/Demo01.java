package com.itheima._01多态polymorphism介绍_重点;

/*
目标:学习多态polymorphism概念

讲解:
    面向对象三大特性: 封装,继承,多态

    多态的概念: 一类事物的多种形态
        H2O:
            常温:水
            低温:冰
            高温:水蒸气

    多态的格式(重点): 父类引用指向子类对象
        1.父类 变量名 = new 子类();
        2.接口 变量名 = new 实现类();

    多态的前提:
        1.有继承/实现关系
        2.要有方法重写

    多态的细节:
        走右边的重写方法

    多态好处:
        左边写父类,右边可以是任意子类,提高代码扩展性

    多态: 编译看左边,运行看右边
 */
public class Demo01 {
    public static void main(String[] args) {
        // 以前我们创建对象:
        // 类名 变量名 = new 类名();
        //Dog d = new Dog();
        //1, Cat c = new Cat();

        // 多态:
        // 父类/接口 变量名 = new 子类/实现类();
        Animal a = new Dog();
        a.eat();
        //想在Dog里使用cat的catchMouse;
        //1, c.catchMouse();
//        ((Cat)a).catchMouse();
        Animal b = new Cat();
        b.eat();
        // a.catchMouse();

        // 你使用
        //go(d);
        //go(c);
    }

    // 多态的真正运用场景(假设你同事写了一个方法)
    // 多态的好处: 方法参数写父类,可以传入任意子类,提高代码的扩展性
    // 可以传入所有的动物,调用eat方法，方法名取go
    // go(d);             Animal a = new Dog();
    // go(c);             Animal a = new Cat();
//    public static void go(Animal a) {
//        a.eat();
//    }

    // go(d);             Dog d = new Dog();
    // go(c);             Dog d = new Cat();
//    public static void go(Dog d) {
//        d.eat();
//    }
//
//    // go(c);             Cat c = new Cat();
//    //重载
//    public static void go(Cat c) {
//        c.eat();
//    }
}