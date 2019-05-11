
package backCalc;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;



class Handler {
    
  //  private static String num1 = "0";
    static String lastNum = "0";
    static String result = "0";
    static String operatorState = "+";
    static boolean keyLocked = false;
    

    
    static void hitKey(ActionEvent evt, JButton key, JTextField text){
        if(evt.getSource()==key){
            text.setText(text.getText() + key.getText());
        }
    }
    static void registerLastNum(ActionEvent evt, JButton key){
        if(evt.getSource()==key){
        lastNum = lastNum + key.getText();
        }
    }
    
    static void hitOperator(ActionEvent evt, JButton key, JTextField text){
        if(evt.getSource()==key){
            
            String newText = text.getText()+ key.getText();
            String oldText = text.getText();
            
            
            
            if(oldText.length()==0){
                text.setText(newText);
            }else if(oldText.charAt(oldText.length()-1)=='+' || 
                     oldText.charAt(oldText.length()-1)=='-' || 
                     oldText.charAt(oldText.length()-1)=='*' || 
                     oldText.charAt(oldText.length()-1)=='/' ){
                
                text.setText(oldText.substring(0,oldText.length()-1)+key.getText());
                
            }else{
                text.setText(newText);
            }

        }
        
    }
    
    
}
