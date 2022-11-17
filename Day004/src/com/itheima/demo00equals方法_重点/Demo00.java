package com.itheima.demo00equals方法_重点;

/*
目标:学习equals方法的作用

讲解:
    ==:
        基本数据类型比较数据的值是否相等
        引用数据类型比较对象的地址是否相等

    Object类中有equals(Object obj)
        Object类中equals默认比较对象的地址

    我们不想比较对象的地址,我们想比较对象的成员变量怎么办?
        重写equals方法即可

        快捷键: alt + insert -> equals() and hashCode()
 */
public class Demo00 {
    public static void main(String[] args) {
        // 基本数据类型比较数据的值是否相等
        System.out.println(3 == 5);

        Teacher t1 = new Teacher("王老师", 18);
        Teacher t2 = new Teacher("王老师", 22);
        // 引用数据类型比较对象的地址是否相等
        // System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));

        /*  Object源码
            class Object {
                public boolean equals(Object obj) {
                    // this: t1
                    // obj: t2
                    return (this == obj);
                    return (t1 == t2); // 比较地址
                }
            }
         */
    }
}
