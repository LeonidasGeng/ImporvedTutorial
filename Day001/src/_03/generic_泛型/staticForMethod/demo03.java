package _03.generic_泛型.staticForMethod;
/*
格式
修饰符 static 返回值类型 方法名(){
    ......
}
 */
public class demo03 {
    public static void main(String[] args) { //语法设计，不用管
        //普通方法使用对象调用，先创建对象
        Student s1 = new Student();
        s1.show();

        //静态方法可以使用对象名调用，可以使用类名调用
        //推荐使用类名调用Student.check();
        s1.check();
        //推荐👇
        Student.check();

        //因为main方法是静态的，只能使用本类静态的方法
        //test01();报错，无法使用,test01()不是静态方法
        test02();
    }

    public void test01(){

    }
    public static void test02(){

    }
}
