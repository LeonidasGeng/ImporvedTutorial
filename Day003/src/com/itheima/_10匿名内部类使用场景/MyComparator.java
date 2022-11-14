package com.itheima._10匿名内部类使用场景;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2; // 指定排序方式.不是我们的重点
    }
}
