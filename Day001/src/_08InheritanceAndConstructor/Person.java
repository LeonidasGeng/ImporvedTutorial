package _08InheritanceAndConstructor;

//人

public class Person {
    //姓名
    private String name;
    //年龄
    private int age;

    public Person(){
        System.out.println("父类 Person 无参构造");

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类 Person 满参构造");
    }

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
