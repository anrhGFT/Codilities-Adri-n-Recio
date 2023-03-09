package com.codilities.stacksAndQueues;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fish {
           List<Integer> fishSizeList=new ArrayList<>();
                List<Integer> fishDirectionList=new ArrayList<>();
public int fishAlive(int[]fishSizeArr,int[]fishDirectionArr){
                if(fishDirectionArr.length==1)return 1;       
                     fishSizeList=Arrays.stream(fishSizeArr).boxed().collect(Collectors.toList());
                     fishDirectionList=Arrays.stream(fishDirectionArr).boxed().collect(Collectors.toList());
                for (int movingFish = 0; movingFish < fishDirectionList.size(); movingFish++) {
                    if (fishSizeList.size()==1) {
                        return fishSizeList.size();
                    }
                    if(fishDirectionList.get(movingFish)==0)
                    {
                        fishGoesUpStream(movingFish);
                    /*     for (int comparingFish = movingFish-1; comparingFish > 0; comparingFish--) {
                        if (doBothFishEncounter(fishDirectionList.get(movingFish), fishDirectionList.get(comparingFish))==true ) {
                           boolean movingFishBigger=checkIfishIsbigger(fishSizeList.get(movingFish), fishSizeList.get(comparingFish));

                           if (movingFishBigger==true) {
                                  fishDirectionList=deletefishFromBothList(comparingFish, fishDirectionList);  
                                  fishSizeList=deletefishFromBothList(comparingFish, fishSizeList);
                                  
                                  comparingFish++;
                           }
                           else if(fishSizeList.get(movingFish)!=fishSizeList.get(comparingFish)){
                            fishDirectionList=deletefishFromBothList(movingFish, fishDirectionList);  
                                  fishSizeList=deletefishFromBothList(movingFish, fishSizeList);  
                                  
                                  movingFish--;
                                  break;
                           }
                        }
                    } */

                }
                if (fishDirectionList.size()==1) {
                    break;
                } 
                   if(fishDirectionList.get(movingFish)==1) {
                    fishGoesDownStream(movingFish);
                       /*  for (int comparingFish = movingFish+1; comparingFish < fishDirectionList.size(); comparingFish++) {
                            if (doBothFishEncounter(fishDirectionList.get(movingFish), fishDirectionList.get(comparingFish))==true) {
                                boolean movingFishBigger=checkIfishIsbigger(fishSizeList.get(movingFish), fishSizeList.get(comparingFish));
                                
                                if (movingFishBigger==true) {
                                       fishDirectionList=deletefishFromBothList(comparingFish, fishDirectionList);  
                                       fishSizeList=deletefishFromBothList(comparingFish, fishSizeList);
                                       comparingFish--;  
                                }
    
                            
                                else if(fishSizeList.get(movingFish)!=fishSizeList.get(comparingFish)){
                                 fishDirectionList=deletefishFromBothList(movingFish, fishDirectionList);  
                                    fishSizeList=deletefishFromBothList(movingFish, fishSizeList);
                                    movingFish--;
                                    
                                    break;
                                       
                                }
                    }
                } */
            
            }    
            
            }
           
            return fishDirectionList.size();


}
    
public List<Integer> deletefishFromBothList(int fish,List<Integer>fishList){
        fishList.remove(fish);
    return fishList;
}
public Boolean checkIfBothFishGotSameSize(int movingFishSize,int comparingFishSize){

    return movingFishSize==comparingFishSize;
}
public Boolean checkIfishIsbigger(int movingFishSize,int comparingFishSize){

    return movingFishSize>comparingFishSize;
}

public void fishGoesDownStream(int movingFish){
    for (int comparingFish = movingFish+1; comparingFish < fishDirectionList.size(); comparingFish++) {
       
        if (doBothFishEncounter(fishDirectionList.get(movingFish), fishDirectionList.get(comparingFish))==true) {
            boolean movingFishBigger=checkIfishIsbigger(fishSizeList.get(movingFish), fishSizeList.get(comparingFish));
            
            if (movingFishBigger==true) {
                   fishDirectionList=deletefishFromBothList(comparingFish, fishDirectionList);  
                   fishSizeList=deletefishFromBothList(comparingFish, fishSizeList);
                 
                   comparingFish--;  
            }

        
            else if(fishSizeList.get(movingFish)!=fishSizeList.get(comparingFish)){
             fishDirectionList=deletefishFromBothList(movingFish, fishDirectionList);  
                fishSizeList=deletefishFromBothList(movingFish, fishSizeList);
                
                movingFish--;
                
                break;
                   
            }
}
}
}
public void fishGoesUpStream(int movingFish){
    for (int comparingFish = movingFish-1; comparingFish > 0; comparingFish--) {
        
        if (doBothFishEncounter(fishDirectionList.get(movingFish), fishDirectionList.get(comparingFish))==true ) {
           boolean movingFishBigger=checkIfishIsbigger(fishSizeList.get(movingFish), fishSizeList.get(comparingFish));

           if (movingFishBigger==true) {
                  fishDirectionList=deletefishFromBothList(comparingFish, fishDirectionList);  
                  fishSizeList=deletefishFromBothList(comparingFish, fishSizeList);
                 
                  comparingFish++;
           }
           else if(fishSizeList.get(movingFish)!=fishSizeList.get(comparingFish)){
            fishDirectionList=deletefishFromBothList(movingFish, fishDirectionList);  
                  fishSizeList=deletefishFromBothList(movingFish, fishSizeList);  
                 
                  movingFish--;
                  break;
           }
        }
    }
}

public boolean doBothFishEncounter(int movingFishDirection,int comparingFishDirection){
    return movingFishDirection!=comparingFishDirection;
}



        
    

}
