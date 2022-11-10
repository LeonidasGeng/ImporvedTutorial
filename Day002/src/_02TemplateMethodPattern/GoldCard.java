package _02TemplateMethodPattern;

public class GoldCard extends Card{
    @Override //money：应付金额
    public double payment(double money) {
        System.out.println("金卡打8折");;
        return money*0.8;//打8折后实际的支付金额
    }

    public GoldCard(String name, double balance) {
        super(name, balance);
    }

    public GoldCard() {
    }


}
