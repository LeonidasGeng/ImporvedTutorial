package _02.ReferenceTypeCast;

/*
        向上转型
        子类转成父类
        父类 变量名 = new 子类();
        Animal a = new Cat();
        多态：编译看左边，运行看右边
        a.eat();
        a.lookHome();

        向下转型
        父类转为子类
        子类 变量名 = (子类) 父类对象；
        可以调用子类特有方法
        Dog d = (Dog) a;
        d.eat();
        d.lookHome();可以的

        instanceof 关键字格式：变量名 instanceof 类名
        instanceof 关键字作用：判断变量名是否是这种类型
*/
public class demo02 {
    public static void main(String[] args) {
        //判断变量a是否是Dog类型
        //boolean b = a instanceof Dog;
        //System.out.println("b= "+b);
//        if(b) {
//
//        }
    }
}
