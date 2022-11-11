package com.itheima.demo08局部内部类_了解;
/*
目标:了解局部内部类的创建和使用

讲解:
    什么是局部内部类
        方法中就是局部位置

    什么是局部内部类
        就是定义在方法中的类

    局部内部类的使用
        在定义局部内部类的下方创建对象去使用

    局部内部类的好处:
        局部内部类可以直接使用外部类的成员

    局部内部类编译后特点
        外部类名$数字内部类名.class
        Chinese$1Chopsticks.class
 */
public class Demo08 {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        chinese.eat();
    }
}