package _14.MapTraverse_遍历2_键值对;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
键值对
    Entry方式

    Entry: 是一个接口，JDK有实现类，Entry会存放一个键和一个值(键值 对 对象)，相当于结婚证

    如何获取Entry
    Set<Map.Entry<K,V>> entrySet();

    Map遍历Entry方式的步骤
    1，获取所有的Entry
    2，遍历取出每个Entry
    3，取出Entry中的键和值

    推荐使用Entry方式
 */
public class demo14 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();
        //添加数据
        map.put("王宝强","马蓉");
        map.put("陈羽凡","白百合");
        map.put("谢霆锋","张柏芝");
        map.put("贾乃亮","李小璐");

        //Map遍历方式二：Entry 键值对 遍历
        //1.获取所有Entry对象 map.entrySet().var
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        //遍历获取每个Entry entrySet.for
        for (Map.Entry<String, String> entry : entrySet) {
            //通过Entry获取键 和 值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"==="+value);
        }
    }
}
