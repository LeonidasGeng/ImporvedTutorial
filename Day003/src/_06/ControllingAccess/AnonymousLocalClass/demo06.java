package _06.ControllingAccess.AnonymousLocalClass;
/*
是一个没有名字的局部内部类
方便构建子类对象，简化代码

父类或接口 对象名 = new 父类或接口(){
    方法重写
}


 */
public class demo06 {
    public static void main(String[] args) {
        //使用实现类
        Student s1 = new Student();
        s1.swimming();

        //匿名内部类
        Swimming s2 = new Swimming(){
            @Override
            public void swimming() {
                System.out.println("匿名内部类"+"狗刨式");
            }
        };
        s2.swimming();
    }
}
