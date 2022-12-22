package _01.HashMap_for_Custom_Object;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
学生
姓名，年龄，家庭住址
*姓名+年龄相同则视为同一学生
以学生为键，家庭住址为值

实现步骤
1，定义学生类
2，创建HashMap集合对象
3，创建学生对象
4，把学生添加到集合
5，遍历集合

 */
public class demo01 {
    public static void main(String[] args) {
//        1，定义学生类，已完成
//        2，创建HashMap集合对象
        Map<Student, String> map = new HashMap<>();
//        3，创建学生对象
        Student s1 = new Student("马蓉", 18);
        Student s2 = new Student("白百合", 19);
        Student s3 = new Student("张柏芝", 16);
        Student s4 = new Student("李小璐", 17);
        Student s5 = new Student("李小璐", 17);
//        4，把学生添加到集合
        map.put(s1,"北京");
        map.put(s2,"上海");
        map.put(s3,"香港");
        map.put(s4,"成都");
        map.put(s5,"重庆");//重复的键值对，后面的覆盖前面的
//        5，遍历集合
        //5.1获取所有的Entry
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        //5.2遍历获取每个Entry
        for (Map.Entry<Student, String> entry : entrySet) {
            //5.3获取所有的键和值
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
