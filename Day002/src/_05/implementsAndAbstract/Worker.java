package _05.implementsAndAbstract;

public class Worker extends parent implements Smoking{
    @Override
    public void smoking() {
        System.out.println(getName()+"工人抽烟");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"工人吃饭");
    }

    public void work(){
        System.out.println(getName()+"工人工作");
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    public Worker() {
    }
}
