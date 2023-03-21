package com.codilities.primeAndCompositeNumbers;

public class CountFactors {
    

    public int countFactors(int num){
        int factorCount=0;
        int i=num;
        while (i>0) {
            factorCount=num%i==0?factorCount+=1:factorCount;
            i--;
        }
        return factorCount;
    }
}
