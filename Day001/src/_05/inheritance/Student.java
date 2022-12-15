package _05.inheritance;
//           学生     继承      人
public class Student extends Person {
    double score;
    public void study(){
        System.out.println(name+",他年龄为"+age+",在学习。他考试得了"+score+"分");
    }
}
