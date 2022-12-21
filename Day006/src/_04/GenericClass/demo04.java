package _04.GenericClass;

import java.util.ArrayList;

/*
泛型类
格式
    修饰符 class类名 <名称>{

    }

示例
    //                    👇变量名
    public class ArrayList<T>{

    }

定义类时不确定数据类型，用泛型
使用类时指定泛型的类型
 */
public class demo04 {
    public static void main(String[] args) {
        //创建对象时给泛型赋值
        ArrayList<String> list1 = new ArrayList();
        //list1.add(String s);
        list1.add("小李");
        //String list1.get();

        ArrayList<Integer> list2 = new ArrayList();
        //list2.add(Integer e);
        list2.add(12);
        //Integer list2.get();

        ArrayList<Double> list3 = new ArrayList();
        //list3.add(Double d);
        list3.add(12.1);
        //Double list3.get();

    }
}
