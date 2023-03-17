package com.codilities.maximumSliceProblem;

import java.util.Arrays;

public class MaxDoubleSliceSum {
      public int [] arr;

  
      public int getMaxDoubleSliceSumOfTheWholeArray(int[] arr) {
        this.arr = arr;
        int biggestSliceSum = 0;
        if(arr.length==3)return 0;
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
        int biggestDoubleSliceSum =0;
        int substractingIndex = -1;
        int middleIndx=startIndx+1;
        while (
          startIndx<middleIndx && middleIndx<arr.length+substractingIndex
        ) {
            int middleIndxIncrement=middleIndx;
          while(middleIndxIncrement<arr.length+substractingIndex){
            int currentSumSlice = doubleSumSlice(startIndx,middleIndxIncrement, substractingIndex);
          biggestDoubleSliceSum =
            currentSumSlice > biggestDoubleSliceSum
              ? currentSumSlice
              : biggestDoubleSliceSum;
              middleIndxIncrement++;
            }
          substractingIndex--;
          
          middleIndx++;
        }
    
        return biggestDoubleSliceSum;
      }
  
      public int doubleSumSlice(int startIndx, int middleIndx,int substractingIndex) {
        int []arrSlice=arr.clone();

        arrSlice[startIndx]=0;
        arrSlice[middleIndx]=0;
        //if(startIndx==arr.length-1 || substractingIndex==0)return Arrays.stream(arr, startIndx, arr.length).sum(); 
       return Arrays.stream(arrSlice, startIndx, arr.length + substractingIndex).sum();
     }
}
