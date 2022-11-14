package com.itheima._06成员内部类面试题_了解;

/*
目标:了解内部类如何访问外部类成员变量
 */
public class Demo06 {
    public static void main(String[] args) {
        Body b = new Body();
        Body.Heart heart = b.new Heart();
        heart.jump();
    }
}

class Body { // 身体    
    private int weight = 30;

    // 在成员位置定义一个类
    class Heart {
        private int weight = 20;

        public void jump() {
            int weight = 10;
            System.out.println("心脏在跳动 " + weight); // 10
            System.out.println("心脏在跳动 " + this.weight); // 20
            System.out.println("心脏在跳动 " + Body.this.weight); // 30  外部类名.this.成员变量: 访问外部类的成员变量
        }
    }
}