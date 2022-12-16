package _00.ImplementAndAbstractCase;

public class Teacher extends Person implements Swimming{

    @Override
    public void eat() {
        System.out.println(getName()+"老师吃饭");
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"老师游泳");

    }

    public void teach(){
        System.out.println(getName()+"老师上课");

    }

    public Teacher() {
    }

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }
}
