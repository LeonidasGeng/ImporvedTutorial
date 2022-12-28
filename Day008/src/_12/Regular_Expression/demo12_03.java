package _12.Regular_Expression;
/*
数量词(限定符)
 */
public class demo12_03 {
    public static void main(String[] args) {
        //我要匹配6个数字
        System.out.println("123456".matches("\\d\\d\\d\\d\\d\\d"));//true
        System.out.println("====================");
        //X{n}恰好n次
        System.out.println("123456".matches("\\d{6}"));//true
        System.out.println("====================");
        //X{n,}至少n次
        System.out.println("12345".matches("\\d{6,}"));//false
        System.out.println("123456".matches("\\d{6,}"));//true
        System.out.println("1234567".matches("\\d{6,}"));//true
        System.out.println("12345678".matches("\\d{6,}"));//true
        System.out.println("123456789".matches("\\d{6,}"));//true
        System.out.println("====================");
        //X{n,m}在n,m之间，包含n,m
        System.out.println("12345".matches("\\d{6,8}"));//false
        System.out.println("123456".matches("\\d{6,8}"));//true
        System.out.println("1234567".matches("\\d{6,8}"));//true
        System.out.println("12345678".matches("\\d{6,8}"));//true
        System.out.println("123456789".matches("\\d{6,8}"));//false
        System.out.println("====================");
        //X? 0次或1次 表示b出现0次或1次
        System.out.println("a".matches("ab?"));//true
        System.out.println("ab".matches("ab?"));//true
        System.out.println("abb".matches("ab?"));//false
        System.out.println("abc".matches("ab?"));//false
        System.out.println("====================");
        //X* 0次或1次 表示b出现0次到多次
        System.out.println("a".matches("ab*"));//true
        System.out.println("ab".matches("ab*"));//true
        System.out.println("abb".matches("ab*"));//true
        System.out.println("abc".matches("ab*"));//false
        System.out.println("====================");
        //X+ 0次或1次 表示b出现1次到多次
        System.out.println("a".matches("ab+"));//false
        System.out.println("ab".matches("ab+"));//true
        System.out.println("abb".matches("ab+"));//true
        System.out.println("abc".matches("ab+"));//false


    }
}
