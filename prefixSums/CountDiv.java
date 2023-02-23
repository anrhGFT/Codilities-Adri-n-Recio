package com.codilities.prefixSums;

import java.util.stream.IntStream;

public class CountDiv {

    public int atoBdivisibleByK(int A,int B,int K){
        int timesIsDivisible=0;
        int []rangeAtoB=createRangeAtoB(A, B);
        timesIsDivisible=countDivisibleTimes(rangeAtoB, K);

        return timesIsDivisible;
    }


    public int[] createRangeAtoB(int A, int B){

        return IntStream.rangeClosed(A, B).toArray();
    }


    public int countDivisibleTimes(int[]rangeAtoB,int k){
        int timesIsDivisible=0;      
        for (int i : rangeAtoB) {
               if(i%k==0)timesIsDivisible++;     
                }
                return timesIsDivisible;
    }
}
