package _06.GenericInterface;

//在实定义实现类接着用泛型
public class Teacher<S> implements Swimming<S>{
    @Override
    public void swimming(S a) {
        System.out.println("老师游泳时说："+a);
    }
}
