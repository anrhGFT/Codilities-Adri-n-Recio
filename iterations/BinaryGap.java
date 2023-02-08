// you can also use imports, for example:
// import java.util.*;
import  java.util.*;
import java.lang.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
      
     

    public int solution(int N) {
        int gapCounter=0;
        int largestGapCount=0;
        int oneCounter=0;
        String  binaryNum=Integer.toBinaryString(N);
        
        for(int i=0;i<binaryNum.length();i++){ 
            if(binaryNum.charAt(i)=='1' && gapCounter==0){   
              gapCounter=0;
              oneCounter=1;
           } 
           if(binaryNum.charAt(i)=='0' && oneCounter==1){
                    gapCounter++;
            }
            if(binaryNum.charAt(i)=='1' && oneCounter==1 && gapCounter>0)
            {oneCounter++;}
           if(oneCounter==2 && binaryNum.charAt(i)=='1') {
                if(gapCounter>largestGapCount){
                largestGapCount=gapCounter;
                gapCounter=0;
                oneCounter=1;
            }
            else{gapCounter=0;
                    oneCounter=1;}

            }


           
            
          
          
}
        
       
        
        return largestGapCount;
        
    }
   
}