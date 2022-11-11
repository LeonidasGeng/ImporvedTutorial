package _07InterfaceAndAbstractPractice;


import java.util.Random;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //创建学生
        Student s1 = new Student("小李",18);
        //也是可以的
        //s1.setName("小李");
        //s1.setAge(18);
        s1.eat();
        s1.smoking();
        s1.Study();
        //创建老师
        Teacher t1 = new Teacher("小胡",16);
        //也是可以的
        //t1.setName("小胡");
        //t1.setAge(16);
        t1.eat();
        t1.Swimming();
        t1.teach();

    }
}
