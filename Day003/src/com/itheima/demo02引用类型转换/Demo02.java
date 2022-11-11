package com.itheima.demo02引用类型转换;

import com.itheima.demo01多态介绍_重点.Animal;
import com.itheima.demo01多态介绍_重点.Cat;
import com.itheima.demo01多态介绍_重点.Dog;

/*
目标:学习引用类型转换

讲解:
    多态的弊端:
        无法调用子类的特有方法

    引用类型转换: 子类和父类之间的转换
        向上转型: 将子类转成父类 父类 变量名 = new 子类();
        向下转型: 将父类转成子类 子类 变量名 = (子类)父类对象;

    向下转型的好处: 调用子类的特有方法

    instanceof关键字格式: 变量名 instanceof 类名
    instanceof关键字作用: 判断变量是否是这种类型
 */
public class Demo02 {
    public static void main(String[] args) {
        // 向上转型: 将子类转成父类 父类 变量名 = new 子类();
        Animal a = new Cat();
        // 多态:编译看左边,运行看右边
        a.eat();
        // 判断对象的类型: 判断变量a是否是Dog类型
        boolean b = a instanceof Dog;
        System.out.println("b = " + b);

        if (b) {
            // 向下转型: 将父类转成子类 子类 变量名 = (子类)父类对象;
            Dog d = (Dog) a; // ClassCastException: 类型转换异常
            d.lookHome();
        } else {
            System.out.println("a 不是Dog类型");
        }
    }
}
