package _11.Customize_Exception;

//年龄小于18岁的异常
//1，让类继承Exception/RuntimeException
public class U18Exception extends Exception {
    //2，让idea生成构造器调用父类构造器
    //右键generate，选择Constructor
    //选择Exception()和Exception(message:String)

    public U18Exception() {
    }

    public U18Exception(String message) {
        super(message);
    }
}
