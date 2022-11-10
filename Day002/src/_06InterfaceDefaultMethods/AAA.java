package _06InterfaceDefaultMethods;

public interface AAA {
    public default void test01(){
        System.out.println("我是接口默认方法");
    }

    public static void test02(){
        System.out.println("我是接口静态方法");
    }

    private void test03(){
        System.out.println("我是接口私有方法");
    }
}
