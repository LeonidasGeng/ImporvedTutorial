package com.itheima._10匿名内部类使用场景;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
目标:学习匿名内部类使用场景(了解)

方法的参数如果是接口类型
    1.传入接口的实现类对象
    2.传入匿名内部类对象(方便)

 */
public class Demo10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(3);

        // 体验匿名内部类简化代码
        // 排序不是重点,看怎么传入匿名内部类对象
        // void sort(List list, Comparator c)
        // Comparator c: 是一个接口, 接口不能直接创建对象.
        // 参数是接口: 1.传入接口的实现类对象, 2.传入匿名内部类对象

        // 1.传入接口的实现类对象
        // MyComparator mc = new MyComparator();
        // Collections.sort(list, mc);

        // 2.传入匿名内部类对象
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }
}
