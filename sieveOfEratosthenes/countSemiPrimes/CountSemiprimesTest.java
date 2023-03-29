package com.codilities;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.codilities.sieveOfEratosthenes.CountSemiprimes;

public class CountSemiprimesTest {
    
        private CountSemiprimes countSemiprimes=new CountSemiprimes();


       @Test
       public void arrayOfSemiprimeNumCountPerRange(){
        int []arrCount=countSemiprimes.countSemiprimes(new int[]{1,4,16}, new int[]{26,10,20});
        assertArrayEquals(new int[]{10, 4, 0}, arrCount);
       } 

    @ParameterizedTest
    @MethodSource("primeNums")
    void givenNumsArePrimes(int num,Boolean expected){
        boolean prime=countSemiprimes.isAPrimeNumber(num);
        assertEquals(true, prime);
            
    }

    private static Stream<Arguments>primeNums(){
        return Stream.of(
            Arguments.of(2,true),
            Arguments.of(3,true),
            Arguments.of(7,true)
        );
    }
    @ParameterizedTest
    @MethodSource("semiPrimeNums")
    void semiPrimeNumCount(int startNumRange,int endNumRange,int expected){
        int[]currentRangeArr=countSemiprimes.createRangeArr(startNumRange, endNumRange);
         int semiPrimeNumCount=countSemiprimes.semiPrimeNumberCount(currentRangeArr);
        assertEquals(expected,semiPrimeNumCount);
            
    }

    private static Stream<Arguments>semiPrimeNums(){
        return Stream.of(
            Arguments.of(1, 26,10),
            Arguments.of(4, 10,4),
            Arguments.of(16, 20,0)
        );
    }
}
