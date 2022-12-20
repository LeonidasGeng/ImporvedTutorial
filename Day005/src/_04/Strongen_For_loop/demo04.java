package _04.Strongen_For_loop;

import java.util.ArrayList;
import java.util.Collection;
/*
for(元素类型 变量名:数组或集合){
    循环体
}

好处：
简化代码

缺点：
无法操作索引

 */
public class demo04 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("贾乃亮");
        coll.add("陈羽凡");
        coll.add("王宝强");
        coll.add("武大郎");

        //快捷操作：coll.for
        //集合类型👇 👇变量名（现取）
        //            👇目标集合
        for(String str:coll){
            System.out.println(str);
        }

        //除了遍历集合，也能遍历数组
        //快捷操作：arr.for
        int[] arr={11,22,33,44};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
