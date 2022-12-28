package _12.Regular_Expression;

public class demo12_05 {
    public static void main(String[] args) {
        //Sting的split方法中使用正则表达式
        String name = "贾乃亮,陈羽凡,王宝强,谢霆锋";
        System.out.println(name);//贾乃亮,陈羽凡,王宝强,谢霆锋
        String[] split1 = name.split(",+");     //一个以上的","进行切割
        for (String s : split1) {
            System.out.println(s);
        }

        //拓展 IP地址 192.168.73.100
        //使用”.“分割字符串，得到4部分
        String ip="192.168.73.100";
        String[] split2 = ip.split("\\.");     //正则表达式中，"."表示匹配任何内容，我们要把”.“看作普通的"."，用\.，用两个\\
        for (String s : split2) {
            System.out.println(s);
        }

        //String类的replaceAll方法中使用正则表达式
        String str = "我喜欢JAVAJAVAJAVA, 非常喜欢JAVAJAVA, 特别爱JAVA";
        //String replaceAll(String regex, String replacement) 替换字符串
        //String regex 替换前的内容
        //String replacement 替换后的内容
        System.out.println(str.replaceAll("JAVA","SQL")); //我喜欢SQLSQLSQL, 非常喜欢SQLSQL, 特别爱SQL
        System.out.println(str.replaceAll("JAVA","*")); //我喜欢***, 非常喜欢**, 特别爱*
        System.out.println(str.replaceAll("(JAVA)+","*")); //我喜欢*, 非常喜欢*, 特别爱*


    }
}
