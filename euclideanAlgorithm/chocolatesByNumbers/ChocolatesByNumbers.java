package com.codilities.euclideanAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ChocolatesByNumbers {
    
            public int countChocolatesByNumbers(int N,int M){
                List<Integer>wrapperIndxs=new ArrayList<>();
                int chocolateCount=0;
                int chocolatePos=0;
                 while(wrapperIndxs.contains(chocolatePos)!=true){
                    if(chocolatePos>N-1){
                        while (chocolatePos>N-1) {
                            chocolatePos-=N;
                        }
                       
                    }
                     if(wrapperIndxs.contains(chocolatePos))break;
                        wrapperIndxs.add(chocolatePos);
                        chocolatePos+=M;
                        chocolateCount++;
                   
                    
                 }

              
                return chocolateCount;
            }

}
