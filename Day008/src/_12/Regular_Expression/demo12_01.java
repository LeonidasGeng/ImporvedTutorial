package _12.Regular_Expression;
/*
内容.matches("规则")

小结
    []表示取其中一个匹配
    -表示范围

规律
    一位一位匹配的，不能漏掉
 */
public class demo12_01 {
    public static void main(String[] args) {
        //正则表达式-字符类
        //[]表示其中一个匹配    -表示范围
        System.out.println("abc".matches("abc"));

        //[abc]:代表a,b,c字符中的一个
        System.out.println("ab".matches("a[abc]"));//true
        System.out.println("ac".matches("a[abc]"));//true
        System.out.println("aa".matches("a[abc]"));//true
        System.out.println("bc".matches("a[abc]"));//false
        System.out.println("ad".matches("a[abc]"));//false
        System.out.println("====================");
        //[a-z]:代表a-z的所有小写字符中的一个
        System.out.println("ab".matches("a[a-z]"));//true
        System.out.println("ac".matches("a[a-z]"));//true
        System.out.println("aa".matches("a[a-z]"));//true
        System.out.println("bc".matches("a[a-z]"));//false
        System.out.println("a3".matches("a[a-z]"));//false
        System.out.println("====================");
        //[A-Z]:代表A-Z的所有大写字符中的一个
        System.out.println("aB".matches("a[A-Z]"));//true
        System.out.println("aG".matches("a[A-Z]"));//true
        System.out.println("aZ".matches("a[A-Z]"));//true
        System.out.println("bC".matches("a[A-Z]"));//false
        System.out.println("a3".matches("a[A-Z]"));//false
        System.out.println("====================");
        //[0-9]:代表0-9的所有数字中的一个
        System.out.println("aB".matches("a[0-9]"));//false
        System.out.println("aG".matches("a[0-9]"));//false
        System.out.println("aZ".matches("a[0-9]"));//false
        System.out.println("bC".matches("a[0-9]"));//false
        System.out.println("a3".matches("a[0-9]"));//true
        System.out.println("====================");
        //[a-zA-Z0-9]，代表a-z，A-Z，0-9之间任意一个字符
        System.out.println("ag".matches("a[a-zA-Z0-9]"));//true
        System.out.println("aG".matches("a[a-zA-Z0-9]"));//true
        System.out.println("aZ".matches("a[a-zA-Z0-9]"));//true
        System.out.println("bC".matches("a[a-zA-Z0-9]"));//false
        System.out.println("a3".matches("a[a-zA-Z0-9]"));//true
        System.out.println("====================");
        //[^abc]:代表除了a,b,c之外的任何字符
        System.out.println("ag".matches("a[^abc]"));//true
        System.out.println("aG".matches("a[^abc]"));//true
        System.out.println("ab".matches("a[^abc]"));//false
        System.out.println("bC".matches("a[^abc]"));//false
        System.out.println("a3".matches("a[^abc]"));//true
        System.out.println("====================");
        //26个字母
        //    且 def23中的一位
        //[a-z&&[def23]] d,e或f
        System.out.println("a3".matches("[a-z&&[def23]]"));//false
        System.out.println("aa".matches("[a-z&&[def23]]"));//false
        System.out.println("ad".matches("[a-z&&[def23]]"));//true
        System.out.println("ae".matches("[a-z&&[def23]]"));//true
        System.out.println("af".matches("[a-z&&[def23]]"));//true
        System.out.println("====================");
    }
}
