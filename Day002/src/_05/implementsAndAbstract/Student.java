package _05.implementsAndAbstract;

//学生继承父类，实现抽烟接口
public class Student extends parent implements Smoking{
    //子类提供构造器

    public Student(String name, int age) {
        super(name, age);
    }


    public Student() {
    }

    @Override
    public void smoking() {
        System.out.println(getName()+"学生抽烟");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"学生吃饭");
    }

    //特有方法，学习
    public void study(){
        System.out.println(getName()+"学生学习");
    }
}
