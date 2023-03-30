package com.codilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.codilities.euclideanAlgorithm.ChocolatesByNumbers;

public class ChocolatesByNumbersTest {
    
        private ChocolatesByNumbers chocolatesByNumbers=new ChocolatesByNumbers();


        @ParameterizedTest
        @MethodSource("chocolateScenarios")
        void countMaxAmountOfChocolatesThatCanBeEaten(int chocolates,int distance,int expected){
                int maxAmountOfChocolates=chocolatesByNumbers.countChocolatesByNumbers(chocolates, distance);

            assertEquals(expected, maxAmountOfChocolates);
        }

        private static Stream<Arguments> chocolateScenarios(){
                return Stream.of(
                    Arguments.of(10,4,5),
                    Arguments.of(1,1,1)
                    
                
                
                );

        }

    
}
