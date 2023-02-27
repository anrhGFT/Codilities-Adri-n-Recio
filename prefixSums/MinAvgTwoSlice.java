

public class MinAvgTwoSlice {
    

    public int smallestAveragePosition(int []arrs){
       int posWithMinAvrg=0;
       Double smallestAverage=0.00;

       for (int pos = 0; pos < arrs.length; pos++) {
        if(pos==arrs.length-1)break;
            int sum=arrs[pos];
            int divisor;
            for (int i = pos+1; i < arrs.length; i++) {
                divisor=i-pos+1;
                sum+=arrs[i];
                Double average=calculateAvrg( sum,divisor);
                if(pos==0 && i==pos+1){
                    smallestAverage=average;
                    posWithMinAvrg=pos;
                }
                if(average<smallestAverage){
                    smallestAverage=average;
                    posWithMinAvrg=pos;
                }
                
            }
       }
       
        return posWithMinAvrg ;

    }

    public Double calculateAvrg(int sum,int divisor){
        
        
        return Double.valueOf(sum)/Double.valueOf(divisor);
    }
    
}
