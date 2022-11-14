package com.itheima._01多态polymorphism介绍_重点;

public class Cat extends Animal {
    //猫继承方法
   public void eat(){
       System.out.println("猫吃鱼");
   }
   //猫，特有方法，抓老鼠
   public void catchMouse(){
       System.out.println("猫抓老鼠");
   }
}
