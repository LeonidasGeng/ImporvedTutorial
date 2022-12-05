package _01.review;

public class Student {
    private String name;
    private int age;
    public void eat(){
        System.out.println(name+"今年"+age+"岁了，"+"在吃饭");

    }

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
