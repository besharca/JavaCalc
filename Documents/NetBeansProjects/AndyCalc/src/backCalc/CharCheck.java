package backCalc;


class CharCheck {

    static boolean charChecker(String s){
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='.'){
                return false;
            }
            if(s.charAt(i)=='+' ||
               s.charAt(i)=='/' ||
               s.charAt(i)=='*' ||     
               s.charAt(i)=='-'){
                return true;
            }
        }
      return true;   
    }
 
}
