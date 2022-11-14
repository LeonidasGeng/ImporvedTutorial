package com.itheima._01多态polymorphism介绍_重点;

public class Dog extends Animal{
   //狗吃骨头
    public void eat(){
        System.out.println("狗吃骨头");
    }

    //狗，特有方法，看家
    public void lookHome(){
        System.out.println("狗看家");
    }

}
