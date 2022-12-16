package _00.ImplementAndAbstractCase;

public class Worker extends Person implements Smoking{

    @Override
    public void eat() {
        System.out.println(getName()+"工人吃饭");

    }

    @Override
    public void smoking() {
        System.out.println(getName()+"工人抽烟");

    }

    public void work(){
        System.out.println(getName()+"工人工作");
    }

    public Worker() {
    }

    public Worker(String name, int age, String gender) {
        super(name, age, gender);
    }
}
