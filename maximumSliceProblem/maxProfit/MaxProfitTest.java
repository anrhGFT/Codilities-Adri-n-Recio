package com.codilities;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.maximumSliceProblem.MaxProfit;
public class MaxProfitTest {
    
private MaxProfit maxProfit=new MaxProfit();

    @Test
    public void highestProfitOfAstockBoughtAGivenDayAndSoldTheDayWhereHighest(){
            MaxProfit maxProfit=new MaxProfit();
            maxProfit.daysStockPrices=new int []{23171,21011,21123,21366,21013,21367};
            int highestProfit=maxProfit.getMaxPossibleProfitAStockCanBeSoldFor(4);
            assertEquals(354, highestProfit);
    }
    
    @Test
    public void getMaxPossibleProfitOutOfAllthePossiblSellings(){
            MaxProfit maxProfit=new MaxProfit();
            maxProfit.daysStockPrices=new int []{8, 9, 3, 6, 1, 2};
            int highestPossibleProfitOutofAllSellings=maxProfit.getMaxPossibleProfit();
            assertEquals(3, highestPossibleProfitOutofAllSellings);
    }
    @Test
    public void noProfit(){
            MaxProfit maxProfit=new MaxProfit();
            maxProfit.daysStockPrices=new int []{10,9,8,7};
            int highestPossibleProfitOutofAllSellings=maxProfit.getMaxPossibleProfit();
            assertEquals(0, highestPossibleProfitOutofAllSellings);
    }
}
