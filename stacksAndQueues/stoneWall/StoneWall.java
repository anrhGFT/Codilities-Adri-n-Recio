package com.codilities.stacksAndQueues;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 

public class StoneWall {
    private List<Integer> wallHeightsList = new ArrayList<>();

    public int minAmountOfblocksNeddedToBuildTheWall(int[] wallHeights) {

        wallHeightsList = Arrays.stream(wallHeights).boxed().collect(Collectors.toList());
        if (wallHeightsList.size() > 1) {
            for (int currentPositionIndx = 0; currentPositionIndx < wallHeightsList.size(); currentPositionIndx++) {

                compareHeights(currentPositionIndx);
                if (wallHeightsList.size() < 2)
                    return wallHeightsList.size();

            }
        }
        return wallHeightsList.size();

    }

    private boolean bothHeightsEqual(int currentPositionHeight, int comparingPositionHeight) {
        return currentPositionHeight == comparingPositionHeight;
    }

    private boolean comparingHeightSmallerThanCurrentHeight(int comparingPositionHeight, int currentPositionHeight) {
        return comparingPositionHeight < currentPositionHeight;
    }

    private void compareHeights(int currentPositionIndx) {
        int currentPositionHeight = wallHeightsList.get(currentPositionIndx);
        for (int comparingPositionIndx = currentPositionIndx + 1; comparingPositionIndx < wallHeightsList
                .size(); comparingPositionIndx++) {
            int comparingPositionHeight = wallHeightsList.get(comparingPositionIndx);
            if (comparingHeightSmallerThanCurrentHeight(comparingPositionHeight, currentPositionHeight)) {
                break;
            }
            if (bothHeightsEqual(currentPositionHeight, comparingPositionHeight)) {
                wallHeightsList.remove(comparingPositionIndx);
                comparingPositionIndx--;
            }

        }
    }
}
