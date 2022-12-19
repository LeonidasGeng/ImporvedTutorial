package _05.InternalClassesII.StaticLocalInternalClasses;

public class Body {
    //类中，方法外（成员位置）
    private String color;//成员变量
    public static boolean isAlive = true;//成员变量

    //成员方法
    public static void eat() {
        System.out.println("吃炸鸡");
    }

    //类中方法外
    //成员位置
    //成员内部类
    static class Heart{
        public void life(){
            if(isAlive){
                System.out.println("人还活着");
                eat();
            }else{
                System.out.println("人死了");
            }
        }
    }
}
