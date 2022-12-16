package _08.finalForVariables;

/*
final修饰变量，这个变量只能使用一次
 */
public class demo07 {
    public static void main(String[] args) {
        final int a = 10; //变量本身是可以变化的，但用final修饰后无法更改
        //int a = 10; //报错，final修饰的变量不能被修改
        //int a = 20; //报错，final修饰的变量不能被修改

        //final修饰的变量，可以改变里面的内容
        final Person p = new Person();
        //p = new Person(); 报错，无法使用
        //但可以改变变量内容
        p.age = 10;
        p.age = 20;

    }
}
