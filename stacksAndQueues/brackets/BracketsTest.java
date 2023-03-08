package com.codilities;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codilities.stacksAndQueues.Brackets;
public class BracketsTest {
   
    
   private Brackets brackets =new Brackets();
   
   @Test
    public void stringOfBracketsisNotProperlyNested(){
        String bracketString="({{({}[]{})}}[]{}";
        assertEquals(0, brackets.isItProperlynested(bracketString));
    }
     @Test
    public void stringOfBracketsisProperlyNested(){
        String bracketString="({{({}[]{})}}[]{})";
        assertEquals(1, brackets.isItProperlynested(bracketString));
    }
    @Test
    public void stringOfBracketsisProperlyNestedBugCombinationFixed(){
        String bracketString="()(()())((()())(()()))";
        assertEquals(1, brackets.isItProperlynested(bracketString));
    }
   
    @Test
    public void stringIsEmpty(){
        String bracketString="";
        assertEquals(1, brackets.isItProperlynested(bracketString));
    }


}
