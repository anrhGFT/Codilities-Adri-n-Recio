package com.codilities.primeAndCompositeNumbers;

import java.util.stream.IntStream;

public class Flags {

  int[] heights;

  public int flags(int[] heights) {
    this.heights = heights;
    int[] peakIndexesArr = getPeakIndexesArr();
    return countFlags(peakIndexesArr);
  }

  public int[] getPeakIndexesArr() {
    return IntStream
      .range(1, heights.length - 1)
      .filter(x -> checkIfHeightIsAPeak(x) == true)
      .toArray();
  }

  public Boolean checkIfHeightIsAPeak(int heightIndx) {
    if (heightIndx == 0 || heightIndx == heights.length - 1) return false;
    int currentHeight = heights[heightIndx];
    int nextHeight = heights[heightIndx + 1];
    int previousHeight = heights[heightIndx - 1];
    if (currentHeight > nextHeight && currentHeight > previousHeight) return true;
    return false;
  }

  public int countFlags(int[] peakIndexesArr) {
    int flags = peakIndexesArr.length;
    if (peakIndexesArr.length == 1) return 1;

    if (flags > 1) {
      for (int currentFlags = flags; currentFlags > 0; currentFlags--) {
        int flagCount = 1;

        for (int peakIndx = 0; peakIndx < peakIndexesArr.length; peakIndx++) {
          if (peakIndx == peakIndexesArr.length - 1) break;
          for (int nextPeakIndx = peakIndx + 1; nextPeakIndx < peakIndexesArr.length; nextPeakIndx++) {
           
            if (peakIndexesArr[peakIndx] + currentFlags <= peakIndexesArr[nextPeakIndx]) {
              flagCount++;
              peakIndx = nextPeakIndx;
            }
            if (flagCount == currentFlags) return currentFlags;
          }
        }
      }
    }

    return 0;
  }
}
