package _05.implementsAndAbstract;

public class Driver extends parent implements Swimming{
    @Override
    public void swimming() {
        System.out.println(getName()+"司机游泳");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"司机吃饭");
    }

    public void driving(){
        System.out.println(getName()+"司机开车");
    }

    public Driver(String name, int age) {
        super(name, age);
    }

    public Driver() {
    }
}
