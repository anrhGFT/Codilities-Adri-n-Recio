package com.codilities.stacksAndQueues;

public class Nesting {
    public int isItProperlynested(String bracketsStr){
        if (bracketsStr.length() % 2 != 0)
        return 0;
           
            while (bracketsStr.isEmpty()==false ) {
            if(bracketsStr.contains("()"))bracketsStr=bracketsStr.replace("()", ""); 
            else if(bracketsStr.contains("()"))bracketsStr=bracketsStr.replace("()", "");
               else break;
            }
            
          
             if (bracketsStr.isEmpty())
                            return 1;

        return 0;
    }
}
