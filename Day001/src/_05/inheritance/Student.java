package _05.inheritance;

public class Student extends parents{
    double score;
    public void study(){
        System.out.println(name+",他年龄为"+age+",在学习。他考试得了"+score+"分");
    }
}
