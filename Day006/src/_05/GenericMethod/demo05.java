package _05.GenericMethod;
/*
泛型定义在方法上

泛型方法格式
修饰符 <E> 返回值类型 方法名<E 变量名>{
    xxxxxx
}

和普通方法的区别
    1，在返回值类型前面加<E>
    2，在使用类型的地方换成E
 */
public class demo05 {
    public static void main(String[] args) {

    }

    //泛型方法，在返回值类型前面加一个<>
    public static <E> void show(E e) {
        System.out.println(e);
    }
}
