package _01.Abstract;
/*
金卡
1，定义类继承抽象类    alt+回车，万能键，idea给我们各自提示

 */
public class GoldCard extends Card{
//重写抽象方法
    @Override
    public void pay() {
        System.out.println("金卡打8折");
    }
}
