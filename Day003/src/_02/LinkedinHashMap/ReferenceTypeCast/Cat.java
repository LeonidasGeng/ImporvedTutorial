package _02.LinkedinHashMap.ReferenceTypeCast;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
