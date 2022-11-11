package _011StaticCodeModulePractice;

import java.util.ArrayList;

/*
用户进入房间的时候准备好牌,54张牌
 */
public class Room {
    //成员变量
    //修饰符 数据类型 变量名
    private int a;
    //保存一副牌
    private static ArrayList<String> pokers = new ArrayList<>();

    //使用静态代码块准备一副牌
    static {
        pokers.add("大王");
        pokers.add("小王");
        //花色
        String[] colors = {"♠","♥","♣","♦"};
        //数字
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (int i = 0; i < numbers.length; i++) {
            //数字
            String number = numbers[i];


        for (int j = 0; j < colors.length; j++) {
            //♠
            String color = colors[j];

            pokers.add(color+number);
        }
        }
    }

    public static void main(String[] args) {
        System.out.println("房间的牌已准备好："+pokers);
    }
}
