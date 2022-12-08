package _01.ObjectEquals;
/*
Object类中有equals(Object ob)
    Object类中equals默认比较对象的地址

想比较对象的成员变量
重写equals方法
 */
public class demo01 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("小李", 18);
        Teacher t2 = new Teacher("小胡", 18);

        System.out.println(t1==t2);

        System.out.println(t1.equals(t2));

    }
}
