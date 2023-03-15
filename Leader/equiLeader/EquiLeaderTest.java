package com.codilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import com.codilities.leader.EquiLeader;
public class EquiLeaderTest {
    

    private EquiLeader equiLeader=new EquiLeader();

@Test
 public void countAomuntOfTimesANumberAppearsWithInAGivenArray(){
    int[]givenArray=new int[]{3,4,3,2,3,-1,3,3};
    EquiLeader equiLeader=new EquiLeader();
    equiLeader.equiLeaderArr=givenArray;
    int num=3;
    int count=equiLeader.countTimesANumberAppearsWithinArray(num);
    assertEquals(5, count);
 }

 @Test
 public void returnIndexOfNumberWhichCountBiggerThanHalfTheArray(){
    int[]givenArray=new int[]{3,4,3,2,3,-1,3,3};
    EquiLeader equiLeader=new EquiLeader();
    equiLeader.equiLeaderArr=givenArray;
    int indx=equiLeader.indxOfNumberWhichCountBiggerThanHalfOfArrayLength();
    assertEquals(0, indx);  

 }

 @Test
 public void arrayWithNoIndexWhichCountIsBiggerThanHalfTheArrayLength(){
    int[]givenArray=new int[]{2,2,3,-1,3,3};
    EquiLeader equiLeader=new EquiLeader();
    equiLeader.equiLeaderArr=givenArray;
    int biggestCountIndx=equiLeader.indxOfNumberWhichCountBiggerThanHalfOfArrayLength();
    assertEquals(-1, biggestCountIndx);  

 }
 @Test
 public void amountOfLeaders(){
    int[]givenArray=new int[]{4,3,4,4,4,2};
    int leaderCount=equiLeader.amountOfLeaders(givenArray);
    assertEquals(2, leaderCount);  

 }
}