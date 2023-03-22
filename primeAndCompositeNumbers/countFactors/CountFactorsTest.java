package com.codilities;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.primeAndCompositeNumbers.CountFactors;
public class CountFactorsTest {
    

    private CountFactors countFactors=new CountFactors();


    @Test
    public void countHowManyFactorsANumberHas(){
        int num=24;
        int factors=countFactors.countFactors(num);
        assertEquals(8, factors);
    }

}
