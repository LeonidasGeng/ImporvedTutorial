package _03.TemplateMethod;

public class SilverCard extends Card {
    public SilverCard(){}



    public SilverCard(String name,double balance){
        super(name, balance);
    };
    @Override
    public double payment(double money) {
        System.out.println("银卡打8.5折");
        return money * 0.85;
    }
}
