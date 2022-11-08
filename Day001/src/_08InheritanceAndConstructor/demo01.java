package _08InheritanceAndConstructor;
/*
人：姓名，年龄
学生：姓名，年龄

子类所有的构造器都会默认先访问父类中无参的构造器，再执行自己
Why?
因为子类会继承父类中的数据，可能还会使用父类的数据，所以子类初始化之前，一定要先完成父类数据的初始化

子类构造器的第一句都是默认super(); 不写也会有

子类无参调用父类无参构造
子类满参调用父类满参构造
 */
public class demo01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("小李",18);

    }
}
