package com.codilities.prefixSums;

import java.util.Arrays;

public class PassingCars {
    


      public int passingCars(int []carsAndDirection){
        int passingCount=0;
        if(allCarsGowest(carsAndDirection)==true)return passingCount;
        if(allCarsGoEast(carsAndDirection)==true)return passingCount;
        passingCount=passingCarsCount(carsAndDirection);
        
        
        
        return passingCount;

      }

      public boolean allCarsGowest(int []carsAndDirection){
            return Arrays.stream(carsAndDirection).allMatch(x->x==1);
      }
      public boolean allCarsGoEast(int []carsAndDirection){
        return Arrays.stream(carsAndDirection).allMatch(x->x==0);
  }

  public int passingCarsCount(int[] carsAndDirection){
     int passingCount=0;
    for (int i = 0; i < carsAndDirection.length; i++) {
        if(carsAndDirection[i]==0){
        for (int j = i; j < carsAndDirection.length; j++) {
            if(carsAndDirection[j]==1)passingCount++;

        }
        }
    }
    if(passingCount>1000000)passingCount=-1;
return passingCount;
  }
}
