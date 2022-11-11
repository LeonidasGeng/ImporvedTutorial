package _10CodeModule;

public class Student {
    public Student(){
        System.out.println("我是无参构造器");
    }

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }
}
