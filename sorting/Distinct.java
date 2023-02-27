
import java.util.ArrayList;

import java.util.List;

public class Distinct {
    


    public int getCountOfDistinctNumbers(int[]givenArr){
            
            List <Integer>numsRepOnce=new ArrayList<Integer>(0);
            for (int i = 0; i < givenArr.length; i++) {
              if( checkIfInList(givenArr[i], numsRepOnce)==false)numsRepOnce.add(givenArr[i]);
              
            }
            
            
            return numsRepOnce.size();
    
        }
        
        public Boolean checkIfInList(int num,List<Integer> numsRepOnce){

          return numsRepOnce.stream().anyMatch(x->x==num);
         

        }
}
