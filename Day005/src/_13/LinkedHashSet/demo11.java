package _13.LinkedHashSet;

import java.util.LinkedHashSet;
/*
LinkedHashSet
1, 有顺序
2, 不重复
3, 无索引

//存储和取出的顺序是一样的

双链表，可追溯放入顺序
 */
public class demo11 {
    public static void main(String[] args) {
        //创建LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("迪丽热巴");
        set.add("古力娜扎");
        set.add("马儿扎哈");
        set.add("摩托罗拉");

        for (String s : set) {
            System.out.println(s);
        }
        //存储和取出的顺序是一样的
    }
}
