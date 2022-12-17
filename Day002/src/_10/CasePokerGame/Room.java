package _10.CasePokerGame;

import java.util.ArrayList;

/*
游戏房间
在用户进入房间的时候就先准备好牌
54张牌，
 */
public class Room {
    //成员变量(类中，方法外)
    //一个成员变量: 修饰符 数据类型 变量名

    //保存一副牌
    //private             int           a ;
    private static ArrayList<String> pokers = new ArrayList<>();

    //使用静态代码块准备一副牌
    static {
        //首先添加大小王
        pokers.add("大王");
        pokers.add("小王");

        //花色
        String[] colors = {"♥", "♠", "♦", "♣"};
        //数字
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < numbers.length; i++) {
            String n = numbers[i];

            for (int j = 0; j < colors.length; j++) {
                String c = colors[j];
            pokers.add(c+n);
            }
        }


    }
    public static void main(String[] args) {
        System.out.println("房间牌已准备好" + pokers);
    }
    }

