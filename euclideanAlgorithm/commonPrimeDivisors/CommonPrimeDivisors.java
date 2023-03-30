package com.codilities.euclideanAlgorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CommonPrimeDivisors {
    

        public int countPairsWhichHaveTheSamePrimeDivisors(int []A,int[]B){
                    int pairs=0;

                    for (int i = 0; i < B.length; i++) {
                        int[]primeDivisorsOfANum=getPrimeDivisorsFromAgivenNumber(A[i]);
                        int[]primeDivisorsOfBNum=getPrimeDivisorsFromAgivenNumber(B[i]);
                        if (Arrays.equals(primeDivisorsOfANum, primeDivisorsOfBNum)) pairs++;

                    }
     return pairs;
        }



        public int[]getPrimeDivisorsFromAgivenNumber(int num){

            return IntStream.rangeClosed(1, num).filter(x->num%x==0 &&isAPrimeNumber(x)).toArray();
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
