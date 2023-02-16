import java.util.ArrayList;

import java.util.List;

class TapeEquilibrium {
    public int minimalAchivableAbsoluteDiff(int[] A) {
       List<Integer>absoluteResults=new ArrayList<Integer>();
        
        for (int i = 1; i < A.length; i++) {
                int diff=Math.abs(sumOfPrevIndexVals(i, A)-sumOfNextIndexVals(i,A));
                absoluteResults.add(diff);
        }
        
        return smallestAbsoluteDiff(absoluteResults);
    }


    public int smallestAbsoluteDiff(List<Integer> absoluteResults){
           
                return absoluteResults.stream().reduce((x, y) -> x < y ? x : y).get();
    
    }
    public int sumOfNextIndexVals (int index,int[]arr){
        int sum=0;
        for(int i=index; i<arr.length; i++){
            
            sum+=arr[i];
        }
  
        return sum;

    }

    public int sumOfPrevIndexVals (int index,int[]arr){
        int amountToTake=arr.length-index;
        int sum=0;
        for(int i=0; i<arr.length-amountToTake; i++){
            
            sum+=arr[i];
        }
  
        return sum;

    }
}