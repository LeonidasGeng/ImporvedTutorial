package _10.HashSetCase;

import java.util.HashSet;
import java.util.Set;

/*
创建4个学生储存到HashSet中，包含姓名，年龄，分数

姓名，年龄，分数相同的可看作一个人


1，定义学生类
2，创建HashSet集合
3，创建学生对象
4，把学生添加到集合
5，遍历集合(增强for)
 */
public class demo10 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        //创建学生对象
        Student s1 = new Student("流川枫", 18, 66);
        Student s2 = new Student("樱木花道", 17, 77);
        Student s3 = new Student("宫城良田", 19, 88);
        Student s4 = new Student("赤木刚宪", 16, 99);
        Student s5 = new Student("赤木刚宪", 16, 99);

        //把学生添加到集合
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        //遍历集合(增强for)
        for (Student s : set) {
            System.out.println(s);
        }


    }
}
