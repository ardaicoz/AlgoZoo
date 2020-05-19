/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;
import java.io.File;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

/**
 * This is the selection controller class for the test mode
 * @author Ayberk, Arda, Kerem
 * @version 1.0
 */

public class TestSelectionButtonsController extends javax.swing.JPanel {

    //properties
    private TestModeModel tmm;
    private ArrayList<Character> listA;
    private ArrayList<Character> listB;
    private ArrayList<Character> listC;
    ArrayList<JLabel> list1;
    ArrayList<JLabel> list2;
    ArrayList<JLabel> list3;

    //constructors

    public TestSelectionButtonsController(TestModeModel tmm, ArrayList<Character> listA, ArrayList<Character> listB, ArrayList<Character> listC) {
        
        //initializes all the components of the test mode selections
        this.tmm = tmm;
        tmm.initNewGame();
        this.listA = listA;
        this.listB = listB;
        this.listC = listC;
        list1 = new ArrayList<JLabel>();
        list2 = new ArrayList<JLabel>();
        list3 = new ArrayList<JLabel>();
        initComponents();
        createLabels();
    }
    
     //methods
    /**
    * Method to play sound when buttons clicked.
    * @param soundName 
    */
   public void playSound(String filePath) 
   {     
        try 
        {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath) );
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
   }  
    
    /**
     * A method to initialize all JLabels according to movement patterns.
     */
     public void createLabels()
     {
         //changes the labels below option A
         for(int i = 0; i < listA.size(); i++ ){
             if(listA.get(i) == 'w'){
               list1.add(new JLabel());
               add(list1.get(list1.size() - 1));
               list1.get(list1.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
               if ( list1.size() >= 2) {
                  list1.get(list1.size() -1).setBounds(82, list1.get(list1.size()-2).getHeight() + list1.get(list1.size()-2).getY() + 8, 36, 50);
               }
               else {
                  list1.get(list1.size() - 1).setBounds(82,70,36,50);
               }
             }
             if(listA.get(i) == 'a'){
               list1.add(new JLabel());
               add(list1.get(list1.size() - 1));
               list1.get(list1.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
               if ( list1.size() >= 2) {
                  list1.get(list1.size() -1).setBounds(75, list1.get(list1.size()-2).getHeight() + list1.get(list1.size()-2).getY() + 8, 50, 36);
               }
               else {
                  list1.get(list1.size() - 1).setBounds(75,70,50,36);
               }
             }
             if(listA.get(i) == 'd'){
               list1.add(new JLabel());
               add(list1.get(list1.size() - 1));
               list1.get(list1.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
               if ( list1.size() >= 2) {
                  list1.get(list1.size() -1).setBounds(75, list1.get(list1.size()-2).getHeight() + list1.get(list1.size()-2).getY() + 8, 50, 36);
               }
               else {
                  list1.get(list1.size() - 1).setBounds(75,70,50,36);
               }
             }
             if(listA.get(i) == 's'){
               list1.add(new JLabel());
               add(list1.get(list1.size() - 1));
               list1.get(list1.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
               if ( list1.size() >= 2) {
                  list1.get(list1.size() -1).setBounds(82, list1.get(list1.size()-2).getHeight() + list1.get(list1.size()-2).getY() + 8, 36, 50);
               }
               else {
                  list1.get(list1.size() - 1).setBounds(82,70,36,50);
               }
             }      
             if(listA.get(i) == 'f'){
               list1.add(new JLabel());
               add(list1.get(list1.size() - 1));
               list1.get(list1.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
               if ( list1.size() >= 2) {
                  list1.get(list1.size() -1).setBounds(76, list1.get(list1.size()-2).getHeight() + list1.get(list1.size()-2).getY() + 8, 48, 60);
               }
               else {
                  list1.get(list1.size() - 1).setBounds(76,70,48,60);
               }
             }   
         }
         
         //changes the labels below option B
         for(int i = 0; i < listB.size(); i++ ){
             if(listB.get(i) == 'w'){
               list2.add(new JLabel());
               add(list2.get(list2.size() - 1));
               list2.get(list2.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
               if ( list2.size() >= 2) {
                  list2.get(list2.size() -1).setBounds(282, list2.get(list2.size()-2).getHeight() + list2.get(list2.size()-2).getY() + 8, 36, 50);
               }
               else {
                  list2.get(list2.size() - 1).setBounds(282,70,36,50);
               }
             }
             if(listB.get(i) == 'a'){
               list2.add(new JLabel());
               add(list2.get(list2.size() - 1));
               list2.get(list2.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
               if ( list2.size() >= 2) {
                  list2.get(list2.size() -1).setBounds(275, list2.get(list2.size()-2).getHeight() + list2.get(list2.size()-2).getY() + 8, 50, 36);
               }
               else {
                  list2.get(list2.size() - 1).setBounds(275,70,50,36);
               }
             }
             if(listB.get(i) == 'd'){
               list2.add(new JLabel());
               add(list2.get(list2.size() - 1));
               list2.get(list2.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
               if ( list2.size() >= 2) {
                  list2.get(list2.size() -1).setBounds(275, list2.get(list2.size()-2).getHeight() + list2.get(list2.size()-2).getY() + 8, 50, 36);
               }
               else {
                  list2.get(list2.size() - 1).setBounds(275,70,50,36);
               }
             }
             if(listB.get(i) == 's'){
               list2.add(new JLabel());
               add(list2.get(list2.size() - 1));
               list2.get(list2.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
               if ( list2.size() >= 2) {
                  list2.get(list2.size() -1).setBounds(282, list2.get(list2.size()-2).getHeight() + list2.get(list2.size()-2).getY() + 8, 36, 50);
               }
               else {
                  list2.get(list2.size() - 1).setBounds(282,70,36,50);
               }
             }      
             if(listB.get(i) == 'f'){
               list2.add(new JLabel());
               add(list2.get(list2.size() - 1));
               list2.get(list2.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
               if ( list2.size() >= 2) {
                  list2.get(list2.size() -1).setBounds(276, list2.get(list2.size()-2).getHeight() + list2.get(list2.size()-2).getY() + 8, 48, 60);
               }
               else {
                  list2.get(list2.size() - 1).setBounds(276,70,48,60);
               }
             }   
         }
         
         
         //changes the labels below option C
         for(int i = 0; i < listC.size(); i++ ){
             if(listC.get(i) == 'w'){
               list3.add(new JLabel());
               add(list3.get(list3.size() - 1));
               list3.get(list3.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
               if ( list3.size() >= 2) {
                  list3.get(list3.size() -1).setBounds(482, list3.get(list3.size()-2).getHeight() + list3.get(list3.size()-2).getY() + 8, 36, 50);
               }
               else {
                  list3.get(list3.size() - 1).setBounds(482,70,36,50);
               }
             }
             if(listC.get(i) == 'a'){
               list3.add(new JLabel());
               add(list3.get(list3.size() - 1));
               list3.get(list3.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
               if ( list3.size() >= 2) {
                  list3.get(list3.size() -1).setBounds(475, list3.get(list3.size()-2).getHeight() + list3.get(list3.size()-2).getY() + 8, 50, 36);
               }
               else {
                  list3.get(list3.size() - 1).setBounds(475,70,50,36);
               }
             }
             if(listC.get(i) == 'd'){
               list3.add(new JLabel());
               add(list3.get(list3.size() - 1));
               list3.get(list3.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
               if ( list3.size() >= 2) {
                  list3.get(list3.size() -1).setBounds(475, list3.get(list3.size()-2).getHeight() + list3.get(list3.size()-2).getY() + 8, 50, 36);
               }
               else {
                  list3.get(list3.size() - 1).setBounds(475,70,50,36);
               }
             }
             if(listC.get(i) == 's'){
               list3.add(new JLabel());
               add(list3.get(list3.size() - 1));
               list3.get(list3.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
               if ( list3.size() >= 2) {
                  list3.get(list3.size() -1).setBounds(482, list3.get(list3.size()-2).getHeight() + list3.get(list3.size()-2).getY() + 8, 36, 50);
               }
               else {
                  list3.get(list3.size() - 1).setBounds(482,70,36,50);
               }
             }      
             if(listC.get(i) == 'f'){
               list3.add(new JLabel());
               add(list3.get(list3.size() - 1));
               list3.get(list3.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
               if ( list3.size() >= 2) {
                  list3.get(list3.size() -1).setBounds(476, list3.get(list3.size()-2).getHeight() + list3.get(list3.size()-2).getY() + 8, 48, 60);
               }
               else {
                  list3.get(list3.size() - 1).setBounds(476,70,48,60);
               }
             }   
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
        
        playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
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
        
        playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
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
        
        playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
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
   
   /**
    * set method for the pattern below the option A
    *
    * @param list1 list to be set as the pattern below option A
    */
   public void setList1(ArrayList<Character> list1){
        listA = list1;
    }
    
   /**
    * set method for the pattern below the option B
    *
    * @param list2 list to be set as the pattern below option B
    */
    public void setList2(ArrayList<Character> list2){
        listB = list2;
    }
    
    /**
    * set method for the pattern below the option C
    *
    * @param list3 list to be set as the pattern below option C
    */
    public void setList3(ArrayList<Character> list3){
        listC = list3;
    }
    /**
     * A method to make all options clickable.
     */
    public void resetSelectionController(){
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
    }
    
    public void removeLabels() {
       for (int i = 0; i < list1.size(); i++) {
          remove(list1.get(i));
       }
       for (int i = 0; i < list2.size(); i++) {
          remove(list2.get(i));
       }
       for (int i = 0; i < list3.size(); i++) {
          remove(list3.get(i));
       }
       list1.removeAll(list1);
       list2.removeAll(list2);
       list3.removeAll(list3);
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public javax.swing.JButton A;
   public javax.swing.JButton B;
   public javax.swing.JButton C;
   private javax.swing.JLabel background;
   // End of variables declaration//GEN-END:variables
}
