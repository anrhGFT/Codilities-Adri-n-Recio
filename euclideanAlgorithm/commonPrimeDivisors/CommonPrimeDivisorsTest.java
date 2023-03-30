package com.codilities;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.codilities.euclideanAlgorithm.CommonPrimeDivisors;

public class CommonPrimeDivisorsTest {
    

    private CommonPrimeDivisors commonPrimeDivisors=new CommonPrimeDivisors();


    @ParameterizedTest
    @MethodSource("pairsScenarios")
     void countPairsWithPrimeDivisors(List<Integer>AList,List<Integer>BList,int expected){
                int[]A=AList.stream().mapToInt(i -> i).toArray();
                int[]B=BList.stream().mapToInt(i -> i).toArray();
                    int pairs=commonPrimeDivisors.countPairsWhichHaveTheSamePrimeDivisors(A, B);
                assertEquals(expected, pairs);
     }

    private static Stream<Arguments> pairsScenarios(){

        return Stream.of(
            Arguments.of(Arrays.asList(15,10,3),Arrays.asList(75,30,5),1)
            

        );
    }

        @ParameterizedTest
        @MethodSource("getPrimeDivisorsScenario")
    void getPrimeDivisorsOfAGivenNum(int num,List<Integer>expectedList){
                int[]expectedArr=expectedList.stream().mapToInt(i -> i).toArray();
                int[]primeDivisorsArr=commonPrimeDivisors.getPrimeDivisorsFromAgivenNumber(num);
        assertArrayEquals(primeDivisorsArr, expectedArr);
    }

    
    private static Stream<Arguments> getPrimeDivisorsScenario(){

        return Stream.of(
            Arguments.of(15,Arrays.asList(3,5)),
            Arguments.of(10,Arrays.asList(2,5)),
            Arguments.of(9,Arrays.asList(3))

        );
    }
}
