package _05.implementsAndAbstract;

public class Teacher extends parent implements Swimming{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"老师游泳");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"老师吃饭");
    }
    public void teach(){
        System.out.println(getName()+"老师上课");
    }
}
