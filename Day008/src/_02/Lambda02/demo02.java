package _02.Lambda02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Lambda表达式有参格式
(形式参数)->{
    代码
}

Lambda表达式省略规则
    1，参数类型可以省略(Integer o1, Integer o2) 省略后(o1, o2)
    2，如果参数有且仅有一个，那么小括号可以省略(String s) 省略后s
    3，如果代码块只有一条语句，可以省略{}; 和return
 */
public class demo02 {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(33);
         list.add(11);
         list.add(44);
         list.add(22);

         //1,用比较器给List集合排序(匿名内部类
         //void sort(List list, Comparator c)
        Collections.sort(list, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        //Lambda 表达式
        Collections.sort(list, (Integer o1, Integer o2) ->{
            return o2-o1;
        });

        for (Integer integer : list) {
            System.out.println(integer);
        }

        //Lambda 省略格式
//      CCollections.sort(list, (Integer o1, Integer o2) ->{
//            return o2-o1;
//        });
        Collections.sort(list, (o1, o2) ->o2-o1);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
