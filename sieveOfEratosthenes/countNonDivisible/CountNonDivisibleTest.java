package com.codilities;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.codilities.sieveOfEratosthenes.CountNonDivisible;

public class CountNonDivisibleTest {
    
       
        CountNonDivisible countNonDivisible=new CountNonDivisible(); 
        @ParameterizedTest
        @MethodSource("nonDivisibleCounts")
        void countNonDivisibleNumsOfAGivenIndx( int indx,int expected){
            
            countNonDivisible.setNums(new int[]{3,1,2,3,6});
        int result = countNonDivisible.countNonDivisibleNumsAGivenNumberHas(indx);
        
        assertEquals(expected, result);
        }
        
        private static Stream<Arguments> nonDivisibleCounts(){
            return Stream.of(
            Arguments.of(0 ,2),
            Arguments.of(1 ,4),
            Arguments.of(2 ,3)
           
            );
            }

            @ParameterizedTest
            @MethodSource("allNonDivisibleCounts")
            void countAllNonDivisibleNumsPerIndex( List<Integer> givenList,List<Integer> expectedList){
                int []givenArr=givenList.stream().mapToInt(i->i).toArray();
                int []expectedArr=expectedList.stream().mapToInt(i->i).toArray();
            int []result = countNonDivisible.countNonDivisible(givenArr);
            
            assertArrayEquals(expectedArr, result);
            }

            private static Stream<Arguments> allNonDivisibleCounts(){
                return Stream.of(
                Arguments.of(Arrays.asList(3,1,2,3,6),Arrays.asList(2,4,3,2,0)),
                Arguments.of(Arrays.asList(1,4,6,2,3),Arrays.asList(4,2,1,3,3)),
                Arguments.of(Arrays.asList(1,1,1,2,1),Arrays.asList(1,1,1,0,1))
                
               
                );
                }

}
