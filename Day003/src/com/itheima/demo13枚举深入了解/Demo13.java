package com.itheima.demo13枚举深入了解;
/*
xxx.java -> 编译javac -> xxx.class
xxx.java <- 反编译工具 <- xxx.class

目标:研究枚举的底层

    写一个季节枚举,反编译

枚举的底层:
    1.枚举本质上就是一个类,他继承了Enum
    2.我们写了几个枚举项,就会创建几个枚举对象
    3.构造器是私有的,我们自己不能new枚举对象
    4.枚举是一种多例模式(限量版)
 */
public class Demo13 {
    public static void main(String[] args) {
        // new Season();
    }
}
