package ds.test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class StockTest {
    Stock stock=new Stock();
    @DataProvider(name="paramData")
    public static Object[][] getParamData(){
        String [][] data={{"goods1","23","2018-01-01"},{"goods2","25","2018-01-01"},{"goods3","12","2018-01-01"}};
        return data;
    }
    @Test(dataProvider="paramData")
    public void testGetStock(String goodsName,String num,String stockDate) throws Exception {
        System.out.println("-------StockTest-------");
        stock.getStock(goodsName,num,stockDate);
    }
}