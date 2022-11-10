package _02TemplateMethodPattern;

public class demo01 {
    public static void main(String[] args) {
        GoldCard gc = new GoldCard();
        gc.pay(100);

        SilverCard sc = new SilverCard();
        sc.pay(100);

    }
}
