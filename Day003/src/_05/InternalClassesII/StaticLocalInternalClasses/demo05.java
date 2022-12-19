package _05.InternalClassesII.StaticLocalInternalClasses;
/*
静态内部类
静态只能使用静态
static修饰的内部类

直接创建静态内部类
外部类名.内部类名 变量名 = new 外部类名.内部类名();
 */
public class demo05 {
    public static void main(String[] args) {
        //1,直接创建静态内部类
        //外部类名.内部类名 变量名 = new 外部类名.内部类名();
             Body.Heart  heart = new Body.    Heart();

        //3,调用内部类方法
        heart.life();
        System.out.println("================================");
        Body.isAlive=false;
        heart.life();
    }
}
