package _05.inheritance;
/*
extends

子类自动拥有父类内容

减少代码冗余，提高代码复用性

把子类共性内容抽取到一个类中，子类继承父类
子类中是特有内容
父类中是共有内容

格式：
public class 子类名 extends 父类名{
    ......
}

先写父类，再写子类

 */
public class demo05 {
    public static void main(String[] args) {
        //创建学生，并使用
        Student s1 = new Student();
        s1.name="小李";
        s1.age=28;
        s1.score=99;
        s1.eat();
        s1.study();
        //创建老师，并使用
        Teacher t1 = new Teacher();
        t1.name="小胡";
        t1.age=29;
        t1.salary=8888;
        t1.teach();
        t1.eat();

    }
}
