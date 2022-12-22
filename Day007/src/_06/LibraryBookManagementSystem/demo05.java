package _06.LibraryBookManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
图书馆里功能分析
1，欢迎页面
2，书籍初始化，先准备一批书
3，查看书籍
4，添加书籍
5，删除书籍
6，编辑书籍

功能实现
1，欢迎页面
    1，1 打印相关信息
    1，2 让用户选择输入
    1，3 根据用户输入的数字匹配不同的功能
    1，4 死循环

2，初始化书籍
    2，1 定义书籍类（包含书名和价格）
    2，2 创建名著的集合
    2，3 创建IT书籍集合
    2，4把数据保存到Map中

3，查看书籍（先做查看，这样之后的功能都能做检测）
    3，1 打印标题信息
    3，2 遍历Map集合

4，添加书籍
    4，1 输入要添加书的类型
    4，2 输入要添加的书名
    4，3 输入要添加书的价格
    4，4 根据书名和价格创建一本书
    4，5 根据输入的类型作为键找到值（书籍集合）
    4，6 往集合XX添加新的书

 */
public class demo05 {
    //成员变量保存书籍
    private static Map<String, ArrayList<Book>> map = new HashMap<>();

    //在static代码块中初始化书籍
    static {
//        2，1 定义书籍类（包含书名和价格）
//        2，2 创建名著的集合
        ArrayList<Book> mz = new ArrayList<>();
        mz.add(new Book("西游记",18.8));
        mz.add(new Book("水浒传",28.8));

//        2，3 创建IT书籍集合
        ArrayList<Book> IT = new ArrayList<>();
        IT.add(new Book("JAVA从入门到入坟",38.8)) ;
        IT.add(new Book("Python从入门到入坟",48.8)) ;

//        2，4把数据保存到Map中
        map.put("名著",mz);
        map.put("IT",IT);

        //书籍准备完毕👆
    }

    //查看书籍
    //idea自动生成方法
    //showBooks(); alt+回车 选择 Create Method
    private static void showBooks() {
        //        3，1 打印标题信息
        System.out.println("类型\t\t\t书名\t\t价格");
//        3，2 遍历Map集合
        Set<Map.Entry<String, ArrayList<Book>>> entrySet = map.entrySet();
        for (Map.Entry<String, ArrayList<Book>> entry : entrySet) {
            //获取键
            String key = entry.getKey();
            System.out.println(key);
            //获取值
            ArrayList<Book> value = entry.getValue();
            //得到的值是ArrayList集合
            //需要遍历ArrayList集合
            for (Book book : value) {
                System.out.println(book.getName()+"\t"+book.getPrice());
            }
        }
    }
    private static void addBooks(){
        System.out.println("请输入要添加的类型：");
    }
    public static void main(String[] args) {

    }
}
