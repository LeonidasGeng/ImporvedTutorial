package _06.BasicDataTypesWrapperClass基本类型的包装类.inheritance.practice;

public class demo06 {
    public static void main(String[] args) {
        //创建龙
        Dragon d = new Dragon();
        d.name="超级龙";
        d.attackValue=300;
        d.fly();
        d.attack();
        //创建炮车
        Vehicle v = new Vehicle();
        v.name="炮车";
        v.attackValue = 250;
        v.run();
        v.attack();

    }
}
