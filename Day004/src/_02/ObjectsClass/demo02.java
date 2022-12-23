package _02.ObjectsClass;

import java.util.Objects;
/*
Objects.isNull()
判断是否为空
 */
public class demo02 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("小李", 18);;
        Teacher t2 = new Teacher("小李", 18);
        Teacher t3 = new Teacher("小胡", 18);
        Teacher t4 = null;

        System.out.println("t1和t2一样吗？"+t1.equals(t2));
        System.out.println("t2和t3一样吗？"+t2.equals(t3));
        System.out.println("t1和t4一样吗？"+t1.equals(t4));

        boolean a = Objects.equals(t1, t2);
        boolean b = Objects.equals(t1, t3);
        boolean c = Objects.equals(t1, t4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(Objects.isNull(t1));
        System.out.println(Objects.isNull(t4));
    }
}
