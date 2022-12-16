package _00.ImplementAndAbstractCase;
/*
学生:姓名，性别，年龄
    学习，抽烟，吃饭
老师:姓名，性别，年龄
    上课，游泳，吃饭
工人:姓名，性别，年龄
    工作，抽烟，吃饭
司机:姓名，性别，年龄
    开车，游泳，吃饭


 */
public class demo00 {
    public static void main(String[] args) {
        Student s = new Student("小李",19,"男生");
        s.eat();
        s.smoking();
        s.study();
    }
}
