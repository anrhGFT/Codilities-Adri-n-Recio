package com.codilities;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.primeAndCompositeNumbers.Peaks;

public class PeaksTest {
    

    private Peaks peaks=new Peaks();



    public void arrayCanBeSplittedIntoThreeBlocksAndEachBlockContainsAPeak(){
       Peaks peaks=new Peaks();
        peaks.heights=new int[]{1,2,3,4,3,4,1,2,3,4,6,2};
        peaks.createPeakIndexesArr();
        boolean blocksContainPeaks;
    }
   @Test
    public void createHeightIndexesArr(){
        Peaks peaks=this.peaks;
        peaks.heights=new int[]{1,2,3,2};
       int []heightsIndexesArr= peaks.createHeightsIndexesArr();
       
        assertArrayEquals(new int[]{0,1,2,3}, heightsIndexesArr);
    }

    @Test
    public void blockContainsPeak(){
        Peaks peaks=this.peaks;
        peaks.peaks=new int[]{2,3,4,5};
        int []block=new int[]{0,1,2};
        boolean blockContainsPeak=peaks.checkIfBlockContainsPeaks(block);
        assertEquals(true,blockContainsPeak );
    }
    @Test
    public void blockDoesNotContainPeak(){
        Peaks peaks=this.peaks;
        peaks.peaks=new int[]{2,3,4,5};
        int []block=new int[]{0,1};
        boolean blockContainsPeak=peaks.checkIfBlockContainsPeaks(block);
        assertEquals(false,blockContainsPeak );
    }
   @Test
    public void allBlocksContainPeaks(){
        Peaks peaks=new Peaks();
        peaks.heights=new int[]{1,2,1,2,3,2};
        int blocks=2;
        peaks.heightsIndexesArr=peaks.createHeightsIndexesArr();
        peaks.createPeakIndexesArr();
       
        assertEquals(true, peaks.allBlocksContainPeaks(blocks));
    }
   @Test
    public void heightsLengthIsOdd(){
        Peaks peaks=new Peaks();
        int []heights=new int[]{1,2,1,2,3,2,2};
        int maxAmountOfBlocks=peaks.peaks(heights);
        assertEquals(1, maxAmountOfBlocks);
    }

    


    
}
