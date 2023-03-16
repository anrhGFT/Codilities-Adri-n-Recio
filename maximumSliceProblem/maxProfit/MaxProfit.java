package com.codilities.maximumSliceProblem;

import java.util.Arrays;

public class MaxProfit {

  public int[] daysStockPrices;

  public int maxProfit(int[] daysStockPrices) {
    this.daysStockPrices = daysStockPrices;
    return getMaxPossibleProfit();
  }

  public int getMaxPossibleProfit() {
    int maxPossibleProfit = 0;
    for (int day = 0; day < daysStockPrices.length; day++) {
      int maxStockSell = getMaxPossibleProfitAStockCanBeSoldFor(day);
      maxPossibleProfit =
        maxStockSell > maxPossibleProfit
          ? maxStockSell
          : maxPossibleProfit;
    }
    return maxPossibleProfit;
  }

  public int getMaxPossibleProfitAStockCanBeSoldFor(int dayIndx) {
    int priceStckWasBghtFor = daysStockPrices[dayIndx];
    int highestPriceToSellFor = 0;
    if (dayIndx != daysStockPrices.length - 1) {
      highestPriceToSellFor =
        Arrays
          .stream(daysStockPrices, dayIndx + 1, daysStockPrices.length)
          .reduce((x, y) -> x > y ? x : y)
          .getAsInt();
    }
    if (highestPriceToSellFor <= 0) {
      return highestPriceToSellFor;
    }

    return stockSellValue(highestPriceToSellFor, priceStckWasBghtFor);
  }

  public int stockSellValue(int priceStockWasSoldFor, int priceStckWasBghtFor) {
    return priceStockWasSoldFor - priceStckWasBghtFor;
  }
}
