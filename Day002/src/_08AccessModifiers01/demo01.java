package _08AccessModifiers01;

public class demo01 {
    //私有
    private void testPrivate(){

    }
    //缺省
    void testDefault(){

    }
    //受保护的
    protected void testprotected(){

    }
    //公开的
    public void testpublic(){

    }
    public void test01(){
        //同一个类中都可以使用
        testDefault();
        testprotected();
        testPrivate();
        testpublic();
    }

}
