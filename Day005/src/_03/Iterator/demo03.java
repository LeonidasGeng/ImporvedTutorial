package _03.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
获取迭代器
interface Collection{
    Iterator<E> iterator() 反馈此集合中的迭代器
}

用法

boolean hasNext();判断当前位置是否有元素，有元素返回true

E next()获取当前位置元素，并同时将迭代器指针移向下一个位置


 */
public class demo03 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("贾乃亮");
        coll.add("陈羽凡");
        coll.add("王宝强");
        coll.add("武大郎");

        Iterator<String> itr = coll.iterator();
        while (itr.hasNext()){
            //循环判断是否有元素，有元素就打印名字
            String name= itr.next();
            System.out.println(name);
        }

//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
////        System.out.println(itr.next());//NoSuchElementException, 没有元素异常

    }
}
