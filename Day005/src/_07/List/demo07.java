package _07.List;

import java.util.ArrayList;
import java.util.List;

/*
List集合
特点
1，有索引
2，元素可重复
3，储存和取出有顺序

List最终重要的实现类是ArrayList和LinkedList
1，功能基本与List提供的一致
2，ArrayList底层是基于数组实现的，查询元素快，增删相对慢
3，LinkedList底层是基于双链表实现的，查询元素慢，增删首位元素是非常快的
 */
public class demo07 {
    public static void main(String[] args) {
        //常用方法
        //学习List接口特点
        //左边写List，左边写List，表示用的方法都是来自List接口
        List<String> list = new ArrayList<>();
        list.add("唐伯虎");
        list.add("文征明");
        //元素可重复
        list.add("周文宾");
        list.add("周文宾");
        list.add("周文宾");

        //void add(int index, E element) 往指定索引位置添加元素
        list.add(1,"祝枝山");//添加到1索引这个位置

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
