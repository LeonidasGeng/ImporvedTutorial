package _05.implementsAndAbstract;
/*
学生
属性：姓名，年龄
行为：学习，抽烟，吃饭

老师
属性：姓名，年龄
行为：上课，游泳，吃饭

工人
属性：姓名，年龄
行为：工作，抽烟，吃饭

司机
属性：姓名，年龄
行为：开车，游泳，吃饭

父类:
属性：姓名，年龄
行为：吃饭（抽象方法）

接口：
抽烟：抽象方法
游泳：抽象方法

子类：
学生：学习
老师：上课
工人：工作
司机：开车

 */
public class demo05 {
    public static void main(String[] args) {
        //创建学生
        Student s = new Student("小李",18);
        s.eat();
        s.study();
        s.smoking();
        //创建老师

        //创建工人

        //创建司机
    }
}
