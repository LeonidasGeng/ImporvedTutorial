package _11.LinkedHashSet;

import java.util.LinkedHashSet;
/*
LinkedHashSet
有顺序
不重复
无索引
 */
public class demo11 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("迪丽热巴");
        set.add("古力娜扎");
        set.add("马儿扎哈");
        set.add("摩托罗拉");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
