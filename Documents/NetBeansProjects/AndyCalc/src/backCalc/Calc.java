package backCalc;

import java.awt.event.ActionEvent;

public class Calc extends javax.swing.JFrame {

    public Calc() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textT = new javax.swing.JTextField();
        textB = new javax.swing.JTextField();
        but0 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        butClear = new javax.swing.JButton();
        butDot = new javax.swing.JButton();
        butPlus = new javax.swing.JButton();
        butMinus = new javax.swing.JButton();
        butEqual = new javax.swing.JButton();
        butMultiply = new javax.swing.JButton();
        butDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 380));
        setPreferredSize(new java.awt.Dimension(570, 390));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textT.setEditable(false);
        textT.setBackground(new java.awt.Color(255, 255, 255));
        textT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textT.setBorder(null);
        getContentPane().add(textT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 80));

        textB.setEditable(false);
        textB.setBackground(new java.awt.Color(255, 255, 255));
        textB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textB.setBorder(null);
        getContentPane().add(textB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 430, 70));

        but0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but0.setText("0");
        but0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but0ActionPerformed(evt);
            }
        });
        getContentPane().add(but0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 60));

        but1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but1.setText("1");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 100, 60));

        but2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but2.setText("2");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 100, 60));

        but3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but3.setText("3");
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 100, 60));

        but4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but4.setText("4");
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 100, 60));

        but5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but5.setText("5");
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });
        getContentPane().add(but5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 100, 60));

        but6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but6.setText("6");
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });
        getContentPane().add(but6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 100, 60));

        but7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but7.setText("7");
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });
        getContentPane().add(but7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, 60));

        but8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but8.setText("8");
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });
        getContentPane().add(but8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, 60));

        but9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        but9.setText("9");
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });
        getContentPane().add(but9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 60));

        butClear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butClear.setText("C");
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });
        getContentPane().add(butClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 60));

        butDot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butDot.setText(".");
        butDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDotActionPerformed(evt);
            }
        });
        getContentPane().add(butDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 60));

        butPlus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butPlus.setText("+");
        butPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPlusActionPerformed(evt);
            }
        });
        getContentPane().add(butPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 100, 60));

        butMinus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butMinus.setText("-");
        butMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMinusActionPerformed(evt);
            }
        });
        getContentPane().add(butMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 100, 60));

        butEqual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butEqual.setText("=");
        butEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEqualActionPerformed(evt);
            }
        });
        getContentPane().add(butEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 100, 60));

        butMultiply.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butMultiply.setText("*");
        butMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(butMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, 60));

        butDivide.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        butDivide.setText("/");
        butDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDivideActionPerformed(evt);
            }
        });
        getContentPane().add(butDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 100, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but0ActionPerformed
        if(!Handler.keyLocked){
        Handler.hitKey(evt, but0, textT);
        Handler.registerLastNum(evt, but0);
        }
    }//GEN-LAST:event_but0ActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
       if(!Handler.keyLocked){
       Handler.hitKey(evt, but1, textT);
       Handler.registerLastNum(evt, but1);
       }
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
       if(!Handler.keyLocked){
        Handler.hitKey(evt, but2, textT);
        Handler.registerLastNum(evt, but2);
       }
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
       if(!Handler.keyLocked){
        Handler.hitKey(evt, but3, textT);
        Handler.registerLastNum(evt, but3);
       }
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        if(!Handler.keyLocked){
        Handler.hitKey(evt, but4, textT);
        Handler.registerLastNum(evt, but4);
        }
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
       if(!Handler.keyLocked){
        Handler.hitKey(evt, but5, textT);
        Handler.registerLastNum(evt, but5);
       }
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
       if(!Handler.keyLocked){
        Handler.hitKey(evt, but6, textT);
        Handler.registerLastNum(evt, but6);
       }
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        if(!Handler.keyLocked){
        Handler.hitKey(evt, but7, textT);
        Handler.registerLastNum(evt, but7);
        }
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        if(!Handler.keyLocked){
        Handler.hitKey(evt, but8, textT);
        Handler.registerLastNum(evt, but8);
        }
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
       if(!Handler.keyLocked){
        Handler.hitKey(evt, but9, textT);
        Handler.registerLastNum(evt, but9);
       }
    }//GEN-LAST:event_but9ActionPerformed

    private void butMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMinusActionPerformed
        Handler.hitOperator(evt, butMinus, textT);
        BackMath.doMath();
        textB.setText(Handler.result);
        Handler.lastNum="0";
        Handler.operatorState = "-";
        Handler.keyLocked=false;
    }//GEN-LAST:event_butMinusActionPerformed

    private void butPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlusActionPerformed
        Handler.hitOperator(evt, butPlus, textT);
        BackMath.doMath();
        textB.setText(Handler.result);
        Handler.lastNum="0";
        Handler.operatorState = "+";
        Handler.keyLocked=false;
    }//GEN-LAST:event_butPlusActionPerformed

    private void butMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMultiplyActionPerformed
        Handler.hitOperator(evt, butMultiply, textT);
        BackMath.doMath();
        textB.setText(Handler.result);
        Handler.lastNum="0";
        Handler.operatorState = "*";
        Handler.keyLocked=false;
    }//GEN-LAST:event_butMultiplyActionPerformed

    private void butDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDivideActionPerformed
        Handler.hitOperator(evt, butDivide, textT);
        BackMath.doMath();
        textB.setText(Handler.result);
        Handler.lastNum="0";
        Handler.operatorState = "/";
        Handler.keyLocked=false;
    }//GEN-LAST:event_butDivideActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        Handler.lastNum ="0";
        Handler.result="0";
        textB.setText("");
        textT.setText("");
        Handler.operatorState="+";
        Handler.keyLocked=false;
    }//GEN-LAST:event_butClearActionPerformed

    private void butEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEqualActionPerformed
        if(textT.getText().length()==0){
            
        }else{
        BackMath.doMath();
        textB.setText(Handler.result);
        Handler.lastNum="0";
        Handler.operatorState="+";
        
        
        textT.setText(textB.getText());
        textB.setText("");
        Handler.keyLocked=true;
        }
    }//GEN-LAST:event_butEqualActionPerformed

    private void butDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDotActionPerformed
      if(!Handler.keyLocked){ 
        if(Handler.lastNum.contains(".")){
            
        }else{
            Handler.registerLastNum(evt, butDot);
            if(CharCheck.charChecker(textT.getText()))
            textT.setText(textT.getText()+butDot.getText());
        }
      }
    }//GEN-LAST:event_butDotActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but0;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butDivide;
    private javax.swing.JButton butDot;
    private javax.swing.JButton butEqual;
    private javax.swing.JButton butMinus;
    private javax.swing.JButton butMultiply;
    private javax.swing.JButton butPlus;
    private javax.swing.JTextField textB;
    private javax.swing.JTextField textT;
    // End of variables declaration//GEN-END:variables









}
