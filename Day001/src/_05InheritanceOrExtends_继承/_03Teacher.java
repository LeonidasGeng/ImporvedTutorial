package _05InheritanceOrExtends_继承;
/*
                     老师 继承 人类
 */
public class _03Teacher extends _01Person{
    double salary;

    public void teach(){
        System.out.println("叫"+name+",年龄为"+age+",的人在教学! 他获得了"+salary+"的钱");
    }
}
