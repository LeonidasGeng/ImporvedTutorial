package _08InheritanceAndConstructor;

public class Student extends Person {
    public Student(){
        super();
        System.out.println("子类 Student 无参构造");
    }

    public Student(String name, int age) {
        super();
        System.out.println("子类 Student 满参构造");

    }



}
