package _05.Map_Practice_2;

import java.util.*;

/*
模拟网站统计用户的登录次数，包含用户名和登陆地址
小婷，广州
武武，广州
武武，深圳
武武，东莞
小婷，广州
小婷，深圳
武武，东莞
武武，东莞

最终统计效果
小婷，广州 2
武武，广州 1
武武，深圳 1
武武，东莞 1
小婷，深圳 3

分析：
1，创建用户类，包含用户名和登录地址
2，创建8个用户登录数据，存放到ArrayList
3，使用Map来储存用户和登录次数
4，如果用户在Map的键不存在，设置为1次
5，如果用户在Map的键存在，次数+1
6，遍历Map

 */
public class demo06 {
    //1，创建用户类，包含用户名和登录地址 === 已完成
    public static void main(String[] args) {
        //2，创建8个用户登录数据，存放到ArrayList
        User u1 = new User("小婷","广州");
        User u2 = new User("武武","广州");
        User u3 = new User("武武","深圳");
        User u4 = new User("武武","东莞");
        User u5 = new User("小婷","广州");
        User u6 = new User("小婷","深圳");
        User u7 = new User("武武","东莞");
        User u8 = new User("武武","东莞");

        ArrayList<User> users = new ArrayList<>();
        //一次性加多个数据
        Collections.addAll(users, u1,u2,u3,u4,u5,u6,u7,u8);

        //3，使用Map来储存用户和登录次数
        //  ↓用户数据 ↓登录次数
        Map<User,Integer> map = new HashMap<>();
        //遍历获取每个用户进行统计
        for (User user : users) {
            if (map.containsKey(user)) {
                //5如果用户在Map的键中存在，次数+1
                //5.1 取出之前的次数
                Integer count = map.get(user);
                //5.2 次数+1
                map.put(user,++count);
            }else{
                //4，如果用户在Map中的键不存在，设置为1次
                map.put(user,1);
            }
            
        }
        Set<Map.Entry<User, Integer>> set = map.entrySet();
        for (Map.Entry<User, Integer> entry : set) {
            User key=entry.getKey();
            Integer value=entry.getValue();
            //重写toString()
            System.out.println("用户 "+key+"登陆的次数为："+value);
        }

    }
}
