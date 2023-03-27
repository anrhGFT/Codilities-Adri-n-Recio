package com.codilities.primeAndCompositeNumbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Peaks {
   
    public int[]heights;
    public int[]peaks;
    public int[]heightsIndexesArr;
    public int peaks(int []givenHeights){
        if(givenHeights.length<3)return 0;
        heights=givenHeights;
        createPeakIndexesArr();
        heightsIndexesArr=createHeightsIndexesArr();
        int blocks=peaks.length;
        
        while (blocks!=0) {
            while(heights.length%blocks!=0)blocks--;
            if(allBlocksContainPeaks(blocks)==true)return blocks;
            blocks--;
        }
        return 0;

    }

    public void createPeakIndexesArr() {
        peaks= IntStream
          .range(1, heights.length - 1)
          .filter(x -> checkIfHeightIsAPeak(x) == true)
          .toArray();
      }
    public int[] createHeightsIndexesArr() {
        return IntStream
          .range(0, heights.length )
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

      public boolean allBlocksContainPeaks(int blocks){
        int count=0;
        int currentPos=0;
        int blockLength=heightsIndexesArr.length/blocks;
        while(count!=blocks){
        int []block=Arrays.copyOfRange(heightsIndexesArr, currentPos, currentPos+blockLength);
        if(checkIfBlockContainsPeaks(block)==false){
            return false;
        }
        else{
            currentPos+=blockLength;
            count++;
        }
    }
        return true;
      }

      public boolean checkIfBlockContainsPeaks(int[]block){
        for (int i = 0; i < peaks.length; i++) {
            int peak=peaks[i];
            if(Arrays.stream(block).filter(x->x==peak).toArray().length!=0)return true;
        }
        return false;

      }
    
}
