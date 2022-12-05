package _07.Override;

public class NewPhone extends OldPhone{
    public void call(){
        System.out.println("语音，视频通话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发送文字短信，图片和语音短信");
    }
}
