package com.codilities.sieveOfEratosthenes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountSemiprimes {
    

    public int[] countSemiprimes(int []rangeStartArr,int []rangeEndArr){
        int[]semiPrimeNumsPerRange=new int[rangeStartArr.length];
        
        for (int i = 0; i < semiPrimeNumsPerRange.length; i++) {
            int[]rangeArr=createRangeArr(rangeStartArr[i], rangeEndArr[i]);
             semiPrimeNumsPerRange[i]=semiPrimeNumberCount(rangeArr);
        }
        
        return semiPrimeNumsPerRange;
    }


    public int[]createRangeArr(int startNumRange,int endNumRange) {
        return IntStream
          .rangeClosed(startNumRange, endNumRange)
          .toArray();
      }

    public int semiPrimeNumberCount(int [] currentRange){
        int []possiblePrimeDivisors=IntStream.rangeClosed(2, currentRange[currentRange.length-1]).filter(x->isAPrimeNumber(x)==true).toArray();
        int semiPrimeNumCount=0;
        for (int i = 0; i < currentRange.length; i++) {
           int possiblePrimeNum=currentRange[i];
            for (int j = 0; j < possiblePrimeDivisors.length; j++) {
                int possiblePrimeDivisor1=possiblePrimeDivisors[j];
             if(possiblePrimeNum % possiblePrimeDivisor1==0){
                int possiblePrimeDivisor2=possiblePrimeNum/possiblePrimeDivisor1;
                if(isAPrimeNumber(possiblePrimeDivisor2)==true)semiPrimeNumCount++;
                break;
             }
            }
        }
        return semiPrimeNumCount;
    }

    public boolean isAPrimeNumber(int num){
        int countDivisors=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0)countDivisors++;
        }
        if(countDivisors==2)return true;
        return false;
    }
}
