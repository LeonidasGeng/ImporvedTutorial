package com.itheima._07静态成员内部类_了解;

public class Body {
    // 类中方法外(成员位置)
    public static boolean isLive = true; // 成员变量

    public static void walk() { // 成员方法
        System.out.println("人没病，并且走了一步");
    }

    // 静态成员内部类
    static class Heart {
        public void jump() {
            if (isLive) {
                System.out.println("人活着, 心脏跳动了一下!");
                walk();
            } else {
                System.out.println("人彻底凉凉了!");
            }
        }
    }
}
