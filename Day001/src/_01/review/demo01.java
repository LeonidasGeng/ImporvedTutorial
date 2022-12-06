package _01.review;

/*
回顾面向对象的知识点

1，类的定义格式
    class 类名{
        成员变量
        成员方法
        构造器
    }

2，创建对象的格式
    类名 变量名 = new 类名();

3，定义一个学生类，包含姓名，年龄，吃饭，创建一个学生对象

4，面向对象3大特征，封装，继承，多态

5，this 关键字

6，构造方法，构造器的格式



 */
public class demo01 {
    public static void main(String[] args) {
        Student s1 = new Student("小李",28);
        s1.eat();
    }
}
