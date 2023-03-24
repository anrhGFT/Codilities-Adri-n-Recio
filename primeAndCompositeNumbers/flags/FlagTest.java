package com.codilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.primeAndCompositeNumbers.Flags;

public class FlagTest {
   
    

    private Flags flags= new Flags();

     @Test
     public void maxAmountOfFlagsPossibleToSetWhenGivenAlistOfPeakDistances(){
        int []peakIndexesArr={1,3,5,10};
        int maxAmountOfFlags=flags.countFlags(peakIndexesArr);
        assertEquals(3, maxAmountOfFlags);
     }
     @Test
     public void maxAmountOfFlagsWhereTheresOnlyOnePeak(){
        int []heights={1,3,2};
        int maxAmountOfFlags=flags.flags(heights);
        assertEquals(1, maxAmountOfFlags);
     }
     @Test
     public void onesAndZeroes(){
        int []heights={0,0,0,0,1,0,1,0,1,0,0,1,0};
        int maxAmountOfFlags=flags.flags(heights);
        assertEquals(3, maxAmountOfFlags);
     }
}
