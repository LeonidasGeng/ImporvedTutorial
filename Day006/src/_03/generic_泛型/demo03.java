package _03.generic_泛型;

import java.util.ArrayList;

/*
泛型
格式
    <xxx>

好处：
限定集合只能存储一种类型
避免了类型转换异常

注意
泛型只支持引用数据类型，不能使用基本数据类型

 */
public class demo03 {
    public static void main(String[] args) {
        //如果没有泛型，元素堪称Object类型，任何类型的数据都可以添加到集合中
        //在运行时强制转换就会报错
        //ArrayList<String>
        //可以不写泛型
        ArrayList list = new ArrayList();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        //list.add(100); 可以存入

        for (Object o : list) {
            //强转类型而取出
            String name = (String) o;
            System.out.println(name+",长度："+name.length());
            //显示但错误，无法取出110
        }

        //指定泛型为String，限定集合只能存储一种类型，避免了类型转换异常
        ArrayList<String> list2 = new ArrayList();
        list2.add("迪丽热巴");
        list2.add("古力娜扎");
        list2.add("马儿扎哈");
        //list2.add(100); 无法存入

        for (Object o : list) {
            //强转类型而取出
            String name = (String) o;
            System.out.println(name+",长度："+name.length());
        }

    }
}
