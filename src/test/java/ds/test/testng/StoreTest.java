package ds.test.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StoreTest {
    Store store=new Store();
    Store store1;
    /**
     * 异常测试
     */
    @Test(enabled=true,expectedExceptions=NullPointerException.class)
    public void testShowNemGoodsNum() throws Exception {
        System.out.println("-------StoreTest-------");
        store1.showNewGoodsNum();
    }
    /**
     * 超时测试,10ms
     */
    @Test(timeOut = 10)
    public void testGetGoodsNum() {
        int goodsNum=100;
        System.out.println("-------StoreTest-------");
        store.getGoodsNum(goodsNum);
    }
    /**
     * 依赖测试
     */
    @Test(dependsOnMethods = {"testGetStoreTypeFirst","testGetStoreTypeSecond"})
    public void testGetStoreTypeThird(){
        System.out.println("-------StoreTest-------");
        store.getStoreTypeThird();
    }
    @Test
    public void testGetStoreTypeFirst() {
        System.out.println("-------StoreTest-------");
        store.getStoreTypeFirst();
    }
    @Test
    public void testGetStoreTypeSecond(){
        System.out.println("-------StoreTest-------");
        store.getStoreTypeSecond();
    }
}