package _03.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
TreeMap
    底层是红黑树
1，不重复
2，无索引
3，可排序

注意，
默认从小到大排序
可用比较器排序
TreeMap和TreeSet一样底层是红黑树结构
 */
public class demo03 {
    public static void main(String[] args) {
//        Map<Integer,String> map = new TreeMap<>();
        Map<Integer,String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//前面-后面=升序
                //return o1-o2//后面-前面=降序
            }
        });
        map.put(20,"柳岩");
        map.put(21,"迪丽热巴");
        map.put(23,"古力娜扎");
        map.put(22,"热扎伊");

        //TreeMao(Comparator<? super K> comparator)使用比较器的规则排序
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
