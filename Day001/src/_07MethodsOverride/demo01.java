package _07MethodsOverride;
/*
方法重载：overload
同一个类中，方法名相同，参数列表不同

方法重写：override

例：
老手机：打语音电话，发文字短信
新手机：在老手机的基础上，打电话多了视频童话，发短信多了语音和图片

子类的功能比父类的功能更强大，把父类已有功能重新写一遍

@override 作为注解，检测是否为重写

注意
1,方法重写是父类与子类之间的事情
2,方法名要想他
3,参数列表要想他
4,返回值要相同
5,子类重写方法的权限大于等于父类方法的权限

 */
public class demo01 {
    public static void main(String[] args) {
        _02NewPhone np=new _02NewPhone();
        //打电话
        np.call();
        //发短信
        np.sendMessage();
    }
}
