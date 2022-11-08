package _01AbstractClassAndMethods;

public class GoldCard extends Card{
    @Override
    //重写成抽象方法
    public void pay() {
        System.out.println("金卡打8折");
    }
    //快捷键
    //在红色波浪线，alt+回车，IDEA给我们提示修复bug
}
