package _03.generic_泛型.staticForMethod;

public class Student {
    String name;
    static String schoolName;

    //写方法1
    public void show(){
        System.out.println(name);
    }

    //写方法2,静态方法
    //同一个类中，静态方法只能使用静态修饰的内容（成员变量和成员方法）
    public static void show2(){
        System.out.println(schoolName);
    }
    public static void show3(){

    }

    public void show4(){

    }

    public static void check(){
        //静态方法中不能用this
        //this是调用对象，static是调用方法，会报错
        System.out.println(schoolName);
        show2();

        //System.out.println(name); 报错，无法使用，name不是静态变量
        //show(); 报错，无法使用，show不是静态方法
    }
}
