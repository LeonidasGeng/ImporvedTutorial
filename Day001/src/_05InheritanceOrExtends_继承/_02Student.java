package _05InheritanceOrExtends_继承;
/*
                     学生 继承 人类
 */
public class _02Student extends _01Person{
    double score;

    public void study(){
        System.out.println("叫"+name+",年龄为"+age+",的人在学习! 他获得了"+score+"的分数");
    }
}
