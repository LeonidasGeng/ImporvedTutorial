package _01.MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
考试答案
‘aababcabcdabcdd’
有15个同学做一道选择题
统计每个答案出现的次数

1，创建Map集合，键存字符，值储存出现的次数
2，遍历字符串，得到每一个字符
3，判断Map是否包含这个字符
4，如果不包含，设置为1次
5，如果包含，次数+1
6，遍历Map按照格式输出

 */
public class demo01 {
    public static void main(String[] args) {
        String str="aababcabcdabcdd";
        //1，创建Map集合，键存字符，值储存出现的次数
        Map<Character, Integer> map = new HashMap<>();

        //2，遍历字符串，得到每一个字符
        //str.length().fori
        for (int i = 0; i < str.length(); i++) {
            //取出每一个字符
            char c = str.charAt(i);
//            System.out.print(c);
            //3，判断Map是否包含这个字符
            if (map.containsKey(c)) {
                //5，如果包含，次数+1
                //5.1得到之前的次数
                //5.2加一次
                Integer count = map.get(c);
                //map.put(c,++count);
                map.put(c,count+1);

            }else {
                map.put(c,1);
            }
        }

        //6，遍历Map按照格式输出
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> en : entrySet) {
            Character key = en.getKey();
            Integer value = en.getValue();
            System.out.println("答案"+key+"出现"+value+"次");
        }
    }


}
