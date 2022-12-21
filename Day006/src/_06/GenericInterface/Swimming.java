package _06.GenericInterface;

//放在接口后面，叫泛型接口
//接口中放抽象方法
//<S>定义泛型，相当于定义变量
public interface Swimming <S>{
    public abstract void swimming(S a);
}
