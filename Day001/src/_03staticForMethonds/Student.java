package _03staticForMethonds;

public class Student {
    String name;
    static String schoolName;

    public void show(){
        System.out.println(name);
    }

    public static void show1(){
        System.out.println();
    }

    //同一个类中，静态方法只能使用静态修饰的内容（成员变量和成员方法)
    public static void check2(){
        //无法使用普通变量和普通方法
//        System.out.println(name);
//        show();
        System.out.println(schoolName);
        show1();

    }


}
