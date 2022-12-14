package _10.Poker_Case;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主
洗牌
发牌

54张牌打乱顺序
三个玩家
三人交替摸牌
每人17张牌
最后留三张牌作为底牌

分析：
1，定义纸牌类
    包含数字，花色
2，准备牌
    54张牌，用ArrayList集合储存所有纸牌对象
3，洗牌
    用Collections类中的shuffle()方法对集合元素随机打乱
4，发牌
    创建三个ArrayList集合分别存储每个玩家的纸牌，通过对3取模依次发牌
5，看牌
    直接打印每个集合
 */
public class demo03 {
    //创建一个集合ArrayList来储存牌
    private static ArrayList<Poker> pokers = new ArrayList<>();

    //静态代码块给静态成员变量赋值
    static{
        //搞出大，小王，大王/小王+数组，但无数字
        //Poker daWang = new Poker("大王", "");
        //pokers.add(daWang);
        pokers.add(new Poker("大王",""));
        pokers.add(new Poker("小王",""));
        //使用循环拼接花色与数字
        String[] colors = {"♠","♥","♦","♣"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //嵌套循环
        for (String number : numbers) {
            for (String color : colors) {
                Poker poker = new Poker(color,number);
                pokers.add(poker);
            }
        }
    }

    //main方法打印集合
    public static void main(String[] args) {
        System.out.println("准备好一副牌: "+pokers);

        //洗牌 collections.shuffle 随机打乱
        Collections.shuffle(pokers);
        System.out.println("洗好牌了："+pokers);

        //发牌
        //按顺序发牌
        //一个玩家就是一个集合
        ArrayList<Poker> play1 = new ArrayList<>();
        ArrayList<Poker> play2 = new ArrayList<>();
        ArrayList<Poker> play3 = new ArrayList<>();
        ArrayList<Poker> hide = new ArrayList<>();

        //从0开始，到53，共54个数
        //玩家1 索引值%3=0
        //玩家2 索引值%3=1
        //玩家3 索引值%3=2
        //51,52,53 位置的牌留着当hide底牌

        for (int i = 0; i < pokers.size(); i++) {
            //i 索引
            //poker 索引对应的牌
            Poker poker = pokers.get(i);
                //51.52.53 是底牌
            if (i>=51) {
                hide.add(poker);
                //玩家1底牌
            }else if (i%3 ==0){
                play1.add(poker);
                //玩家2底牌
            } else if (i%3==1) {
                //玩家3底牌
                play2.add(poker);
            } else {
                play3.add(poker);
            }
        }

        //看牌
        System.out.println("玩家1的牌:"+play1);
        System.out.println("玩家2的牌:"+play2);
        System.out.println("玩家3的牌:"+play3);
        System.out.println("底牌是："+hide);

    }
}
