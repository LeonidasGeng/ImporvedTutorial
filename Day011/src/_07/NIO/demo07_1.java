package _07.NIO;
/*
NIO is  New IO/Non-blocking IO

阻塞式IO
    没有数据就一直等
非阻塞式IO
    如果没有数据，不会一直等待，可以做其他事情
    好处：不需要一直等待，当有数据来才需要处理，没有数据可以做其他操作

Chanel
    可以双向传输数据
ByteBuffer
    相当于byte[]，可以保存要发送和接受的数据
    效率比byte[]要高，功能更强大
Selector
    选择器，相当于门卫大爷，可以管理多个链接

一个线程就可以处理多个通道
 */
public class demo07_1 {
}
