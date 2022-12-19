package _07.enumeration;

import java.util.Scanner;

/*
列举只有几个固定值的情况
一个一个列举出来
列举处一个类型的所有值

public enum 枚举名{
    成员变量1(枚举项)，成员变量2，成员变量3......成员变量n;//最后一个以分号结尾
}

使用：
枚举名.成员变量名

好处
不能随便写数据，一定是从枚举项中选择某一个值
保证数据正确，有效

应用场景：一个变量有少数固定值
血型，方向，月份，小时

 */
public class demo07 {
    public static void main(String[] args) {
        //如果性别的数据类型是String，可以随便填，导致数据非法
        Person p = new Person("小胡",Gender.Female);//或Gender.Mail
        p.print();
        System.out.println("方法2："+p.getName()+"的性别是"+p.getGender());

        //让数字转枚举
        System.out.println("请输入性别，0代表男，1代表女");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        Gender value = Gender.values()[i];
        System.out.println("您的性别是："+value);
    }
}
