

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
    private Map<String,Integer> nucleotidesMap = new HashMap<String,Integer>(){{
        put("A",1);
        put("C",2);
        put("G",3);
        put("T",4);
        
       }};


    public int[] getMinImpctFctrPerSequence(String dnaSequence, int[] P, int[] Q){
        int pqlength=P.length;
        int [] minImpactFactors=new int[pqlength];
        for (int i = 0; i < P.length; i++) {
            if(P[i]==Q[i]){
                minImpactFactors[i]=minNucleotideToImpactFactor(String.valueOf(dnaSequence.charAt(P[i])));
            }
            else{
            minImpactFactors[i]=minNucleotideToImpactFactor(dnaSequence.substring(P[i], Q[i]+1));
            }
        }
    return minImpactFactors;
    }
    



  public int minNucleotideToImpactFactor(String dnaSplitSequence){
        int[]impactFactors=new int[dnaSplitSequence.length()];
        for (int i = 0; i < dnaSplitSequence.length(); i++) {
           int impactFactor=nucleotidesMap.get(String.valueOf(dnaSplitSequence.charAt(i)));
           impactFactors[i]=impactFactor;
        } 
        
            return Arrays.stream(impactFactors).reduce((x, y) -> x < y ? x : y).getAsInt();


  }

 

}
