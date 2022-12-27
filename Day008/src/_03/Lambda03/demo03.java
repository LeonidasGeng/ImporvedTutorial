package _03.Lambda03;
/*
Lambda表达式的前提
    1，方法参数是接口
    2，接口中只有一个抽象方法
 */
public class demo03 {
    public static void main(String[] args) {
        show(()->{
            
        });
    }

    public static void show(Person p) {
        
    }

    //函数式抽象接口，
    @FunctionalInterface
    interface Person { //方法参数是接口
        public abstract void eat1();
//        public abstract void eat2(); 报错，接口中只有一个抽象方法


    }
    
    
}
