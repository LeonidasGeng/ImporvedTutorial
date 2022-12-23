package _03.TemplateMethodPattern;
/*
使用模板方法:
当项目中有多个子类，且功能相同，大部分代码是一样的，小部分不同的时候

需求:
加油站，金卡银卡，金卡8折，银卡85折
卡片包含
名称，余额，支付功能(*)

支付功能包括
1，输入用户名和密码
2，登陆成功
3，扣款
4，打印消费额

卡片（父类）：
1，输入用户名和密码
2，登陆成功
3，扣款（抽象方法）
4，打印消费额

子类：
扣款8折/扣款85折
 */
public class demo03 {
    public static void main(String[] args) {
        GoldCard g = new GoldCard();
        g.pay(400);
        System.out.println("=============================");
        SilverCard s = new SilverCard();
        s.pay(400);
    }
}
