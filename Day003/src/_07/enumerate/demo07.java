package _07.enumerate;

/*
列举只有几个固定值的情况

public enum 枚举名{
    成员变量1(枚举项)，成员变量2......
}

使用：
枚举名.成员变量名

 */
public class demo07 {
    public static void main(String[] args) {
        Person p = new Person("小胡",Gender.Male);
        p.eat();
    }
}
