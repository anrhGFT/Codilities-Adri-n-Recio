package com.codilities.leader;

import java.util.Arrays;

public class Dominator {

    public int[] dominatorArr;

    public int indxOfNumberWhichCountBiggerThanHalfOfArrayLength(int[] givenArr) {
        dominatorArr = givenArr;
        int biggestCountIndx = -1;
        int biggestCount = 0;
        for (int i = 0; i < dominatorArr.length; i++) {
            int num = dominatorArr[i];
            int currentCount = countTimesANumberAppearsWithinArray(num);
            if (countBiggerThanHalfArrayLength(currentCount) == true && currentCount > biggestCount) {
                biggestCountIndx = i;
                biggestCount = currentCount;
            }
        }
        return biggestCountIndx;
    }

    public int countTimesANumberAppearsWithinArray(int num) {

        Long count = Arrays.stream(dominatorArr).filter(x -> x == num).count();

        return Integer.valueOf(count.toString());
    }

    public Boolean countBiggerThanHalfArrayLength(int count) {

        return count > dominatorArr.length / 2;

    }
}
