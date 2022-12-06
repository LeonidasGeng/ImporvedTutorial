package _01.Abstract;

public abstract class Card {
    private String name;
    private double balance;

    //抽象的支付方法
    public abstract void pay();

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card() {
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
