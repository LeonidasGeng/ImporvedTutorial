package _07InterfaceAndAbstractPractice;

public abstract class Person {
    private String name;
    private int age;
    public abstract void eat();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(String 小李) {
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
