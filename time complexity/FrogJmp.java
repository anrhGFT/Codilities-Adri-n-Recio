public class FrogJmp {
    public int solution(int actualPos, int futurePos, int jumpLength) {
        int jumps=0;
         if(actualPos<futurePos){
         while(actualPos<futurePos){
             actualPos+=jumpLength;
             jumps++;
         }
         }
 
         return jumps;
     }
}