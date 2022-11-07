package _05InheritanceOrExtends_继承;
/*
继承：
解决代码冗余问题
有利于功能的扩展

子类child class会自动拥有父类parent class 的内容

相同的内容放到父类中 parent class

继承格式：
public class 子类名 extends 父类名{

}

把共同所有的内容抽取到父类中
先写父类parent class,再写子类child class

 */
public class demo01 {
    public static void main(String[] args) {
        //创建学生并使用
        _02Student s1 = new _02Student();
        s1.name="小李";
        s1.age=18;
        s1.score=99.99;
        s1.eat();
        s1.study();

        //创建老师并使用
        _03Teacher t1 = new _03Teacher();
        t1.name="小胡";
        t1.age=28;
        t1.salary=999.99;
        t1.eat();
        t1.teach();


    }
}
