package _06InterfaceDefaultMethods;
/*
类实现方法相当于接口的继承
 */
public class demo {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        bbb.test01();

        //接口静态方法需要使用接口名调用
//        bbb.test02();
        //用接口名调用
        AAA.test02();

    }
}
