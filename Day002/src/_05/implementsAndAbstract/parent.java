package _05.implementsAndAbstract;

public abstract class parent {
    private String name;
    private int age;

    public parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public parent() {
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
