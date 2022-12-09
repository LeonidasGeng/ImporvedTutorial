package _07.List;

import java.util.ArrayList;
import java.util.List;

/*
List接口特点
1，有索引
2，元素可重复
3，储存和取出有顺序


 */
public class demo07 {
    public static void main(String[] args) {
        //常用方法
        //学习List接口特点
        List<String> list = new ArrayList<>();
        list.add("唐伯虎");
        list.add("文征明");
        //元素可重复
        list.add("周文斌");
        list.add("周文斌");
        list.add("周文斌");


        //void add(int index, E element) 往指定索引位置添加元素
        list.add(1,"祝枝山");
        System.out.println(list);

        //get(int index) 获取指定索引值的元素
        System.out.println(list.get(1));

        //set(int index, E element) 修改指定索引值元素
        list.set(0,"周星驰");
        System.out.println(list);

        //remove(int index) 修改指定索引值元素
        list.remove(2);
        System.out.println(list);

        System.out.println("======");
        //增强for遍历集合
        for (String s : list) {
            System.out.print(s+" ");
        }

    }
}
