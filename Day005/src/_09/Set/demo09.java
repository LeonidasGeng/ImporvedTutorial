package _09.Set;

import java.util.HashSet;

/*
Set
没有索引
元素不可以重复
储存和取出没有顺序

HashSet

---LinkedHashSet

TreeSet
 */
public class demo09 {
    public static void main(String[] args) {
        //创建HashSet
        HashSet<String> set = new HashSet<>();

        //添加数据
        set.add("刘德华");
        set.add("郭富城");
        set.add("黎明");
        set.add("张学友");
        //不能重复
        //重复的元素不存储（不显示）
        set.add("张学友");//不存储（不显示）
        set.add("张学友");//不存储（不显示）
        set.add("张学友");//不存储（不显示）

        System.out.println("set="+set);

        //遍历集合

        for (String name : set) {
            System.out.println(name);
        }

    }
}
