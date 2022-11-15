package com.itheima._11枚举_不使用枚举存在的问题;

/*
目标:了解不使用枚举存在的问题
    不使用枚举,性别可以随便写,造成非法的数据.
 */
public class Demo11 {
    public static void main(String[] args) {
        // 性别的类型是字符串,性别可以随便写,造成非法的数据.
        // Person p = new Person("凤姐", "女");
        Person p = new Person("凤姐", "呵呵");
    }
}
