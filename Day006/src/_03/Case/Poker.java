package _03.Case;
//扑克牌
//花色，数字
public class Poker {
    //花色
    private String color;
    //数字
    private String number;

    @Override
    public String toString() {
        return color + number;
    }

    public Poker() {
    }

    public Poker(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
