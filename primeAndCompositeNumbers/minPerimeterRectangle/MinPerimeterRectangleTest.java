package com.codilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.primeAndCompositeNumbers.MinPerimeterRectangle;

public class MinPerimeterRectangleTest {
    private MinPerimeterRectangle minPerimeterRectangle=new MinPerimeterRectangle();



    @Test
    public void getPerimeterFromGivenAreaAndDivisor(){
        int area=30;
        int perimeter=minPerimeterRectangle.calculatePerimeter(area,15);
        assertEquals(34, perimeter);
    }

    @Test
    public void getMinPerimeterFromGivenArea(){
        int area=30;
        int minPerimeter=minPerimeterRectangle.getMinPerimeter(area);
        assertEquals(22, minPerimeter);
    }
    @Test
    public void getMinPerimeterFromAreaWithOneAsValue(){
        int area=1;
        int minPerimeter=minPerimeterRectangle.getMinPerimeter(area);
        assertEquals(4, minPerimeter);
    }

    

}
