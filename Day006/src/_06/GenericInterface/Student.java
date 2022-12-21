package _06.GenericInterface;

//定义实现类时指定接口的泛型
public class Student implements Swimming<String>{
    @Override
    public void swimming(String a) {
        System.out.println("学生游泳时说："+a);
    }
}
