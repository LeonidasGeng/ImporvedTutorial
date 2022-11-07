package _03staticForMethonds;
/*
如果一个方法，不会使用普通成员变量，可以考虑使用静态方法
如果一个方法，会使用普通成员变量，必须是普通方法

 */
public class demo01 {
    public static void main(String[] args) {
        //普通方法使用对象调用
        Student s = new Student();
        s.show();

        //静态方法可以使用对象名调用，可以使用类名调用
        Student.check2();//推荐
        s.check2();      //不推荐

        //main方法是静态的，只能使用本类静态方法
//        test01();//不可调用
        test02();//可调用
    }

    public void test01(){

    }

    public static void test02(){

    }
}
