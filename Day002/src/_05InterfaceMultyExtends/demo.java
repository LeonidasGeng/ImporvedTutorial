package _05InterfaceMultyExtends;
/*
一个接口可以继承多个其他接口
规范的合并
 */
public class demo {
    public static void main(String[] args) {

    }
}

interface AA{
    public abstract void test01();
}

interface BB{
    public abstract void test02();
}

interface CC extends AA,BB{
    public abstract void test03();
}

class DD implements CC{

    @Override
    public void test01() {

    }

    @Override
    public void test02() {

    }

    @Override
    public void test03() {

    }
}