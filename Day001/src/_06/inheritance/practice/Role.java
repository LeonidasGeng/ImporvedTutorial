package _06.inheritance.practice;

public class Role {
    String name;
    int attackValue;

    public void attack(){
        System.out.println(name+"造成了"+attackValue+"点伤害");
    }
}
