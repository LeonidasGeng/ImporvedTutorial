package _01.HashMap_for_Custom_Object.ObjectEquals;
/*
==号作用
可以比较基本数据类型（值）是否相等
可以比较引用数据类型（地址）是否相等

Object类中有equals(Object ob)
    Object类中equals默认比较对象的地址

想比较对象的成员变量
重写equals方法
 */
public class demo01 {
    public static void main(String[] args) {
        //比较值是否相等
        System.out.println("========基本数据类型直接==比较============");
        System.out.println(3==5);

        Teacher t1 = new Teacher("小李", 18);
        Teacher t2 = new Teacher("小胡", 18);
        Teacher t3 = new Teacher("小李", 18);
        System.out.println("========引用数据类型直接==比较============");
        System.out.println(t1==t2);
        System.out.println(t1==t3);
        System.out.println("========使用equals.()============");
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));


    }
}
