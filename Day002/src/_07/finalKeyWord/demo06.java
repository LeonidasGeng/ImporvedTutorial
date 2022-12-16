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
    public final void method(){
        System.out.println("我是父类method方法");
    }
}

/*
class child2 extends parent2{
   public void method(){
        System.out.println("我是子类method方法");
    }
}
*/




public class demo06 {
}
