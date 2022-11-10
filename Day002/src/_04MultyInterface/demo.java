package _04MultyInterface;

public class demo {
    public static void main(String[] args) {

    }
}

interface A{
    public abstract void test01();
}

interface B{
    public abstract void test02();
}

//类实现多个接口
class C implements A,B{

    @Override
    public void test01() {

    }

    @Override
    public void test02() {

    }
}
