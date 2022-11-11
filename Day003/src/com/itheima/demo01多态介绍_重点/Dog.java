package com.itheima.demo01多态介绍_重点;

public class Dog extends Animal {
    @Override
    public void eat() {

        System.out.println("狗吃骨头");
    }

    // 特有方法(看家)
    public void lookHome() {

        System.out.println("狗看家");
    }
}
