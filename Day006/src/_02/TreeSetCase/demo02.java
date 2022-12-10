package _02.TreeSetCase;

import java.util.Comparator;
import java.util.TreeSet;

/*
学生年龄从小到大排列

1，定义学生类
2，创建TresSet集合对象
3，创建学生对象
4，把学生对象添加到集合
5，遍历集合

 */
public class demo02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        //创建TreeSet集合对象，使用比较器排序
        new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()- o1.getAge();
            }
        });

        //创建学生对象
        Student s1 = new Student("大花",18);
        Student s2 = new Student("中花",17);
        Student s3 = new Student("小花",16);

        //学生对象添加到集合
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
