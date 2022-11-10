package _02TemplateMethodPattern;

public class SilverCard extends Card{
    @Override
    public double payment(double money) {
        System.out.println("银卡打8.5折");
        return money*0.85;//返回实际金额
    }

    public SilverCard(String name, double balance) {
        super(name, balance);
    }

    public SilverCard() {
    }
}
