package _08.codeBlock;

/*
执行结果
静态代码块
构造代码块
我是无参构造器
=======================
构造代码块
我是无参构造器

结论
1，静态代码块执行一次，且是最早执行的
2，构造代码块：每次调用构造器前执行

静态代码块的作用
给静态成员变量赋值，适合资源初始化

 */
public class demo08 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("=======================");
        Student s2 = new Student();
        System.out.println("=======================");
        Student s3 = new Student();
    }
}
