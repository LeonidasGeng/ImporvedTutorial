package _12.Regular_Expression;
/*
规则表达式，使用一些特殊符号表示特定规则

public boolean matches(String regex)

作用：
    通过正则表达式可以判断字符串是否符合规则

案例：
    验证一个号码是否是QQ号
    1，长度必须再5-15之间
    2，不许全部是数字
    3，首位不能是0
 */
public class demo12_00 {
    public static void main(String[] args) {
        String qq = "123456";
        boolean a = qq.matches("[1-9][0-9]{4,14}");
        System.out.println("a = "+a);
    }
}
