package _01.TreeSet;

import java.util.TreeSet;

/*
TreeSet
没有索引
元素不可以重复
储存和取出没有顺序

 */
public class demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(12);
        treeSet1.add(11);
        treeSet1.add(19);
        treeSet1.add(15);
        //取出按顺序，默认从小到大
        for (Integer number : treeSet1) {
            System.out.println(number);
        }
    }
}
