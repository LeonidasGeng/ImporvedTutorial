package _07.finalKeyWord;
/*
final：不可变

可以修饰
类，方法，变量
 */

//final可以修饰类，这个类不能被继承
/*final*/class parent1{}
class child1 extends parent1{} /*如果上面有final，child1不能继承parent1*/

//final可以修饰方法，final修饰的方法不能被重写
class parent2{
    //final修饰的方法不能被重写
    //下面的child2不能重写parent2的show方法
    public final void show(){
        System.out.println("我是父类show方法");
    }
}

/*
//这个方法不能被重写
class child2 extends parent2{
   public void show(){
        System.out.println("我是子类show方法");
    }
}
*/




public class demo06 {
}
