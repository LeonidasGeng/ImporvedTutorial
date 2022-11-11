package com.itheima.demo05成员内部类_了解;

public class Body {
    // 类中方法外(成员位置)
    public boolean isLive = true; // 成员变量

    public void walk() { // 成员方法
        System.out.println("没病走一步");
    }

    // 类中方法外(成员位置)
    class Heart {
        public void jump() {
            if (isLive) {
                System.out.println("人活着, 心脏跳动了一下!");
                walk();
            } else {
                System.out.println("凉凉了!");
            }
        }
    }
}
