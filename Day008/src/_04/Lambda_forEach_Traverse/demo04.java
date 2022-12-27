package _04.Lambda_forEach_Traverse;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


/*
Lambda表达式的使用场景
规律

*map集合
    *map.forEach((key,value) ->{
            System.out.println(key + " = " + value);
        });
    map集合.forEach((键, 值)->{

        System.out.println(key + " = " + value);
    })

*单列集合
    *list.forEach((Integer i)->{
            System.out.println(i);
        });

    *list.forEach(i-> System.out.println(i));

    map集合.forEach(元素->{
        System.out.println(System.out.println(元素););
    })

 */
public class demo04 {
    public static void main(String[] args) {
         Collection<Integer> list = new ArrayList<>();
         list.add(33);
         list.add(11);
         list.add(44);
         list.add(22);

        //以前，增强for
        //优点：自动生成
        //缺点：代码多一点
        for (Integer i1 : list) {
            System.out.println(i1);
        }

        //现在: foreach遍历
        //list.forEach
        //forEach(Consumer action)
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //简化，变Lambda表达式
        list.forEach((Integer i)->{
            System.out.println(i);
        });

        //如果参数有且仅有一个，那么小括号可以省略(String s) 省略后s
        //如果代码块只有一条语句，可以省略{}; 和return
        //有点：代码简单
        //缺点：需要手写，无法自动生成
        list.forEach(i-> System.out.println(i));

        Map<String,String> map = new LinkedHashMap <>();
        map.put("周文宾","aa");
        map.put("唐伯虎","bb");
        map.put("文征明","cc");
        map.put("徐祯卿","dd");

        //遍历map集合，键找值/Entry
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//        for (Map.Entry<String, String> entry : entrySet) {
//            String value = entry.getValue();
//            String key = entry.getKey();
//            System.out.println(key + " = " + value);
//        }

        //BiConsumer<? super K, ? super V> biConsumer = ; 是一个接口
        map.forEach(new BiConsumer<String,String>(){
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });

        System.out.println("====================");
        map.forEach((key,value) ->{
            System.out.println(key + " = " + value);
        });

        System.out.println("====================");
        map.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}
