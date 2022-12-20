package _01.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
实际开发用的不多

TreeSet
底层：红黑树
增删改查性能都好

1，没有索引
2，元素不可以重复
3，储存和取出有顺序

TreeSet集合是一定要排序的
1，元素自然排序（默认）
2，比较器排序

比较器排序优先级高

没有比较器的话，就是自然排序

TreeSet<Integer> treeSet2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //前面o1 - 后面o2 = 升序（默认）
//                return o1-o2;
                //后面o2 - 前面o1 = 降序（从大到小）
                return o2-o1;
            }
        });

 */
public class demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(12);
        treeSet1.add(11);
        treeSet1.add(19);
        treeSet1.add(15);

        //遍历，拿出元素
        //取出按顺序，默认：升序(从小到大)
        for (Integer number : treeSet1) {
            System.out.print(number+" ");
        }
        System.out.println(" ");
        System.out.println("====================");
        //用比较器排序
        TreeSet<Integer> treeSet2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //前面o1 - 后面o2 = 升序（默认）
//                return o1-o2;
                //后面o2 - 前面o1 = 降序（从大到小）
                return o2-o1;
            }
        });
        treeSet2.add(20);
        treeSet2.add(22);
        treeSet2.add(21);
        treeSet2.add(29);
        treeSet2.add(25);
        for (Integer integer : treeSet2) {
            System.out.print(integer+" ");
        }

        System.out.println("");
        System.out.println("====================");

        TreeSet<String> treeSet3 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2-o1;
            }
        });

        treeSet3.add("abc");
        treeSet3.add("ab");
        treeSet3.add("ac");
        treeSet3.add("gg");
        treeSet3.add("xyz");

        for (String s : treeSet3) {
            System.out.println(s);
        }

    }
}
