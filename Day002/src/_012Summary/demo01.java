package _012Summary;
/*
abstract methods抽象方法
没有方法体的方法
修饰符 abstract 返回值类型 方法名（）{

    }

抽象类
abstract class 类名{
    }

父类抽象方法
    父类写了抽象方法，会强制子类重写抽象方法，避免方法缺失

final修饰类的特点（不可变）
    这个类不能有子类
final修饰方法的特点
    这个方法不能被重写
final修饰的变量特点
    这个变量只能使用一次等号=赋值，不能多次使用=赋值

接口的定义格式，一般来说接口都放抽象方法
interface 接口名 {
        抽象方法
    }

接口实现的格式
    class 类 implements 接口{
        }

接口中成员的特点
    1，接口中的方法默认是抽象方法，会自动添加public abstract
    2,接口中的变量会默认添加 public static final


 */
public class demo01 {
    public static void main(String[] args) {
        System.out.println("----------");
    }

}
