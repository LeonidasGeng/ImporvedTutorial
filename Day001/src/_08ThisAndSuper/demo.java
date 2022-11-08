package _08ThisAndSuper;
/*
狗：
名字，年龄，颜色

创建5只狗

 */
public class demo {
    public static void main(String[] args) {
//        dog d1= new dog("旺财",1,"black");
//        dog d2= new dog("大黄",2,"black");
//        dog d3= new dog("小黑",3,"black");
//        dog d4= new dog("旺旺",4,"black");
//        dog d5= new dog("财财",5,"black");
        //简单的封装，默认black黑色
        dog d1= new dog("旺财",1);
        dog d2= new dog("大黄",2);
        dog d3= new dog("小黑",3);
        dog d4= new dog("旺旺",4);
        dog d5= new dog("财财",5);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

    }
}
