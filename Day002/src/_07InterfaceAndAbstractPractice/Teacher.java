package _07InterfaceAndAbstractPractice;

public class Teacher extends Person implements Swimming{
    @Override
    public void eat() {
        System.out.println("老师名叫："+getName("小李")+",他"+getAge()+"岁了, 他喜欢吃饭");
    }

    @Override
    public void Swimming() {
        System.out.println("老师名叫："+getName("小李")+",他"+getAge()+"岁了, 他喜欢游泳");
    }

    public void teach(){
        System.out.println("老师名叫："+getName("小李")+",他"+getAge()+"岁了, 他喜欢教学");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
