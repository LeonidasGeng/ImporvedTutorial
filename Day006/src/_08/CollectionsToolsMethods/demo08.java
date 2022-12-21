package _08.CollectionsToolsMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Collections 不是与几何，是用来操作集合的工具类

Collections类的方法
static <T> boolean addAll(Collection<T> c, T ... elements) 将后面的数据添加到前面的集合中
static void shuffle(List<?> list) 对集合中的元素随机打乱顺序

 */
public class demo08 {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         //list.add("小胡"); 麻烦，要一个个添加数据
         //list.add("小李"); 麻烦，要一个个添加数据

         //static <T> boolean addAll(Collection<T> c, T ... elements) 将后面的数据添加到前面的集合中
        Collections.addAll(list, "aa","bb","cc","dd");
        System.out.println("添加元素后"+list);

        //static void shuffle(List<?> list) 对集合中的元素随机打乱顺序
        Collections.shuffle(list);
        System.out.println("随机打乱后"+list);

    }
}
