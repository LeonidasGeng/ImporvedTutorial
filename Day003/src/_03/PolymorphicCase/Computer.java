package _03.PolymorphicCase;

public class Computer {
    //有使用各种USB设备的功能
    //参数写接口，多态形式，可以传入任意实现类，拓展性强
    public void usUSB(USB u){
        u.connect();
        //调用USB设备的特有功能

        u.disconnect();
    }


}
