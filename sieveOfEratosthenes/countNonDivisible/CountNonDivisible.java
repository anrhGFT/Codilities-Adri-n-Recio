package com.codilities.sieveOfEratosthenes;


import java.util.Arrays;

public class CountNonDivisible {
    
    int[]nums;

     public void setNums(int []givenArray){
        this.nums=givenArray;
     }

      public int[] countNonDivisible(int []givenArray){
        setNums(givenArray);
        int []nonDivCountArr=new int[givenArray.length];
        for (int i = 0; i < nonDivCountArr.length; i++) {
            nonDivCountArr[i]=countNonDivisibleNumsAGivenNumberHas(i);
        }
         return nonDivCountArr;
      }



    public int countNonDivisibleNumsAGivenNumberHas(int indx){
        int nonDivNumCount=(int)Arrays.stream(nums).filter(x->nums[indx]%x!=0).count();
        
    return nonDivNumCount;
    }
}
