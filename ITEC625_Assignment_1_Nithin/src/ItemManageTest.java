import static org.junit.Assert.*;

import org.junit.Test;

public class ItemManageTest {


    @Test
    public void totalSellVol() {


        assertEquals(ItemManage.totalSellVol(1.1,  2.2,  3.3), 7);
        assertEquals(ItemManage.totalSellVol(1.1,  2.2,  3.1), 6);
        assertEquals(ItemManage.totalSellVol(2332.1,  2222.2222,  33333.1), 37887);
        assertEquals(ItemManage.totalSellVol(1.9,  2222.9999,  33333.1), 35558);

        //assertEquals(ItemManage.returnItemName(teststr, "273461"), "WaterMelon");
    }

    @Test
    public void checkNameValid() {
        assertEquals(ItemManage.checkNameValid('a'), true);
        assertEquals(ItemManage.checkNameValid('Z'), true);
        assertEquals(ItemManage.checkNameValid('!'), true);
        assertEquals(ItemManage.checkNameValid('*'), true);
        assertEquals(ItemManage.checkNameValid('}'), false);
        assertEquals(ItemManage.checkNameValid(';'), false);
        assertEquals(ItemManage.checkNameValid('2'), false);

    }

    @Test
    public void checkStockValue() {

        assertEquals(ItemManage.checkStockValue(1, 1, 2), true);
        assertEquals(ItemManage.checkStockValue(100, 100, 10000), false);
        assertEquals(ItemManage.checkStockValue(12, 12, 140), false);
        assertEquals(ItemManage.checkStockValue(3, 1333, 4000), true);

    }

    @Test
    public void medianPriceFruit() {

        assertEquals(ItemManage.medianPriceFruit(1, 1, 2), 0);
        assertEquals(ItemManage.medianPriceFruit(100, 100, 100), 0);
        assertEquals(ItemManage.medianPriceFruit(12, 112, 140), 2);
        assertEquals(ItemManage.medianPriceFruit(3, 1333, 40), 3);
        assertEquals(ItemManage.medianPriceFruit(11, 1111, 2), 1);

    }

    @Test
    public void numOfSoldKind() {
        assertEquals(ItemManage.numOfSoldKind('Z', 'Z', 'Z'), 1);
        assertEquals(ItemManage.numOfSoldKind('q', 'q', 'q'), 1);
        assertEquals(ItemManage.numOfSoldKind('t', 'Z', 'P'), 3);
        assertEquals(ItemManage.numOfSoldKind('f', 'q', 'h'), 3);
        assertEquals(ItemManage.numOfSoldKind('y', 'y', 'r'), 2);

    }

    @Test
    public void warnExpireDate() {
        assertEquals(ItemManage.warnExpireDate(0), 'g');
        assertEquals(ItemManage.warnExpireDate(3), 'g');
        assertEquals(ItemManage.warnExpireDate(5), 'o');
        assertEquals(ItemManage.warnExpireDate(10), 'b');
        assertEquals(ItemManage.warnExpireDate(-100), 'n');


    }

    @Test
    public void isPurchasedSameDay() {
        assertEquals(ItemManage.isPurchasedSameDay(20180109, 20100109, 20110109), false);
        assertEquals(ItemManage.isPurchasedSameDay(20170307, 20170307, 20170307), true);
        assertEquals(ItemManage.isPurchasedSameDay(20181111, 20181112, 20181113), false);
        assertEquals(ItemManage.isPurchasedSameDay(20190131, 20190131, 20190131), true);

    }


    @Test
    public void itemWithLargerProfit() {

        assertEquals(ItemManage.itemWithLargerProfit(122, 12, 2, 122, 22, 12), 0);
        assertEquals(ItemManage.itemWithLargerProfit(1222, 122, 121,  100, 100, 1), -1);
        assertEquals(ItemManage.itemWithLargerProfit(2018, 2018, 2018, 0, 1000, 1000), 0);
        assertEquals(ItemManage.itemWithLargerProfit(20, 100, 1,  200, 99, 98), 1);

    }

}
