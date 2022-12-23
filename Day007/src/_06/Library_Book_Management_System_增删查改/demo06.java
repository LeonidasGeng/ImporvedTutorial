package _06.Library_Book_Management_System_增删查改;

import java.util.*;

import static java.lang.System.exit;

/*
图书管理系统_功能分析
//看得见的功能part1
1，欢迎页面
//后台初始化
2，书籍初始化(先准备一批书)
//看得见的功能part2
3，查看书籍
4，添加书籍
5，删除书籍
6，编辑书籍

功能实现
1.欢迎页面
   1.1 打印相关信息
   1.2 让用户选择输入
   1.3 根据用户输入的数字匹配不同的功能
   1.4 死循环（一直循环，完成某个功能后，回到欢迎页面）
2.初始化书籍
   2.1 定义书籍类（包含书名和价格）
   2.2 创建名著的集合
   2.3 创建IT书籍集合
   2.4把数据保存到Map中
3.查看书籍（先做查看，这样之后的功能都能做检测）
    3.1 打印标题信息
    3.2 遍历Map集合，打印相关信息
4.添加书籍
    4.1 输入要添加书的类型
    4.2 输入要添加的书名
    4.3 输入要添加书的价格
    4.4 根据书名和价格创建一本书
    4.5 根据输入的类型作为键找到值（书籍集合）
    4.6 往集合XX添加新的书

推荐优先实现“查看功能”
 */
public class demo06 {

    //2，书籍初始化
    //2.1定义书籍类Book class
    //成员变量保存书籍
    private static Map<String, ArrayList<Book>> map = new HashMap<>();
    // private static int a = 10;
    //在static代码块中初始化书籍，👆存在Map中
    static {
//        2.1 定义书籍类（包含书名和价格） ===👉
//        2.2 创建名著的集合 ArrayList<Book>
        //类型        书名      价格
        //名著        红楼梦     19.99
        //    键:类型（类型）  值：集合（书）
        //Map<String, ArrayList<Book>>    集合嵌套
        ArrayList<Book> mz = new ArrayList<>();
        mz.add(new Book("西游记",18.8));
        mz.add(new Book("水浒传",28.8));

//        2.3 创建IT书籍集合
        ArrayList<Book> IT = new ArrayList<>();
        IT.add(new Book("JAVA从入门到入坟",38.8)) ;
        IT.add(new Book("Python从入门到入坟",48.8)) ;

//        2.4把数据保存到Map中
        map.put("名著",mz);
        map.put("IT书籍",IT);

        //书籍准备（初始化）完毕👆
    }

    //1.查看书籍
    //idea自动生成方法
    //先写方法名：showBooks(); alt+回车 选择 Create Method

    private static void addBooks(){
        System.out.println("请输入要添加的类型：");
    }

    //1.欢迎页面
    public static void main(String[] args) {
        //1.欢迎页面
        //1.4死循环（一直循环，完成某个功能后，回到欢迎页面）
        while (true) {
            //1.1 打印欢迎面信息
            System.out.println("----------欢迎来到图书馆里系统----------");
            System.out.println("1, 查看书籍");
            System.out.println("2, 添加书籍");
            System.out.println("3, 删除书籍");
            System.out.println("4, 修改书籍");
            System.out.println("5, 退出");
            System.out.println("请输入你的选择： ");
            //1.2让用户输入选择
            Scanner sc = new Scanner(System.in);
            sc.nextInt();
            int number = sc.nextInt();
            //1.3根据用户输入的字数匹配不同的功能
            switch (number) {
                case 1:
                    System.out.println("用户选择了1");
                    showBooks();
                    break;
                case 2:
                    System.out.println("用户选择了2");
                    break;
                case 3:
                    System.out.println("用户选择了3");
                    break;
                case 4:
                    System.out.println("用户选择了4");
                    break;
                case 5:
                    System.out.println("欢迎您下次再来");
                    System.exit(0);
                default:
                    System.out.println("没有这样的操作");
            }
        }
    }
    private static void showBooks() {
        //        3，1 打印标题信息  \t ===> 空格
        System.out.println("类型\t\t\t书名\t\t价格");
//        3，2 遍历Map集合
        Set<Map.Entry<String, ArrayList<Book>>> entrySet = map.entrySet();
        //map.entryset.for 遍历Map集合，
        for (Map.Entry<String, ArrayList<Book>> entry : entrySet) {
            //获取键（名著）
            String key = entry.getKey();
            System.out.println(key);
            //获取值（ArrayList集合）
            ArrayList<Book> value = entry.getValue();
            //得到的值是ArrayList集合
            //需要遍历ArrayList集合 value.for
            for (Book book : value) {
                System.out.println(book.getName()+"\t"+book.getPrice());
            }
        }
    }
}
