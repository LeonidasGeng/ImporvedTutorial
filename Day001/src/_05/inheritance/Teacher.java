package _05.inheritance;
//             老师    继承    人类
public class Teacher extends Person {
    double salary;
    public void teach(){
        System.out.println(name+",他年龄为"+age+",在教学。他的工资是每月"+salary+"元");
    }
}
