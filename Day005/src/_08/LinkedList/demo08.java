package _08.LinkedList;

import java.util.LinkedList;

/*
LinkedList
底层数据结构是双链表，参训满，增删快

 */
public class demo08 {
    public static void main(String[] args) {
        //创建LinkedList
        LinkedList<String> linked = new LinkedList<>();

        linked.add("杨昭君");
        linked.add("貂蝉");
        linked.add("西施");
        linked.add("杨玉环");

        //void addFirst(E e) 在最前面加一个数据
        //void addLast(E e) 在最前面加一个数据
        linked.addFirst("小胡");
        linked.addLast("大胡");

        System.out.println("添加元素后的集合"+linked);

        //getFirst()取出第一个元素
        //getLast()取出最后一个元素

        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());

        //removeFirst()去除第一个元素
        //getLast()去除最后一个元素
        linked.removeFirst();
        System.out.println(linked);
        linked.removeLast();
        System.out.println(linked);
    }}
