import java.util.*;
class Solution {
    public int[] solution(int[] A, int K) {
       
        int rotated[]=new int[A.length];
    
       
       for(int i=0;i<A.length;i++){
          int position=i+K;
           if(position<=A.length-1){
               rotated[position]=A[i];
           }
           else{
               while(position>=A.length){
                   position-=A.length;
               }
               rotated[position]=A[i];
           }
         
     } 
     return rotated;
     
     

    }
}