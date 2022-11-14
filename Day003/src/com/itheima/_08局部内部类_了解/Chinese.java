package com.itheima._08局部内部类_了解;

public class Chinese {
    private String color = "黄色";

    public void eat() { //方法中 ↓
        // 定义筷子类
        // 方法中是局部位置(局部内部类), 方法中的内容只能在本方法使用
        class Chopsticks {
            private int lenght = 80; // 成员变量
            public void use() {
                System.out.println(color + "皮肤的人,使用长度为 " + lenght + " 的筷子吃饭");
            }
        }
        //需要立即使用内部类
        Chopsticks c = new Chopsticks();
        c.use();
    }
}
