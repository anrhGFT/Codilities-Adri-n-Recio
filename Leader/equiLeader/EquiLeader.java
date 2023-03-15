package com.codilities.leader;

import java.util.Arrays;

public class EquiLeader {
      public int biggestCountNum;
      public int[] equiLeaderArr;

    public int amountOfLeaders(int []givenArr) {
       equiLeaderArr = givenArr; 
        int leaderCount = 0;
        if(indxOfNumberWhichCountBiggerThanHalfOfArrayLength()==-1 || equiLeaderArr.length==1)return 0;
        biggestCountNum = equiLeaderArr[indxOfNumberWhichCountBiggerThanHalfOfArrayLength()];
        
        for (int i = 0; i < equiLeaderArr.length; i++) {
           
            if ( i!=equiLeaderArr.length-1) {
                if(isLeaderInFirstHalf(i)==true && isLeaderInSecondHalf(i)==true){
                    leaderCount++;
                }
            }
            

        }
        return leaderCount;

    }

     public Boolean isLeaderInFirstHalf(int indx){
            int firstSeqncLength=equiLeaderArr.length-(equiLeaderArr.length-1-indx);
            int firstSeqncHalfLength=Math.floorDiv(firstSeqncLength,2);
            int possibleLeaderCount=0;
            for (int i = 0; i < firstSeqncLength; i++) {
                int  comparingNum = equiLeaderArr[i];
            if (comparingNum==biggestCountNum)possibleLeaderCount++;
            if(possibleLeaderCount>firstSeqncHalfLength)return true;
            }
            
            return false;
     }
     public Boolean isLeaderInSecondHalf(int indx){
        int secondSeqncLength=equiLeaderArr.length-indx-1;
        int secondSeqncHalfLength=Math.floorDiv(secondSeqncLength,2);
            int possibleLeaderCount=0;
            for (int i = indx+1; i < equiLeaderArr.length; i++) {
                int  comparingNum = equiLeaderArr[i];
            if (comparingNum==biggestCountNum)possibleLeaderCount++;
            if(possibleLeaderCount>secondSeqncHalfLength)return true;
            }
            
            return false;
     }

    public int indxOfNumberWhichCountBiggerThanHalfOfArrayLength() {
        
        int biggestCountIndx = -1;
        int biggestCount = 0;
        for (int i = 0; i < equiLeaderArr.length; i++) {
            int num = equiLeaderArr[i];
            int currentCount = countTimesANumberAppearsWithinArray(num);
            if (countBiggerThanHalfArrayLength(currentCount) == true && currentCount > biggestCount) {
                biggestCountIndx = i;
                biggestCount = currentCount;
            }
        }
        return biggestCountIndx;
    }

    public int countTimesANumberAppearsWithinArray(int num) {

        Long count = Arrays.stream(equiLeaderArr).filter(x -> x == num).count();

        return Integer.valueOf(count.toString());
    }

    public Boolean countBiggerThanHalfArrayLength(int count) {

        return count > equiLeaderArr.length / 2;

    }
}
