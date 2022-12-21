package _07.GenericWildcard;

import java.util.ArrayList;
import java.util.Objects;

/*
泛型通配符：
    ?

泛型上下限
<? extends xxxxxx>：泛型可以是xxxxxx及其子类，向上限定
<? super xxxxxx>：泛型可以是xxxxxx及其父类，向下限定


 */
public class demo07 {

    public static void main(String[] args) {
        //一个购物网站
        //一个集合专门存储用户年龄
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(18);
        ages.add(20);

        //一个集合专门存储用户购物金额
        ArrayList<Double> price = new ArrayList<>();
        price.add(208.96);
        price.add(88.96);



        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Object> objs = new ArrayList<>();
        ArrayList<Number> num = new ArrayList<>();

        //? 都可以使用
        showArrayList(dogs);
        showArrayList(objs);
        showArrayList(ages);
        showArrayList(price);
        showArrayList(num);

        //extends Number
        //showArrayList2(dogs); //报错，不是Number及其子类
        //showArrayList2(objs);
        showArrayList2(ages); //👇正确，是number及其子类
        showArrayList2(price);
        showArrayList2(num);

        //super Number
        //showArrayList3(dogs); //👇报错，最多就是Number，不能是Number及其子类
        //showArrayList3(ages);
        //showArrayList3(price);
        showArrayList3(objs); //Object
        showArrayList3(num); //Number

    }

    //定义一个方法可以查看所有集合中的元素
    //                                        👇把Integer/Double改为问好? 可以匹配任意类型
    public static void showArrayList(ArrayList<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }    }

    //定义一个方法只能传入ArrayList<Integer>,ArrayList<Double>
    //                                                   👇可以是Number，可以是Number的子类
    //                                                   👇Number/Integer/Double
    public static void showArrayList2(ArrayList<? extends Number> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }    }

    //定义一个方法只能传入ArrayList<Integer>,ArrayList<Double>
    //                                                   👇可以是Number，可以是Number的子类
    //                                                   👇Number/Integer/Double
    public static void showArrayList3(ArrayList<? super Number> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }    }

}
