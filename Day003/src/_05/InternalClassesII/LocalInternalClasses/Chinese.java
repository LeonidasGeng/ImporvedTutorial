package _05.InternalClassesII.LocalInternalClasses;

public class Chinese {
    private String color="黄色";
    
    public void  eat(){
        //定义筷子类
        //方法中就是局部位置（局部内部类）
        //方法中的内容只能在本方法中使用
        class Chopisticks{
            private int length = 80;
            public void  use(){
                System.out.println(color+"的中国人使用长度为"+length+"厘米的筷子吃饭");
            }

            
        }
        Chopisticks c = new Chopisticks();
        c.use();

    }

}
