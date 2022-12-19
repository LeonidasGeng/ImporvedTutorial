package _09.Object.ToString;

public class Person {
    private String name;
    private int age;

    //重写方法
    //右键选择toString()
    @Override
    public String toString() {
        return "名字是" + name +
                ", 年龄是" + age;
    }
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
