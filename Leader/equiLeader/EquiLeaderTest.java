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
 @Test
 public void amountOfLeadersWhenArrayGotOneNum(){
    int[]givenArray=new int[]{4};
    int leaderCount=equiLeader.amountOfLeaders(givenArray);
    assertEquals(0, leaderCount);  

 }
 @Test
 public void amountOfLeadersWhenArrayGotTwoEqualNumbers(){
    int[]givenArray=new int[]{2,2};
    int leaderCount=equiLeader.amountOfLeaders(givenArray);
    assertEquals(1, leaderCount);  

 }
 @Test
 public void givenAnIndexProvesThatInFirstSequenceTheresALeader(){
   EquiLeader equiLeader=new EquiLeader();
      equiLeader.equiLeaderArr=new int[]{2,2};
      equiLeader.biggestCountNum=2;
    boolean isALeader=equiLeader.isLeaderInFirstHalf(0);
    assertEquals(true, isALeader);  

 }
 @Test
 public void givenAnIndexProvesThatInSecondSequenceTheresALeader(){
   EquiLeader equiLeader=new EquiLeader();
      equiLeader.equiLeaderArr=new int[]{2,2};
      equiLeader.biggestCountNum=2;
    boolean isALeader=equiLeader.isLeaderInSecondHalf(0);
    assertEquals(true, isALeader);  

 }
 @Test
 public void givenAnIndexProvesThatInFirstSequenceTheresNotALeader(){
   EquiLeader equiLeader=new EquiLeader();
      equiLeader.equiLeaderArr=new int[]{3,1,2,2};
      equiLeader.biggestCountNum=2;
    boolean isALeader=equiLeader.isLeaderInFirstHalf(1);
    assertEquals(false, isALeader);  

 }
 @Test
 public void givenAnIndexProvesThatInSecondSequenceTheresNotALeader(){
   EquiLeader equiLeader=new EquiLeader();
      equiLeader.equiLeaderArr=new int[]{4,3,1,2,2};
      equiLeader.biggestCountNum=2;
    boolean isALeader=equiLeader.isLeaderInSecondHalf(0);
    assertEquals(false, isALeader);  

 }

}