package _05.InternalClassesII;

public class demo05 {
    public static void main(String[] args) {
        //1,创建外部类对象
        Body body = new Body();

        //2,通过外部类对象创建内部类对象
        //                 外部类对象.new +内部类对象().var
        Body.Heart heart = body.new Heart();

        //3,调用内部类方法
        heart.life();
        System.out.println("================================");
        body.isAlive=false;
        heart.life();
    }
}
