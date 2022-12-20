package _02.TreeSetCase;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        //this
        //o===>传入的
        //这两个进行比较
        return o.age-this.age;//升序（默认）
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
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



}



