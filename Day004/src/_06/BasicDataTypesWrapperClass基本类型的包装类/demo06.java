package _06.BasicDataTypesWrapperClass基本类型的包装类;
/*
基本数据类型
功能有限，只能加减乘除

基本数据类型      包装类
byte             Byte
short            Short
int              Integer
long             Long
float            Float
double           Double
char             Character
boolean          Boolean

包装类不仅可以操作基本类型数据，还提供了方法，功能强大

 */
public class demo06 {
    public static void main(String[] args) {
        //int转String 5==>"5"
        String str1="5";
        String int1 = String.valueOf(5);

        //String转int "5"==>5重点
        int int2 = 5;
        int str2 = Integer.parseInt("5");

        //"6.66" ==> double的6.66
        String str3 = "6.66";
        double double1 = Double.parseDouble("6.66");

        //"6.66" ==> float的6.66
        float float1 = 6.66f;

    }
}
