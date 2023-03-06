package com.codilities;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.codilities.sorting.NumberOfDiscIntersections;

public class NumberOfDiscIntersectionsTest {
    private final NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    @Test
    public void discsBordersDontIntersect() {

        assertEquals(false,
                numberOfDiscIntersections.checkIfTwoDiscsIntersect(
                        0, 1, 3, 1));
    }
    @Test
    public void discsBordersIntersect() {

        assertEquals(true,
                numberOfDiscIntersections.checkIfTwoDiscsIntersect(
                        1, 1, 2, 1));
    }

    @Test
    public void mainDiscInsideComparingDisc() {

        assertEquals(true,
                numberOfDiscIntersections.checkIfTwoDiscsIntersect(
                        2, 2, 3, 4));
    }
    @Test
    public void comparingDiscInsideMainDisc() {
        
        assertEquals(true,
                numberOfDiscIntersections.checkIfTwoDiscsIntersect(
                        3, 4, 2, 2));
    }
    
    @Test
    public void countTimesAGivenDiscWithinAGivenArrayIntersectsOtherDiscs(){
        assertEquals(11,numberOfDiscIntersections.countDiscIntersections( new int []{1,5,2,1,4,0}));
    }

}
