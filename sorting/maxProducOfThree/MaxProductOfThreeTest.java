

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.codilities.sorting.MaxProductOfThree;

public class MaxProductOfThreeTest {
    private final MaxProductOfThree maxProductOfThree=new MaxProductOfThree();

    @Ignore
    @Test
   public void onlyThreeNumbersLeft(){
        int []arr ={3,4,5};
        
        assertEquals(60, maxProductOfThree.maxProductOfThree(arr));
    }
    @Ignore
    @Test
    public void positiveAndNegativeNumbers(){
         int []arr ={-3,1,2,-2,5,6};
         
         assertEquals(60, maxProductOfThree.maxProductOfThree(arr));
     }
     @Ignore
     @Test
     public void allNumbersAreNegative(){
        assertEquals(-6, maxProductOfThree.maxProductOfThree(new int[]{-1,-2,-3,-4,-5}));
     }
     @Test
     public void allNumbersAreNPositive(){
        assertEquals(60, maxProductOfThree.maxProductOfThree(new int[]{1,2,3,4,5}));
     }
}
