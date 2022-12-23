package _02.Abstract_Attention;
/*
注意事项

1，抽象类不能创建对象
2，抽象类中有构造器，让构造器给成员变量赋值
3，抽象方法必须放在抽象类中，抽象类中可以没有抽象方法
4，子类必须重写抽象类中的所有抽象方法，如果子类只重写一部分抽象方法，子类还是抽象类

 */
abstract class demo02 {
    public abstract void show();

}

abstract class fu1 {
    public abstract void show1();
    public abstract void show2();
}

class zi1 extends fu1{
    @Override
    public void show1() {
        System.out.println("1");
    }

    @Override
    public void show2() {

    }
}
