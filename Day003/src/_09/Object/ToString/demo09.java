package _09.Object.ToString;

import java.util.ArrayList;
/*
toString()存在的意义
美化打印内容
 */
public class demo09 {
    public static void main(String[] args) {
        Person p1 = new Person("小李",18);

        //打印对象，就是调用对象的toString方法进行打印
        System.out.println(p1);
        //👆就是调用对象的toString方法进行打印
        //👇一样，
        //重写了toString方法
        //idea快捷键，在父类中右键选择toString()
        System.out.println(p1.toString());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
    }
}
