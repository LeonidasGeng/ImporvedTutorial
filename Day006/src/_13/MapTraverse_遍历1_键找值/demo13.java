package _13.MapTraverse_遍历1_键找值;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map遍历
    从Map中依次取出数据

    Set(K) ketSet() 获取所有的键

    Map遍历键找值的步骤
    1，获取所有的键
    2，遍历获取的每个键
    3，通过键获取值
 */
public class demo13 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();
        //添加数据
        map.put("王宝强","马蓉");
        map.put("陈羽凡","白百合");
        map.put("谢霆锋","张柏芝");
        map.put("贾乃亮","李小璐");

        //Map遍历方式1：键找值 遍历
//        String v1 = map.get("王宝强");
//        System.out.println("v1 = " + v1);
        //1，取出所有的键 map.ketSet
      //👇键不能重复，所以放到Set集合中
        Set<String> keySet = map.keySet();
        //2，遍历集合，取出每一个键 keySet.for
        for (String key : keySet) {
            //3，通过键找值
            String value = map.get(key);
            System.out.println(key+" 的老婆是: "+value);
        }

    }
}
