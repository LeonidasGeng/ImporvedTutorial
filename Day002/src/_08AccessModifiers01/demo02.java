package _08AccessModifiers01;

public class demo02 {
    public void test02(){
        demo01 d1 = new demo01();
        //同一包中的其他类，private不能用
//        d1.testPrivate();
        d1.testDefault();
        d1.testprotected();
        d1.testpublic();
    }
}
