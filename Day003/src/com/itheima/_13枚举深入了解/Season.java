package com.itheima._13枚举深入了解;

// 季节
public enum Season {
    //春,     夏,      秋,     冬
    SPRING, SUMMER, AUTUMN, WINTER;
}


/*
// 反编译后
// 枚举本质上是一个类
public final class Season extends Enum {
	public static final Season SPRING = new Season("SPRING", 0);;
	public static final Season SUMMER = new Season("SUMMER", 1);;
	public static final Season AUTUMN = new Season("AUTUMN", 2);;
	public static final Season WINTER = new Season("WINTER", 3);;

	private Season(String s, int i) {
		super(s, i);
	}
}
 */