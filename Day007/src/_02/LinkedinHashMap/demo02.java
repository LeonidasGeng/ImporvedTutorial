package _02.LinkedinHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
继承了HashMap

HashMap储存和取出是没有顺序的
LinkedHashMap是继承了HashMap，通过链表保存元素储存和取出的顺序
 */
public class demo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("唐伯虎","aa");
        map.put("祝枝山","bb");
        map.put("周文宾","xx");
        map.put("文征明","tt");

        //遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
