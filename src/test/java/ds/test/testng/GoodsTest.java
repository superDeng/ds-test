package ds.test.testng;

import org.testng.annotations.Test;

public class GoodsTest {
    Goods goods=new Goods();
    @Test(groups = "goods")
    public void testGetSalePrice() throws Exception {
        System.out.println("-------GoodsTest-------");
        goods.getSalePrice();
    }
    @Test(groups = "goods")
    public void testGetStock() throws Exception {
        System.out.println("-------GoodsTest-------");
        goods.getStock();
    }
    @Test(groups = "goods")
    public void testGetSaleNumber() throws Exception {
        System.out.println("-------GoodsTest-------");
        goods.getSaleNumber();
    }
    @Test(groups = "order")
    public void getOrderNo() throws Exception {
        System.out.println("-------GoodsTest-------");
        goods.getOrderNo();
    }
    @Test(groups = {"goods","order"})
    public void getOrderSaleMan() throws Exception {
        System.out.println("-------GoodsTest-------");
        goods.getOrderSaleMan();
    }
    @Test(dependsOnGroups = {"goods","order"})
    public void getAll(){
        System.out.println("-------GoodsTest-------");
        System.out.println("-------getAll-------\n\n\n");
    }
}