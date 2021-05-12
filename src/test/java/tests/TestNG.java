package tests;

import org.testng.annotations.Test;

public class TestNG {


    @Test
    public void test01() throws InterruptedException {
        System.out.println(String.format("test01 thread ID: %s", Thread.currentThread().getId()));
        Thread.sleep(10000);
        assert true;
    }

    @Test
    public void test02() throws InterruptedException {
        System.out.println(String.format("test02 thread ID: %s", Thread.currentThread().getId()));
        Thread.sleep(10000);
        assert true;
    }

    @Test
    public void test03() throws InterruptedException {
        System.out.println(String.format("test03 thread ID: %s", Thread.currentThread().getId()));
        Thread.sleep(10000);
        assert true;
    }
}
