package com.itheima.demo00equals方法_重点;


public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 父类的equals方法不是我们想要的,我们想比较对象的属性,重写equals方法
    // alt + insert -> equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 判断是否是同一个对象

                if (o == null || this.getClass() != o.getClass()) {
            return false; // 类型不同返回false
        }

        Teacher teacher = (Teacher) o; // 向下转型

        if (this.age != teacher.age) return false; // 年龄不同返回false

        // 判断名字是否为null
        // 判断名字是否相同
        return name != null ? name.equals(teacher.name) : teacher.name == null;
    }

    // 父类的equals方法不是我们想要的,我们想比较对象的属性,重写equals方法
    /*@Override
    public boolean equals(Object obj) {
        // this: t1
        // obj: t2
        if (!(obj instanceof Teacher)) {
            return false; // 类型不同
        }

        // 把obj由Object转型Teacher,向下转型,使用子类特有内容
        Teacher t = (Teacher) obj;

        // 比较年龄
        if (this.age != t.age) {
            return false; // 年龄不同
        }

        // 比较姓名
        if (!this.name.equals(t.name)) {
            return false; // 姓名不同
        }

        // 姓名年龄都相同
        return true;
    }*/

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
