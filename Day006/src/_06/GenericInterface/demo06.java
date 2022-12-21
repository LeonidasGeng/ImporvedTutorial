package _06.GenericInterface;
/*
格式
修饰符 interface  接口名 <名称>{
    xxxxxxxx
}


 */
public class demo06 {
    public static void main(String[] args) {
        Student s = new Student();
        s.swimming("呵呵");

        Teacher<String> t1 = new Teacher<>();
        t1.swimming("牛比");

        Teacher<Integer> t2 = new Teacher<>();
        //t2.swimming("牛比");//报错
        t2.swimming(123);
}
}
