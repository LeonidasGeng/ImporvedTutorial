package _03.generic_泛型.TemplateMethodPattern;

/*
金卡
1，定义类继承抽象类    alt+回车，万能键，idea给我们各自提示

 */
public class GoldCard extends Card {
    public GoldCard(){

    }
    public GoldCard(String name, double balance){
        super(name, balance);

    }



    //重写抽象方法
    @Override
    public double payment(double money) {
        System.out.println("金卡打8折");
        return money * 0.8;
    }
}
