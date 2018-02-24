package ds.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManTest {
    Man man = new Man();
    /* *
     * 初始化类资源
     * */
    @Before
    public void setUp() throws Exception {
        //初始化一些类的信息
        man.setSex("woman");
    }
    /*
     * 销毁类资源
     * */
    @After
    public void tearDown() throws Exception {
    }
    /*
     * 测试方法体
     * */
    @Test(timeout = 10)
    public void getName() {
        System.out.println("\n\n-------------- junit test ---------------");
        String manName=man.getName(1);
        System.out.println("man name is " + manName);
    }
    @Test
    public void getSex() {
        String sex=man.getSex();
        System.out.println("-------------- junit test ---------------");
        System.out.println("man name is " + sex);
    }
}
