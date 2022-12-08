package _02.Objects;

public class demo02 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("小李", 18);;
        Teacher t2 = new Teacher("小李", 18);
        Teacher t3 = new Teacher("小胡", 18);

        System.out.println("t1和t2一样吗？"+t1.equals(t2));
        System.out.println("t2和t3一样吗？"+t2.equals(t3));
    }
}
