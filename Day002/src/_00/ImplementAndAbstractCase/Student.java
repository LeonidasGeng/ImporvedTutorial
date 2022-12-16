package _00.ImplementAndAbstractCase;
public class Student extends Person implements Smoking{


    @Override
    public void eat() {
        System.out.println(getName()+"学生吃饭");
    }

    @Override
    public void smoking() {
        System.out.println(getName()+"学生抽烟");
    }
    public void study() {
        System.out.println(getName()+"学生学习");
    }

    public Student() {
    }

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }
}
