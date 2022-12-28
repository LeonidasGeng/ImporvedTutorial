package _12.Regular_Expression;
/*预定义字符

 */
public class demo12_02 {
    public static void main(String[] args) {
        //1，"." 匹配任何一个字符，有个数限制
        System.out.println("ab3".matches("...")); //true
        System.out.println("abd".matches("...")); //true
        System.out.println("ab呵呵".matches("...")); //false
        System.out.println("abD".matches("...")); //true
        //特殊的正则表达式中的，可以匹配任何任何内容，就是要匹配"."
        System.out.println("====================");
        //2, "\d" 任何数字[0-9]的简写; ❗注意字符串中\需要写两个
        System.out.println("ab3".matches("ab\\d")); //true
        System.out.println("ab6".matches("ab\\d")); //true
        System.out.println("abc".matches("ab\\d")); //false
        System.out.println("abD".matches("ab\\d")); //false
        System.out.println("====================");
        //2, "\D" 非任何数字[^0-9]的简写; ❗注意字符串中\需要写两个
        System.out.println("ab3".matches("ab\\D")); //false
        System.out.println("ab6".matches("ab\\D")); //false
        System.out.println("abc".matches("ab\\D")); //true
        System.out.println("abD".matches("ab\\D")); //true
        System.out.println("====================");
        //2, "\w" 单词字符[a-zA-Z0-9]简写; ❗注意字符串中\需要写两个
        System.out.println("ab3".matches("ab[a-zA-Z0-9]")); //true
        System.out.println("abd".matches("ab\\w")); //true
        System.out.println("ab呵呵".matches("ab\\w")); //false
        System.out.println("abD".matches("ab\\w")); //true
    }
}
