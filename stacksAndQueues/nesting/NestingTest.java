package com.codilities;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.codilities.stacksAndQueues.Nesting;
public class NestingTest {
    


    private Nesting nesting =new Nesting();
    @Test
    public void theStringIsProperlyNested(){
        int nested=nesting.isItProperlynested("(()(())())");
        assertEquals(1, nested);
    }
    @Test
      public void theStringIsntProperlyNested(){
        int nested=nesting.isItProperlynested("(()(())()");
        assertEquals(0, nested);
      }
    @Test
      public void theStringIsEmpty(){
        int nested=nesting.isItProperlynested("");
        assertEquals(1, nested);
      }
}
