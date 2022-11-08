package _01AbstractClassAndMethods;

public abstract class Card {
    private String name;//姓名
    private double balance;//余额

    //抽象的支付方法
    public abstract void pay();

    public Card() {
    }

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
