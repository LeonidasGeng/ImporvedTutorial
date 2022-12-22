package _01.HashMap_for_Custom_Object.review;

public class Student {
    //↓此name是成员变量
    private String name;
    private int age;
    public void eat(){
        System.out.println(name+"今年"+age+"岁了，"+"在吃饭");

    }

    //↓此name是区部变量
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }
}
