package _04.MapPractice;

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
        //     👇abcd是char，使用char的包装类：Character
        Map<Character, Integer> map = new HashMap<>();

        //2，遍历字符串，得到每一个字符
        //str.length().fori  先拿字符串的长度，再fori
        for (int i = 0; i < str.length(); i++) {
            //取出每一个字符
            char c = str.charAt(i);//通过索引i获取对应字母
//            System.out.print(c);
            //3，判断Map是否包含这个字符，不包含，设置为一次
            if (map.containsKey(c)) {
                //5，如果包含，次数+1
                //5.1得到之前的次数
                Integer count = map.get(c);
                //5.2加一次
                //👇相同：map.put(c,++count);       ❗//count++; 先放入Map，再自增，晚了
                map.put(c,count+1);
            }else {
                //如果不包含，设置为1次
                map.put(c,1);
            }
        }

        //6，遍历Map按照格式输出
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> en : entrySet) {
            //得到键（字母）
            Character key = en.getKey();
            //得到值（次数）
            Integer value = en.getValue();
            System.out.println("答案"+key+"出现"+value+"次");
        }
    }


}
