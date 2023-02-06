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
            if(gapCounter>largestGapCount){
                largestGapCount=gapCounter;
            }
            if(binaryNum.charAt(i)=='0'){
                    gapCounter++;
            }
          if(binaryNum.charAt(i)!='0'){
              gapCounter=0;
              oneCounter++;
          }
          
}
        
         if (oneCounter==1 && binaryNum.charAt(binaryNum.length() - 1)=='0'){
                    largestGapCount=0;
                }
        
        return largestGapCount;
        
    }
   
}