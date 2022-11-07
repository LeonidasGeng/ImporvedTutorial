package _06InheritanceOrExtends_继承_案例;

public class _00Demo {
    public static void main(String[] args) {
        _02Dragon dr = new _02Dragon();
        dr.name="大飞";
        dr.attackValue=999;
        dr.fly();
        dr.attack();

        _03Tank tk = new _03Tank();
        tk.name="小跑";
        tk.attackValue=888;
        tk.move();
        tk.attack();

    }
}
