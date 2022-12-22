package _01.HashMap_for_Custom_Object.ObjectEquals;

import java.util.Objects;

public class Teacher {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        //判断是否是同一个对象
        if (this == o) return true;

        //如果if语句中只有一句代码，可以省略{}的
        //类型不同，返回false
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Teacher teacher = (Teacher) o;
        //年龄不同，返回false
        if (age != teacher.age) return false;
        //判断name是否为空
        //贩毒案名字是否相同
        return Objects.equals(name, teacher.name);
    }


    public Teacher() {
    }

    public Teacher(String name, int age) {
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
