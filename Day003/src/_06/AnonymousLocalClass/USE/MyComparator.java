package _06.AnonymousLocalClass.USE;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;//指定排序方式，不是重点
    }
}
