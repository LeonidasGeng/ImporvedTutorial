package _01.JUnit;

import org.junit.*;

/*

    @Before: 用来修饰方法，该方法会在每一个测试方法执行之前执行一次
    @After:  用来修饰方法，该方法会在每一个测试方法执行之后执行一次
    @BeforeClass: 用来修饰静态方法，该方法会在所有测试方法执行之前执行一次
    @AfterClass:  用来修饰静态方法，该方法会在所有测试方法执行之后执行一次

    //testBeforeClass
    //testBefore
    //test01
    //testAfter
    //testBefore
    //test02
    //testAfter
    //testAfterClass
 */

public class testSecond {
    //testBeforeClass
    //testBefore
    //test01
    //testAfter
    //testBefore
    //test02
    //testAfter
    //testAfterClass

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("testBeforeClass");
    }

    @AfterClass
    public static void testAfterClass() {
        System.out.println("testAfterClass");
    }

    @Before
    public void testBefore() {
        System.out.println("testBefore");
    }

    @After
    public void testAfter() {
        System.out.println("testAfter");
    }

    @Test
    public void test01() {
        System.out.println("test01");
    }
    //testBeforeClass
    //testBefore
    //test01
    //testAfter
    //testAfterClass
    @Test
    public void test02() {
        System.out.println("test02");
    }
    //testBeforeClass
    //testBefore
    //test02
    //testAfter
    //testAfterClass

}
