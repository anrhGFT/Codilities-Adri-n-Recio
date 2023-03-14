package com.codilities;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.codilities.leader.Dominator;
public class DominatorTest {
    

    private Dominator dominator=new Dominator();

@Test
 public void countAomuntOfTimesANumberAppearsWithInAGivenArray(){
    int[]givenArray=new int[]{3,4,3,2,3,-1,3,3};
    Dominator dominator=new Dominator();
    dominator.dominatorArr=givenArray;
    int num=3;
    int count=dominator.countTimesANumberAppearsWithinArray(num);
    assertEquals(5, count);
 }

 @Test
 public void returnIndexOfNumberWhichCountBiggerThanHalfTheArray(){
    int[]givenArray=new int[]{3,4,3,2,3,-1,3,3};
    int indx=dominator.indxOfNumberWhichCountBiggerThanHalfOfArrayLength(givenArray);
    assertEquals(0, indx);  

 }

 @Test
 public void arrayWithNoIndexWhichCountIsBiggerThanHalfTheArrayLength(){
    int[]givenArray=new int[]{2,2,3,-1,3,3};
    int indx=dominator.indxOfNumberWhichCountBiggerThanHalfOfArrayLength(givenArray);
    assertEquals(-1, indx);  

 }
}
