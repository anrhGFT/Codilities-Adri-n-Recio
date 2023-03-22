package com.codilities.primeAndCompositeNumbers;


import java.util.stream.IntStream;


public class MinPerimeterRectangle {

   public int minPerimeterRectangle(int area){
        
return getMinPerimeter(area);

} 

  public int getMinPerimeter(int area) {
    return IntStream
      .range(1, area + 1)
      .filter(x -> area % x == 0)
      .map(x -> calculatePerimeter(area, x))
      .min()
      .getAsInt();
  }

  public int calculatePerimeter(int area, int divisor) {
    int result = area / divisor;
    return 2 * (divisor + result);
  }
}
