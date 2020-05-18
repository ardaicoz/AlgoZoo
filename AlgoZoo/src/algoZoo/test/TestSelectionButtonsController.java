/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;
import algoZoo.game.Animal;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Ayberk, Arda, Kerem
 */
public class TestSelectionButtonsController extends javax.swing.JPanel {

    //properties
    private TestModeModel tmm;
    private ArrayList<Character> listA;
    private ArrayList<Character> listB;
    private ArrayList<Character> listC;

    //constructors
    public TestSelectionButtonsController(TestModeModel tmm, ArrayList<Character> list1, ArrayList<Character> list2, ArrayList<Character> list3) {
        this.tmm = tmm;
        tmm.initNewGame();
        listA = list1;
        listB = list2;
        listC = list3;
        initComponents();
        labelInitialize();
    }
    
     //methods
    /**
     * A method to initialise all JLabels.
     */
     public void labelInitialize()
     {
         ArrayList<JLabel> list1;
         list1 = new ArrayList<JLabel>();
         list1.add(jLabel1);
         list1.add(jLabel2);
         list1.add(jLabel3);
         list1.add(jLabel4);
         list1.add(jLabel5);
         list1.add(jLabel6);
         list1.add(jLabel7);
         list1.add(jLabel8);
         list1.add(jLabel9);
         list1.add(jLabel10);
         ArrayList<JLabel> list2;
         list2 = new ArrayList<JLabel>();
         list2.add(jLabel11);
         list2.add(jLabel12);
         list2.add(jLabel13);
         list2.add(jLabel14);
         list2.add(jLabel15);
         list2.add(jLabel16);
         list2.add(jLabel17);
         list2.add(jLabel18);
         list2.add(jLabel19);
         list2.add(jLabel20);
         ArrayList<JLabel> list3;
         list3 = new ArrayList<JLabel>();
         list3.add(jLabel21);
         list3.add(jLabel22);
         list3.add(jLabel23);
         list3.add(jLabel24);
         list3.add(jLabel25);
         list3.add(jLabel26);
         list3.add(jLabel27);
         list3.add(jLabel28);
         list3.add(jLabel29);
         list3.add(jLabel30);
         for(int i = 0; i < listA.size(); i++ ){
             if(listA.get(i) == 'w'){
             list1.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
             }
             if(listA.get(i) == 'a'){
             list1.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
             }
             if(listA.get(i) == 'd'){
             list1.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
             }
             if(listA.get(i) == 's'){
             list1.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
             }      
             if(listA.get(i) == 'f'){
             list1.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
             }   
         }
         for(int i = listA.size() ; i < 10; i++ ){
             list1.get(i).setIcon(null);
         }
         for(int i = 0; i < listB.size(); i++ ){
             if(listB.get(i) == 'w'){
             list2.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
             }
             if(listB.get(i) == 'a'){
             list2.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
             }
             if(listB.get(i) == 'd'){
             list2.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
             }
             if(listB.get(i) == 's'){
             list2.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
             }      
             if(listB.get(i) == 'f'){
             list2.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
             }   
         }
         for(int i = listB.size() ; i < 10; i++ ){
             list2.get(i).setIcon(null);
         }
         for(int i = 0; i < listC.size(); i++ ){
             if(listC.get(i) == 'w'){
             list3.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
             }
             if(listC.get(i) == 'a'){
             list3.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
             }
             if(listC.get(i) == 'd'){
             list3.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
             }
             if(listC.get(i) == 's'){
             list3.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
             }    
             if(listC.get(i) == 'f'){
             list3.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
             }   
         }
         for(int i = listC.size() ; i < 10; i++ ){
             list3.get(i).setIcon(null);
         }
         
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      B = new javax.swing.JButton();
      C = new javax.swing.JButton();
      A = new javax.swing.JButton();
      jLabel4 = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel20 = new javax.swing.JLabel();
      jLabel17 = new javax.swing.JLabel();
      jLabel18 = new javax.swing.JLabel();
      jLabel19 = new javax.swing.JLabel();
      jLabel14 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      jLabel12 = new javax.swing.JLabel();
      jLabel16 = new javax.swing.JLabel();
      jLabel13 = new javax.swing.JLabel();
      jLabel15 = new javax.swing.JLabel();
      jLabel30 = new javax.swing.JLabel();
      jLabel27 = new javax.swing.JLabel();
      jLabel28 = new javax.swing.JLabel();
      jLabel29 = new javax.swing.JLabel();
      jLabel24 = new javax.swing.JLabel();
      jLabel21 = new javax.swing.JLabel();
      jLabel22 = new javax.swing.JLabel();
      jLabel26 = new javax.swing.JLabel();
      jLabel23 = new javax.swing.JLabel();
      jLabel25 = new javax.swing.JLabel();
      background = new javax.swing.JLabel();

      setOpaque(false);
      setPreferredSize(new java.awt.Dimension(700, 800));
      setLayout(null);

      B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/B_Button.png"))); // NOI18N
      B.setBorder(null);
      B.setContentAreaFilled(false);
      B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      B.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/B_Button.png"))); // NOI18N
      B.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            BMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            BMouseExited(evt);
         }
      });
      B.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            BActionPerformed(evt);
         }
      });
      add(B);
      B.setBounds(248, 5, 104, 50);

      C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/C_Button.png"))); // NOI18N
      C.setBorder(null);
      C.setContentAreaFilled(false);
      C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      C.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/C_Button.png"))); // NOI18N
      C.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            CMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            CMouseExited(evt);
         }
      });
      C.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            CActionPerformed(evt);
         }
      });
      add(C);
      C.setBounds(448, 5, 104, 50);

      A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/A_Button.png"))); // NOI18N
      A.setBorder(null);
      A.setContentAreaFilled(false);
      A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      A.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/A_Button.png"))); // NOI18N
      A.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            AMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            AMouseExited(evt);
         }
      });
      A.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            AActionPerformed(evt);
         }
      });
      add(A);
      A.setBounds(48, 5, 104, 50);
      add(jLabel4);
      jLabel4.setBounds(45, 293, 141, 61);
      add(jLabel1);
      jLabel1.setBounds(45, 98, 141, 61);
      add(jLabel2);
      jLabel2.setBounds(45, 163, 141, 61);
      add(jLabel6);
      jLabel6.setBounds(45, 423, 141, 61);
      add(jLabel3);
      jLabel3.setBounds(45, 228, 141, 61);
      add(jLabel5);
      jLabel5.setBounds(45, 358, 141, 61);
      add(jLabel10);
      jLabel10.setBounds(45, 683, 141, 61);
      add(jLabel7);
      jLabel7.setBounds(45, 488, 141, 61);
      add(jLabel8);
      jLabel8.setBounds(45, 553, 141, 61);
      add(jLabel9);
      jLabel9.setBounds(45, 618, 141, 61);
      add(jLabel20);
      jLabel20.setBounds(231, 683, 141, 61);
      add(jLabel17);
      jLabel17.setBounds(231, 488, 141, 61);
      add(jLabel18);
      jLabel18.setBounds(231, 553, 141, 61);
      add(jLabel19);
      jLabel19.setBounds(231, 618, 141, 61);
      add(jLabel14);
      jLabel14.setBounds(231, 293, 141, 61);
      add(jLabel11);
      jLabel11.setBounds(231, 98, 141, 61);
      add(jLabel12);
      jLabel12.setBounds(231, 163, 141, 61);
      add(jLabel16);
      jLabel16.setBounds(231, 423, 141, 61);
      add(jLabel13);
      jLabel13.setBounds(231, 228, 141, 61);
      add(jLabel15);
      jLabel15.setBounds(231, 358, 141, 61);
      add(jLabel30);
      jLabel30.setBounds(465, 683, 141, 61);
      add(jLabel27);
      jLabel27.setBounds(465, 488, 141, 61);
      add(jLabel28);
      jLabel28.setBounds(465, 553, 141, 61);
      add(jLabel29);
      jLabel29.setBounds(465, 618, 141, 61);
      add(jLabel24);
      jLabel24.setBounds(465, 293, 141, 61);
      add(jLabel21);
      jLabel21.setBounds(465, 98, 141, 61);
      add(jLabel22);
      jLabel22.setBounds(465, 163, 141, 61);
      add(jLabel26);
      jLabel26.setBounds(465, 423, 141, 61);
      add(jLabel23);
      jLabel23.setBounds(465, 228, 141, 61);
      add(jLabel25);
      jLabel25.setBounds(465, 358, 141, 61);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Test_Selection.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 600, 640);
   }// </editor-fold>//GEN-END:initComponents

    /**
     * ActionPerformed method for Option B.
     * @param evt is the action, performed by the user
     */
    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed

        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        for(char i: listB){
           tmm.addMovementPattern(i); 
        }
        tmm.play();
    }//GEN-LAST:event_BActionPerformed

    /**
     * ActionPerformed method for Option A.
     * @param evt is the action, performed by the user
     */
    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        for(char i: listA){
           tmm.addMovementPattern(i); 
        }
        tmm.play();
    }//GEN-LAST:event_AActionPerformed

    /**
     * ActionPerformed method for Option C.
     * @param evt is the action, performed by the user
     */
    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed

        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        for(char i: listC){
           tmm.addMovementPattern(i); 
        }
        tmm.play(); 
    }//GEN-LAST:event_CActionPerformed

   private void AMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseEntered
      A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/A_Button_Clicked.png")));
   }//GEN-LAST:event_AMouseEntered

   private void AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseExited
      A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/A_Button.png")));
   }//GEN-LAST:event_AMouseExited

   private void BMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseEntered
      B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/B_Button_Clicked.png")));
   }//GEN-LAST:event_BMouseEntered

   private void BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseExited
      B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/B_Button.png")));
   }//GEN-LAST:event_BMouseExited

   private void CMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseEntered
      C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/C_Button_Clicked.png")));
   }//GEN-LAST:event_CMouseEntered

   private void CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseExited
      C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/C_Button.png")));
   }//GEN-LAST:event_CMouseExited
     public void setList1(ArrayList<Character> list1){
        listA = list1;
        labelInitialize();
    }
    
    public void setList2(ArrayList<Character> list2){
        listB = list2;
        labelInitialize();
    }
    
    public void setList3(ArrayList<Character> list3){
        listC = list3;
        labelInitialize();
    }
    /**
     * A method to make all options clickable.
     */
    public void resetSelectionController(){
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public javax.swing.JButton A;
   public javax.swing.JButton B;
   public javax.swing.JButton C;
   private javax.swing.JLabel background;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel18;
   private javax.swing.JLabel jLabel19;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel20;
   private javax.swing.JLabel jLabel21;
   private javax.swing.JLabel jLabel22;
   private javax.swing.JLabel jLabel23;
   private javax.swing.JLabel jLabel24;
   private javax.swing.JLabel jLabel25;
   private javax.swing.JLabel jLabel26;
   private javax.swing.JLabel jLabel27;
   private javax.swing.JLabel jLabel28;
   private javax.swing.JLabel jLabel29;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel30;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   // End of variables declaration//GEN-END:variables
}
