package com.itheima._07静态成员内部类_了解;
/*
目标:了解静态成员内部类的创建和使用

讲解:
    什么是静态成员内部类
        在成员内部类的前面添加static修饰

    注意:静态成员内部类只能使用外部类静态修饰的成员
        静态修饰的内容只能访问静态修饰的内容

    静态内部类的创建格式
        直接创建静态内部类
        外部类名.内部类名 变量名 = new 外部类名.内部类名();
 */
public class Demo07 {

    public static void main(String[] args) {
        //已经变为静态成员内部类了
        // 外部类名.内部类名 变量名 = new 外部类名.内部类名();
        Body.Heart heart = new Body.Heart();
        heart.jump();

        Body.isLive = false;//修改成员变量
        heart.jump();
    }
}
