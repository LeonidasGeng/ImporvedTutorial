package com.itheima.demo09匿名内部类_重点;

// 1.定义类实现接口
public class Student implements Swimmable {
    // 2.重写抽象方法
    @Override
    public void swimming() {
        System.out.println("学生蛙泳!");
    }
}
