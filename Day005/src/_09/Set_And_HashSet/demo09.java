package _09.Set_And_HashSet;

import java.util.HashSet;

/*
Set
1, 没有索引
2, 元素不可以重复
3, 储存和取出没有顺序

Set的所有方法，都跟Collections一样的

最重要：
HashSet

Set集合没有索引，没有通过索引来获取元素和修改元素的方法
只有添加和删除
add(Object o)
remove(Object o)
没有get和set的方法

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

        System.out.println("set = "+set);

        //遍历集合，用增强for循环打印，方便
        for (String name : set) {
            System.out.println(name);
        }

    }
}
