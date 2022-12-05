package _07.Override;
/*

方法重写

同一个类中，方法名相同，参数列表不同

老手机：
打电话（语音通话）
发短信（文字短信）

新手机：
打电话（语音通话，视频通话）
发短信（文字短信，图片和语音短信）

子类的功能比父类的功能更强发，(父类功能不满足子类), 就在子类中重写

Java 权限范围：
private<默认<protect<public



 */
public class demo07 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call();
        np.sendMessage();
    }
}
