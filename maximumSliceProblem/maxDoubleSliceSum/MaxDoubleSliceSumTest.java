package com.codilities;

import static org.junit.Assert.assertEquals;

import com.codilities.maximumSliceProblem.MaxDoubleSliceSum;
import org.junit.Test;

public class MaxDoubleSliceSumTest {

  private MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

  @Test
  public void getDoubleSliceSum() {
    MaxDoubleSliceSum maxDoubleSliceSum = this.maxDoubleSliceSum;
    maxDoubleSliceSum.arr = new int[] { 3, 2, 6, -1, 4, 5, -1, 2 };
    int sumOfDoubleSlice = maxDoubleSliceSum.doubleSumSlice(0, 3, -2);
    assertEquals(17, sumOfDoubleSlice);
  }

  @Test
  public void getMaxDoubleSliceSumStartingFromAGivenIndx() {
    MaxDoubleSliceSum maxDoubleSliceSum = this.maxDoubleSliceSum;
    maxDoubleSliceSum.arr = new int[] { 3, 2, 6, -1, 4, 5, -1, 2 };
    int max = maxDoubleSliceSum.getTheMaxSliceSumStartingFromGivenIndx(0);
    assertEquals(17, max);
  }

  @Test
  public void getMaxDoubleSliceSumOfTheWholeArray() {
    int []arr= new int[] { 3, 2, 6, -1, 4, 5, -1, 2 };
    int max = maxDoubleSliceSum.getMaxDoubleSliceSumOfTheWholeArray(arr);
    assertEquals(17, max);
  }
  @Test
  public void arrLengthIsThree() {
    int []arr= new int[] { 3, 2, 6 };
    int max = maxDoubleSliceSum.getMaxDoubleSliceSumOfTheWholeArray(arr);
    assertEquals(0, max);
  }
}
