package backCalc;

class BackMath {
    
    static void doMath(){
       double result = Double.parseDouble(Handler.result);
       double lastNum = Double.parseDouble(Handler.lastNum);
       
       if(Handler.operatorState.contains("+")){
           Handler.result = result+lastNum +"";
       }else if(Handler.operatorState.contains("-")){
            Handler.result = result-lastNum +"";
       }else if(Handler.operatorState.contains("*")){
           if(!Handler.lastNum.equals("0"))
            Handler.result = result*lastNum +"";
       }else if(Handler.operatorState.contains("/")){
           if(lastNum!=0)
            Handler.result = result/lastNum +"";
       }
    }
    
}
