package com.itheima._09匿名内部类_重点;

// 1-2.定义类实现接口
//定义一个类，叫student
//Student类实现了Swimmable接口
public class Student implements Swimmable {
    // 2.重写抽象方法
    @Override
    public void swimming() {
        System.out.println("学生蛙泳!");
    }
}
