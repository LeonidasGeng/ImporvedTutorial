package _06.BasicDataTypesWrapperClass基本类型的包装类.AnonymousLocalClass;
/*
是一个没有名字的局部内部类
方便构建子类对象，简化代码

父类或接口 对象名 = new 父类或接口(){
    方法重写
}


 */
public class demo06 {
    public static void main(String[] args) {
        //常规使用<===>使用实现类
        Student s1 = new Student();
        s1.Swimming();

        //使用匿名内部类，一步到位
//        父类或接口 对象名 = new 父类或接口(){
//            方法重写
//        }
        //             这个类没有名字👇
        Swimming s2 = new Swimming(){
            @Override
            public void Swimming() {
                System.out.println("匿名内部类1：狗刨式");
            }
        };
        //对象调用重写方法
        s2.Swimming();

        //匿名内部类2

        Swimming s3=new Swimming(){
            @Override
            public void Swimming() {
                System.out.println("匿名内部类2：仰泳");
            }
        };//要有分号;不然会报错
        s3.Swimming();
    }
}
