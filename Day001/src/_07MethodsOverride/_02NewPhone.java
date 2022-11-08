package _07MethodsOverride;

public class _02NewPhone extends _01OldPhone{
    //把父类已有的方法重新写一遍
    @Override
    public void call() {
        System.out.println("语音通话，视频通话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发文字短信，语音短信和图片短信");
    }
}
