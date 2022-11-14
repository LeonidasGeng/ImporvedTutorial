package com.itheima._05成员内部类_了解;
/*
目标:了解成员内部类的使用

讲解:
    成员位置: 类中方法外
    局部位置: 方法中

    成员内部类: 在类中方法外的类

    成员内部类的使用
        1.创建外部类对象
        2.通过外部类对象创建内部类对象

    成员内部类的好处
        可以直接使用外部类的成员(成员变量,成员方法)

    内部类编译后的结果:
        外部类名$内部类名.class
        Body$Heart.class
 */
public class Demo05 {
    public static void main(String[] args) {
        // 1.创建外部类对象
        Body body = new Body();

        // 2.通过外部类对象创建内部类对象
        Body.Heart heart = body.new Heart();

        // 在网络上.可能会看到这样创建内部类,不推荐, 没有保存外部类对象
        // Body.Heart heart2 = new Body().new Heart();

        // 3.调用内部类方法
        heart.jump();

        body.isLive = false;//修改成员变量
        heart.jump();
    }
}
