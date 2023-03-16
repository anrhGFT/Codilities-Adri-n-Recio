package com.codilities;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.maximumSliceProblem.MaxSliceSum;
public class MaxSliceSumTest {
    private MaxSliceSum maxSliceSum=new MaxSliceSum();


    @Test
    public void sliceSumGivingAnStartIndxAndAsubstractingIndx(){
     MaxSliceSum maxSliceSum=this.maxSliceSum;
     maxSliceSum.arr=new int[]{1,2,3,4};
     int startIndx=0;
     int substractingIndex=-1;
     int sum=maxSliceSum.sumSlice(startIndx, substractingIndex);
     assertEquals(6, sum);}
    @Test
    public void sliceSumGivingLastIndxAsLastIndx(){
     MaxSliceSum maxSliceSum=this.maxSliceSum;
     maxSliceSum.arr=new int[]{1,2,3,4,5};
     int startIndx=4;
     int sum=maxSliceSum.getTheMaxSliceSumStartingFromGivenIndx(startIndx);
     assertEquals(5, sum);}
    @Test
    public void sliceSumButStartingIndxAndSubstractingIndxAreAtTheSameIndx(){
     MaxSliceSum maxSliceSum=this.maxSliceSum;
     maxSliceSum.arr=new int[]{1,2,3,4};
     int startIndx=0;
     int substractingIndexNum=-3;
     int sum=maxSliceSum.sumSlice(startIndx, substractingIndexNum);
     assertEquals(1, sum);
    }
    @Test
    public void biggestSliceSumOfTheWholeArray(){
     int biggestSliceSum=maxSliceSum.getMaxSliceSumOfTheWholeArray(new int[]{3,2,-6,4,0});
     assertEquals(5, biggestSliceSum);
    }
    @Test
    public void twoElementArrayButLastNumIsTheMaxSum(){
     MaxSliceSum maxSliceSum=this.maxSliceSum;
     maxSliceSum.arr=new int[]{-8,9};

     int biggestSliceSum=maxSliceSum.getMaxSliceSumOfTheWholeArray(maxSliceSum.arr);
     assertEquals(9, biggestSliceSum);
    }

   
}
