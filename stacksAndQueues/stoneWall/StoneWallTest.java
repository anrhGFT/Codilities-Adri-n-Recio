package com.codilities;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.stacksAndQueues.StoneWall;
public class StoneWallTest {
    
    private StoneWall stoneWall=new StoneWall();
    @Test
    public void stoneWallMinimunAmountOfBlocksNeededToBeBuild(){
        int [] wallHeights=new int[]{8,8,5,7,9,8,7,4,8};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(7, blockCount);
    } 
    @Test
    public void minimumAmountOfBlocksToBuildTheWallButLastTwoHeightsAreEqual(){
        int [] wallHeights=new int[]{8,8,5,7,9,8,7,4,4};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(6, blockCount);
    }  
    @Test
    public void minimumAmountOfBlocksToBuildTheWallButLastHeightIsSmallerThanPreviousOne(){
        int [] wallHeights=new int[]{8,8,5,7,9,8,7,4,3};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(7, blockCount);
    }  

    @Test
    public void minimumAmountOfBlocksToBuildTheWallButLastHeightIsBiggerThanPreviousOne(){
        int [] wallHeights=new int[]{8,8,5,7,9,8,7,3,4};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(7, blockCount);
    }  
    @Test
    public void minimumAmountOfBlocksToBuildTheWallButEachBlockIsSmallerThanThePreviousOne(){
        int [] wallHeights=new int[]{8,7,6,5,4,3,2,1};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(8, blockCount);
    }  
    @Test
    public void minimumAmountOfBlocksToBuildButOnlyOneHeight(){
        int [] wallHeights=new int[]{1};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(1, blockCount);
    }  
    @Test
    public void firstAndLastHeightOutOfThreeAreEqual(){
        int [] wallHeights=new int[]{1, 1000000000, 1};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(2, blockCount);
    }  
    @Test
    public void firstAndLastHeightOutOfThreeAreEqua(){
        int [] wallHeights=new int[]{1, 5, 1, 4, 6, 7, 9, 10, 1};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(7, blockCount);
    }  
    @Test
    public void threeDifferentHeightsTogether(){
        int [] wallHeights=new int[]{4,4,1,1,3,3,3,1,1,1};
        int blockCount=stoneWall.minAmountOfblocksNeddedToBuildTheWall(wallHeights);
        assertEquals(3, blockCount);
    }  
    
}
