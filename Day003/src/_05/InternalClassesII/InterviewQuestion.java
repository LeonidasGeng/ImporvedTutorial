package _05.InternalClassesII;
/*
外部类型.this.成员变量
访问外部类的成员变量
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        Body2 b2 = new Body2();
        Body2.Heart heart = b2.new Heart();
       heart.jump();
    }
}

class Body2{
    private int weight = 30;

    class Heart{
        private int weight = 20;

        public void jump(){
            int weight = 10;
//        System.out.println("心脏在跳动"+?);//10
            System.out.println("心脏在跳动"+weight);//10
//        System.out.println("心脏在跳动"+?);//20
            System.out.println("心脏在跳动"+this.weight);//20
//        System.out.println("心脏在跳动"+?);//30
            System.out.println("心脏在跳动"+Body2.this.weight);//30

        }
    }


}
