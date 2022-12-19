package _07.enumeration;

public class Person {
    private String name;
    private Gender gender;

    //加参数构造器
    //加getter，setter
    public Person() {
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void print(){
        System.out.println("方法1："+name+"的性别是"+gender);
    }
}
