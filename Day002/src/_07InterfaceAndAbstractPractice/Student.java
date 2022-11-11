package _07InterfaceAndAbstractPractice;
/*
学生继承人类，继承抽烟接口
 */
public class Student extends Person implements Smoking{
    @Override
    public void eat() {
        System.out.println("学生名叫："+getName("小李")+",他"+getAge()+"岁了, 他喜欢吃饭");
    }

    @Override
    public void smoking() {
        System.out.println("学生名叫："+getName("小李")+",他"+getAge()+"岁了, 他喜欢抽烟");
    }

    public void Study(){
        System.out.println("学生名叫："+getName("小李")+",他"+getAge()+"岁了, 他喜欢学习");
    }

    //记得生成构造器
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
