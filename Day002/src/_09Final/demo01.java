package _09Final;

import org.w3c.dom.ls.LSOutput;

/*
final:
含义：不可变的
final作用范围：
1，类
2，方法
3，变量

 */
//final可以修饰类，这个类不能被继承
final class demo001{};
//class demo002 extends demo001;//不能继承demo001


//final修饰method
//final修饰的method不能被重写
class demo002{
    public final void print() {
        //final 修饰变量，这个变量只能使用一次等号=赋值
        final int a = 10;
        System.out.println("我是parent class");
    }
}
//final修饰的method不能被重写
//class demo003 extends demo002{
//    public void print() {
//        System.out.println("我是child class");
//    }
//}


