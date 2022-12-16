package _00.ImplementAndAbstractCase;

public class Driver extends Person implements Swimming{

    @Override
    public void eat() {
        System.out.println(getName()+"司机吃饭");

    }

    @Override
    public void swimming() {
        System.out.println(getName()+"司机游泳");

    }

    public Driver() {
    }

    public Driver(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void drive() {
        System.out.println(getName()+"司机开车");

    }
}
