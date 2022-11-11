package com.itheima.demo12枚举的使用;

public class Person {
    private String name; // 姓名
    private Gender sex; // 性别

    public Person() {
    }

    public Person(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
}
