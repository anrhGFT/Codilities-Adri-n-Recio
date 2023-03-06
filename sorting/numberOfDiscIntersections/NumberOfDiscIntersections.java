package com.codilities.sorting;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDiscIntersections {

    Set<Set<Integer>> intersectsPairsSet = new HashSet<>();

    public int countDiscIntersections(int[] discsArr) {

        for (int mainDiscPos = 0; mainDiscPos < discsArr.length; mainDiscPos++) {
            for (int comparingDiscPos = 0; comparingDiscPos < discsArr.length; comparingDiscPos++) {

                if (mainDiscPos != comparingDiscPos) {
                    Boolean intersect = checkIfTwoDiscsIntersect(mainDiscPos, discsArr[mainDiscPos], comparingDiscPos,
                            discsArr[comparingDiscPos]);
                    if (intersect == true)

                        intersectsPairsSet.add(createIntesersectionPairSet(mainDiscPos, comparingDiscPos));
                }
            }
        }
        if (intersectsPairsSet.size() > 10000000)
            return -1;
        return intersectsPairsSet.size();
    }

    public Boolean checkIfTwoDiscsIntersect(int mainDiscPos, int mainDiscRadius, int comparingDiscPos,
            int comparingDiscRadius) {
        Long mainDiscLeftPos = Long.valueOf(mainDiscPos) - Long.valueOf(mainDiscRadius);
        Long mainDiscRightPos = Long.valueOf(mainDiscPos) + Long.valueOf(mainDiscRadius);
        Long comparingDiscLeftPos = Long.valueOf(comparingDiscPos) - Long.valueOf(comparingDiscRadius);
        Long comparingDiscRightPos = Long.valueOf(comparingDiscPos) + Long.valueOf(comparingDiscRadius);
        if (mainDiscLeftPos < comparingDiscLeftPos && mainDiscRightPos > comparingDiscRightPos)
            return true;
        if (mainDiscLeftPos > comparingDiscLeftPos && mainDiscRightPos < comparingDiscRightPos)
            return true;
        if (mainDiscLeftPos <= comparingDiscRightPos && mainDiscLeftPos >= comparingDiscLeftPos)
            return true;
        if (mainDiscRightPos >= comparingDiscLeftPos && mainDiscRightPos <= comparingDiscRightPos)
            return true;
        return false;
    }

    public Set<Integer> createIntesersectionPairSet(int mainDiscPos, int comparingDiscPos) {
        Set<Integer> pairSet = new HashSet<>();
        pairSet.add(mainDiscPos);
        pairSet.add(comparingDiscPos);

        return pairSet;
    }

}
