package com.codilities;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.codilities.stacksAndQueues.Fish;
public class FishTest {
    


    private Fish fish=new Fish();
    @Test
    public void movingFishIsBiggerThanComparingFish(){
        int movingFish=2;
        int comparingFish=1;
        boolean isMovingFishBigger=fish.checkIfishIsbigger(movingFish,comparingFish);
        assertEquals(true, isMovingFishBigger);
    } 
    @Test
    public void movingFishIsSmallerThanComparingFish(){
        int movingFish=1;
        int comparingFish=2;
        boolean isMovingFishBigger=fish.checkIfishIsbigger(movingFish,comparingFish);
        assertEquals(false, isMovingFishBigger);
    } 

    @Test 
    public void movingFishAndComparingFishEncounterEachOther(){
        int movingFishDirection=1;
        int comparingFishDirection=0;
        boolean bothFishEncounter=fish.doBothFishEncounter(movingFishDirection,comparingFishDirection);
   assertEquals(true, bothFishEncounter);

    }
    @Test 
    public void movingFishAndComparingFishDontEncounterEachOther(){
        int movingFishDirection=0;
        int comparingFishDirection=0;
        boolean bothFishEncounter=fish.doBothFishEncounter(movingFishDirection,comparingFishDirection);
   assertEquals(false, bothFishEncounter);

    }
    @Test 
    public void deleteFishFromList(){
        List<Integer>expectedFishList=new ArrayList<Integer>();
        expectedFishList.add(1);
        expectedFishList.add(3);
       List<Integer>fishList=new ArrayList<Integer>(); 
       fishList.add(1);
        fishList.add(2);
        fishList.add(3);
       
        fishList=fish.deletefishFromBothList(1, fishList);

   assertEquals(expectedFishList, fishList);

    }
    @Test
    public void fishAlive(){
        int[]fishSizeArr=new int[]{4,3,2,1,5};
        int[]fishDirectionArr=new int[]{0,1,0,0,0};
        
        int fishAlive=fish.fishAlive(fishSizeArr,fishDirectionArr);
        assertEquals(2, fishAlive);
}

        
    
}
