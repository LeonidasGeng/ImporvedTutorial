package _05.inheritance;
/*
父类：
姓名，年龄，吃饭

子类1: 学生
成绩，学习
子类2: 老师
工资，教学

 */
//父类
public class parents {
    String name;
    int age;
    public void eat(){
        System.out.println(name+",他年龄为"+age+",在吃饭");
    }
}
