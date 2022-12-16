package _03.TemplateMethodPattern;

public abstract class Card {
    private String name;//用户名
    private double balance;//余额

    protected Card() {
    }

    //抽象的扣款方法
    //返回值：实际支付的金额
    public abstract double payment(double money);

    //模板方法-抽象的支付方法
    //money:应支付的金额
    public void pay(double money){
        System.out.println("输入用户名和密码");
        System.out.println("登陆成功");
        //扣款
        double newMoney = payment(money);
        System.out.println("实际消费额： "+newMoney);
    };



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
