
import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {
    public int missingNumberWithinArray(int[]missNumArray){
        int missingNum=0;
         if(missNumArray.length==0){
            missingNum=1;
            return missingNum;
        }
        int smallestNum=smallestNumber(missNumArray);
        int biggestNum=biggestNumber(missNumArray);
        int[] fullNumArray= IntStream.rangeClosed(smallestNum, biggestNum).toArray();
           
        for (int i = 0; i < fullNumArray.length; i++) {
            
            if(matches(fullNumArray[i], missNumArray)==false){
                    missingNum=fullNumArray[i];
            }
                if(i==fullNumArray.length-1 && missingNum==0){
                    missingNum=fullNumArray.length+1;
                }
            
            
            
        }
        if(matches(1, missNumArray)==false){
                missingNum=1;
                return missingNum;
            } 
       
        if(missNumArray.length==1){
            missingNum=2;
            return missingNum;
        }
        
            
            
        return missingNum;
       
    
        

    }
    
    public int smallestNumber(int[]array){
        return Arrays.stream(array).reduce((x, y) -> x < y ? x : y).getAsInt();
    }
    public int biggestNumber(int[]array){
        return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).getAsInt();
    }
    public Boolean matches(int num,int[]missNumArray){
        return  Arrays.stream(missNumArray).anyMatch(x->x==num);
    }
    
}