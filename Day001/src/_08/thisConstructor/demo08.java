package _08.thisConstructor;

public class demo08 {
    public static void main(String[] args) {
//        Dog d1 = new Dog("旺财1", 3, "black");
//        Dog d2 = new Dog("旺财2", 4, "black");
//        Dog d3 = new Dog("旺财3", 5, "black");
//        Dog d4 = new Dog("旺财4", 6, "black");
//        Dog d5 = new Dog("旺财5", 7, "black");

        //默认颜色黑色，this的作用
        Dog d1 = new Dog("旺财1", 3);
        System.out.println("狗狗名叫"+d1.getName()+", 年龄为"+d1.getAge()+", 颜色为"+d1.getColor());
        Dog d2 = new Dog("旺财2", 4);
        Dog d3 = new Dog("旺财3", 5);
        Dog d4 = new Dog("旺财4", 6);
        Dog d5 = new Dog("旺财5", 7);

    }
}
