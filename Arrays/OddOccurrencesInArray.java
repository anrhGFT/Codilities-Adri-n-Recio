class Solution {
    public int solution(int[] A) {
            

            for(int i=0;i<A.length;i++){
                int repCont=0;
                     for(int j=0;j<A.length;j++){
                         if(A[i]==A[j]){
                             repCont+=1;
                         }
                         
                }
                if (repCont%2!=0){return A[i];}


            }


            
           
    }
}