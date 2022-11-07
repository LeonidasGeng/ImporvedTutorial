package _01Review;

public class Student {

    String name;

    int age;

    String gender;

    //constructor 无返回值，不能写void，写了void就变成了普通的方法

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public void print(){
        System.out.println(name+"在吃饭");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
