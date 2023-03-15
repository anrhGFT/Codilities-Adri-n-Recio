package com.codilities.leader;

import java.util.Arrays;

public class EquiLeader {

    public int[] equiLeaderArr;

    public int amountOfLeaders(int []givenArr) {
       equiLeaderArr = givenArr; 
        int leaderCount = 0;
        if(indxOfNumberWhichCountBiggerThanHalfOfArrayLength()==-1 || equiLeaderArr.length==1)return 0;
        int biggestCountNum = equiLeaderArr[indxOfNumberWhichCountBiggerThanHalfOfArrayLength()];
        int comparingNum = 0;
        int activeLeader=0;
        
        for (int i = 0; i < equiLeaderArr.length; i++) {
            comparingNum = equiLeaderArr[i];
            if (comparingNum != biggestCountNum) {
                activeLeader=0;
            }
            if (comparingNum == biggestCountNum && activeLeader!=1) {
                leaderCount++;
                activeLeader = 1;
            }

        }
        return leaderCount;

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
