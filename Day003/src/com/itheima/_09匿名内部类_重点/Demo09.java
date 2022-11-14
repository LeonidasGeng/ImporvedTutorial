package com.itheima._09匿名内部类_重点;
/*
目标:学习匿名内部类的格式和使用

讲解:
    接口的使用
        1.定义类实现接口
        2.重写抽象方法
        3.使用实现类

    什么是匿名内部类
        匿名: 没有名字
        匿名内部类: 没有名字的内部类

    匿名内部类的格式(重点)
        父类/接口 对象名 = new 父类/接口() {
            重写方法
        }

    匿名内部类的好处
        简化代码,快速定义子类去使用
 */
public class Demo09 {
    public static void main(String[] args) {
        // 3.使用实现类，使用Student类创建对象，与下面的含义一样
        Student s1 = new Student();
        //使用s1对象调用方法
        s1.swimming();

        // 匿名内部类
        // 局部内部类编译后: 外部类名$数字内部类名.class
        // 匿名内部类编译后: Demo09$1.class

        //也是定义一个类，但没名字，所以叫匿名内部类
        Swimmable s2 = new Swimmable() {
            @Override
            public void swimming() { //👇这个没有名字的类，实现了接口
                System.out.println("匿名内部类，狗刨式游泳!");
            }
        };
        s2.swimming();

    }
}
