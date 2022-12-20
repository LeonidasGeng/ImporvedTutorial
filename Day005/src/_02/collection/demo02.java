package _02.collection;
/*
collection
        单列集合
list:   1，有索引
        2，元素可以重复
        3，储存和取出有顺序
        例子：ArrayList,LinkedList
set:    1,没有索引
        2，元素不可以重复
        3，储存和取出没有顺序
        例子：HashSet, TreeSet



 */

import java.util.ArrayList;
import java.util.Collection;

public class demo02 {
    public static void main(String[] args) {
        //Collection接口中的方法
        Collection<String> coll = new ArrayList<>();

        //boolean add(E e)添加元素
        coll.add("刘德华");
        coll.add("张学友");
        coll.add("郭富城");
        coll.add("黎明");

        //boolean contains(Object o), 集合中是否包含指定元素，如果包含，返回true
        boolean zxc = coll.contains("周星驰");
        System.out.println(zxc);

        //boolean remove(Object o), 删除指定元素
        boolean noGFC = coll.remove("郭富城");
        System.out.println(coll);

        //boolean isEmpty(), 判断集合是否为空？空值返true
        System.out.println(coll.isEmpty());

        //int size() 过去集合长度
        System.out.println(coll.size());

        //public Object[] toArray()把集合中的元素，储存到数组中
        Object[] arr =coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //void clear() 清空集合，删除集合中所有的元素
        coll.clear();
        System.out.println(coll);





    }
}
