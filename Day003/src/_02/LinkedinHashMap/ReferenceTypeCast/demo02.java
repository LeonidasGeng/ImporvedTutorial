package _02.LinkedinHashMap.ReferenceTypeCast;
/*
概念：
一类事物的多种形态
父类引用指向子类对象

1，父类 变量名 = new 子类();
2，接口 变量名 = new 实现类();

多态的前提
1，有继承/实现关系
2，要有方法重写

多态好处
左边写父类，右边可以是任意子类，提高代码扩展性
 */

public class demo02 {
    public static void main(String[] args) {
        //向上转型：将子类转为父类 父类 变量名 = new 子类();
        Animal a = new Dog();
        //多态，编译看左边，运行看右边
        a.eat();

        //判断对象的类型，判断变量a是否是Dog类型
        boolean b = a instanceof Dog;
        System.out.println("b = " + b);

        if (b) {
            //向下转型，将父类转为子类 子类 变量名 = (子类) 父类对象
            Dog d = (Dog) a;
            d.lookHome();
        }else {
            System.out.println("a 不是Dog类型");
        }


        System.out.println("====================");
        Animal c = new Cat();
        c.eat();
        boolean d = c instanceof Dog;
        System.out.println("d = " + d);

        if (d) {
            //向下转型，将父类转为子类 子类 变量名 = (子类) 父类对象
            Dog e = (Dog) a;
            e.lookHome();
        }else {
            System.out.println("c 不是Dog类型");
        }

    }
}
