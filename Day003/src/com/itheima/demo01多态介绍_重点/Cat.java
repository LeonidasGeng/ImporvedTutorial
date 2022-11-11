package com.itheima.demo01多态介绍_重点;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 特有方法(抓老鼠)
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
