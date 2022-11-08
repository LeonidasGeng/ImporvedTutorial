package _08ThisAndSuper;

public class dog {
    private String name;
    private int age;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public dog() {
    }

    //搞一个两个参数的构造器
    public dog(String name,int age){
        //调用本类其他构造器
        this(name,age,"黑色");
    }
}
