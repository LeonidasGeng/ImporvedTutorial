package _10.HashSetCase;

import java.util.HashSet;
import java.util.Set;

/*
创建4个学生储存到HashSet中，包含姓名，年龄，分数

姓名，年龄，分数相同的可看作一个人，不存储

1，定义学生类
2，创建HashSet集合
3，创建学生对象
4，把学生添加到集合
5，遍历集合(增强for)

Object类中
        hashCode()和equals()

    *如果是我们自定义的类放在HashSet中需要重写hashCode()和equals()来去除重复
    *放在HashSet中的元素要去除重复,需要重写hashCode()和equals()方法

    hashCode相同,equals为true的就认为是重复.不存储
 */
public class demo10 {
    public static void main(String[] args) {
        //  👇储存学生类型
        Set<Student> set = new HashSet<>();

        //创建学生对象
        Student s1 = new Student("流川枫", 16, 66);
        Student s2 = new Student("樱木花道", 16, 77);
        Student s3 = new Student("宫城良田", 17, 88);
        Student s4 = new Student("赤木刚宪", 18, 99);
        //再加一个赤木刚宪，共5个数据，但4个学生
        Student s5 = new Student("赤木刚宪", 18, 99);

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
