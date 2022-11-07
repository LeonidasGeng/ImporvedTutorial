package _01Review;

/*
1,class structure
class className{
    variables
    methods
    constructor;
}

2,object
className variableName = new className();

this.关键字：区分"局部变量"与"成员变量"
name = name ; //局部变量
this.name = name; //成员变量


3, set a Student Class, includes name, age, gender, create Student object

 */
public class demo01 {
    public static void main(String[] args) {
        Student s1 = new Student("李耕",18,"Male");
        s1.print();

    }

}



//一个Java文件里有多个类，但实际工作一个文件只有一个类class，且public修饰的class与文件名相同，其他class不能被public修饰
class teacher{

}

class classmates{

}