

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.codilities.sorting.Triangle;


public class TriangleTest {

    
    private final   Triangle triangle=new Triangle();

    
    @Test
   public void threeNumsFormAtriangle(){
        

        assertEquals(true,triangle.isATriangle(10, 5, 8));
    }

    @Test
    public void threeNumsDontFormAtriangle(){
         
 
         assertEquals(false,triangle.isATriangle(20, 5, 8));
     }
     
     @Test
    public void thereIsATriangleIntheArray(){
         
         assertEquals(1,triangle.isThereATriangle(new int[]{10,2,5,1,8,20}));
     }
     

     @Test
     public void thereIsNotATriangleIntheArray(){
          
          assertEquals(0,triangle.isThereATriangle(new int[]{10,50,5,1}));
      }

      @Test
      public void threeMaxInts(){
        assertEquals(1,triangle.isThereATriangle(new int[]{2147483647,2147483647,2147483647}));
      }
}
