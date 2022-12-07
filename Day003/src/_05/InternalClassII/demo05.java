package _05.InternalClassII;

public class demo05 {
    public static void main(String[] args) {
        //创建外部类对象
        Body body = new Body();

        //通过外部类对象创建内部类对象
        Body.Heart heart = body.new Heart();
        heart.life();
        System.out.println("================================");
        body.isAlive=false;
        heart.life();
    }
}
