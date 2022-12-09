package _04.StrongFor;

import java.util.ArrayList;
import java.util.Collection;
/*
for(元素类型 变量名:数组或集合){
    循环体
}
 */
public class demo04 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("贾乃亮");
        coll.add("陈羽凡");
        coll.add("王宝强");
        coll.add("武大郎");

        //coll.for
        for(String str:coll){
            System.out.println(str);
        }

        //增强for更简洁
        //但无法操作索引，直接循环全部

        int[] arr={11,22,33,44};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
