package _06InheritanceOrExtends_继承_案例;

public class _01Game {
    String name;//名称
    int attackValue;//攻击力

    //攻击行为
    public void attack(){
        System.out.println(name+"攻击了一次，造成了"+attackValue+"的伤害");
    }
}
