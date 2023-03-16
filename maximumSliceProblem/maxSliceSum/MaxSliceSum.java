package com.codilities.maximumSliceProblem;

import java.util.Arrays;

public class MaxSliceSum {

  public int[] arr;

  public int getMaxSliceSumOfTheWholeArray(int[] arr) {
    this.arr = arr;
    int biggestSliceSum = 0;
    if(arr.length==1)return sumSlice(0,arr.length-1);
    for (int i = 0; i < arr.length; i++) {
      int indxBiggestSliceSum = getTheMaxSliceSumStartingFromGivenIndx(i);
      if (i == 0) biggestSliceSum = indxBiggestSliceSum;
      biggestSliceSum =
        indxBiggestSliceSum > biggestSliceSum
          ? indxBiggestSliceSum
          : biggestSliceSum;
    }

    return biggestSliceSum;
  }

  public int getTheMaxSliceSumStartingFromGivenIndx(int startIndx) {
    int indxBiggestSliceSum = sumSlice(startIndx, 0);
    int substractingIndex = -1;
    
    while (
      arr.length + substractingIndex !=startIndx &&
      startIndx != arr.length - 1
    ) {
      int currentSumSlice = sumSlice(startIndx, substractingIndex);
      indxBiggestSliceSum =
        currentSumSlice > indxBiggestSliceSum
          ? currentSumSlice
          : indxBiggestSliceSum;
      substractingIndex--;
    }

    return indxBiggestSliceSum;
  }

  public int sumSlice(int startIndx, int substractingIndex) {
     if(startIndx==arr.length-1 || substractingIndex==0)return Arrays.stream(arr, startIndx, arr.length).sum(); 
    return Arrays.stream(arr, startIndx, arr.length + substractingIndex).sum();
  }
}
