package _12.MapMethods;

import java.util.HashMap;
import java.util.Map;

/*
Map本质是一个集合

没有索引
只能用键Key去找值Value
 */
public class demo12 {
    public static void main(String[] args) {
        //创建HashMap
        Map<String, String> map = new HashMap<>();

        //V put(K key, V value) 键不存在添加数据，返回null；键存在修改数据，返回修改前的数据
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("黄晓明","杨颖");
        System.out.println(map.put("老干爹", "老干妈")); //null
        System.out.println("原始数据"+map); //{邓超=孙俪, 老干爹=老干妈, 李晨=范冰冰, 黄晓明=杨颖}
        //int size() 看集合长度
        System.out.println("集合长度（键值对的个数）:"+map.size());
        System.out.println("====================");
        map.put("李晨","迪丽热巴");//已经存在"李晨"，变为修改，"范冰冰"变为迪丽热巴
        System.out.println("把李晨对象换成迪丽热巴"+map); //{邓超=孙俪, 老干爹=老干妈, 李晨=迪丽热巴, 黄晓明=杨颖}
        System.out.println("====================");
        //❗V get(Object key)通过键获取值 *****
        System.out.println("邓超媳妇是谁？"+map.get("邓超"));//孙俪
        System.out.println("====================");
        //V remove(Object key) 通过键删除这对数据
        map.remove("黄晓明");
        System.out.println("删除‘黄小明’之后的数据 = "+map); //{邓超=孙俪, 老干爹=老干妈, 李晨=迪丽热巴}
        //int size() 看集合长度
        System.out.println("集合长度（键值对的个数）:"+map.size());
        System.out.println("====================");
        //boolean containsKey(Object key)判断集合是否包含指定的键
        System.out.println("是否包含‘邓超‘这个键？"+map.containsKey("邓超"));//true
        System.out.println("是否包含‘周杰伦‘这个键？"+map.containsKey("周杰伦"));//false
        System.out.println("====================");
        ////boolean containsValue(Object value)判断集合是否包含指定的键
        System.out.println("是否包含‘孙俪‘这个值？"+map.containsValue("孙俪"));//true
        System.out.println("是否包含‘古力娜扎‘这个值？"+map.containsValue("古力娜扎"));//false
        System.out.println("====================");
        //void clear() 清空数据
        map.clear();
        System.out.println("清空后的集合为："+map);
        System.out.println("====================");
        //int size() 看集合长度
        System.out.println("集合长度（键值对的个数）:"+map.size());
    }
}
