package _10.Dead_Lock;
/*
死锁
多线程在执行过程中 竞争锁 而造成的 相互等待 对方锁的现象

举例
    甲：拿着A锁等B锁
    乙：拿着B锁等A锁

产生条件
    1，多个线程
    2，多把锁
    3，多个锁嵌套

解决死锁
干掉3个条件中的某一个

 */
public class demo10 {
}
