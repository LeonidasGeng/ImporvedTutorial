package _09.codeBlock;

public class Student {
    public Student(){
        System.out.println("我是无参构造器");
    }

    //只有一个大括号{ },就是构造代码块
    {
        System.out.println("构造代码块");
    }

    //static{ },静态代码块
    static{
        System.out.println("静态代码块");
    }
}
