package _01.Lambda01;
/*
***面向对象语法的弊端
1。定义类
2.创建对象
3.使用对象，使用成员变量，成员方法

Lambda 是JDK8开始后新的语法形式

★简化匿名内部类的书写
原来：面向对象
     public static void test01(){};
现在：👇
() -> {

}

*最简单，没有参数，没有返回值

(): 参数列表

{
      }方法体

-> 没有特殊含义，起连接作用

 */
public class demo01 {
    public static void main(String[] args) {
        //使用匿名内部类创建线程
        //Thread(Runnable target)
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名内部类");
            }
        });

        //使用Lamda表达式创建线程(Lambda表达式相当于对抽象方法的重写)
        Thread t2 = new Thread(()->{
            System.out.println("我是Lambda表达式");
        });
    }
}
