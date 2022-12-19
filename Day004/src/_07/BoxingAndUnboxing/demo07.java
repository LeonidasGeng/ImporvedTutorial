package _07.BoxingAndUnboxing;
/*
装箱：
把基本数据类型转换为对应的包装类类型

拆箱
把包装类类型转为基本数据类型

自动装箱：
将基本数据类型转成包装类
Integer it3 = 6;

自动拆箱
将包装类转成基本数据类型
int x = it3;

 */
public class demo07 {
    public static void main(String[] args) {
        //int==>Integer 手动装箱
        //static Integer valueOf(int i);
        Integer i1 = Integer.valueOf(5);
        System.out.println("i1=" + i1);

        //Integer ==>int 手动拆箱
        //int intValue();
        int i2 = i1.intValue(); //手动拆箱

        //自动装箱：自动将基本数据类型转为包装类
        Integer i3 = 5;

        //自动拆箱：自动将包装类转成为基本数据类型
        int i4 = i3;

        //题目
        Integer i5 = 2;
        i5 += 2;
        //i5 = i5+2;
        //做了什么操作？
        //i5+2: i5.intValue()+2
        //i5 = i5+2: Integer.parseInt(i5.intValue()+2)
        System.out.println("i5 = " + i5);
    }
}
