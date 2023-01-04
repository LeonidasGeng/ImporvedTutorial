package _08.Recursion_递归;
/*
recursion
递归
方法自己调用自己

public static void main(String[] args){
    recursion();
}

public static void recursion(){
    System.out.println("here is recursion")
    recursion();
}

递归要在某个时刻停下来
递归的次数不能太多
 */
public class demo08 {
    private static int number;

    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
       
        number++;
        System.out.println(number);

        if (number<500) {
            recursion();
        }
    }
}
