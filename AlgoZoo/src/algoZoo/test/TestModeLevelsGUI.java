/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import javax.swing.*;
import java.util.ArrayList;

/**
 * It creates the levels screen of the test  mode
 * @author Ayberk, Arda, Kerem
 * @version 1.0
 */
public class TestModeLevelsGUI extends javax.swing.JPanel {
    //properties
    private ArrayList<JButton> buttons;

   //constructor
   /**
    * Creates new form TestModeLevelsGUI.
    */
   public TestModeLevelsGUI() {
      initComponents();
      buttons = new ArrayList<JButton>();
      addButtons();
      try {
         for (int i = 0; i < TestLevelsSave.load().size(); i++) {
            if (TestLevelsSave.load().get(i)) {
               buttons.get(i).setEnabled(true);
               buttons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/" + (i + 1) + ".png")));
            } 
            else {
               buttons.get(i).setEnabled(false);
            }
         }
      } catch (NullPointerException e) {
         for (int j = 1; j < buttons.size(); j++) {
            buttons.get(j).setEnabled(false);
         }
      }
   }

   //methods
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jButton1 = new algoZoo.game.LevelButton(1);
      jButton2 = new algoZoo.game.LevelButton(2);
      jButton3 = new algoZoo.game.LevelButton(3);
      jButton4 = new algoZoo.game.LevelButton(4);
      jButton5 = new algoZoo.game.LevelButton(5);
      jButton6 = new algoZoo.game.LevelButton(6);
      jButton7 = new algoZoo.game.LevelButton(7);
      jButton8 = new algoZoo.game.LevelButton(8);
      jButton9 = new algoZoo.game.LevelButton(9);
      jButton10 = new algoZoo.game.LevelButton(10);
      background = new javax.swing.JLabel();

      setLayout(null);

      jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/1.png"))); // NOI18N
      jButton1.setBorder(null);
      jButton1.setContentAreaFilled(false);
      jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      add(jButton1);
      jButton1.setBounds(255, 350, 95, 95);

      jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton2.setBorder(null);
      jButton2.setContentAreaFilled(false);
      jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton2);
      jButton2.setBounds(455, 350, 95, 95);

      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton3.setBorder(null);
      jButton3.setContentAreaFilled(false);
      jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton3);
      jButton3.setBounds(655, 350, 95, 95);

      jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton4.setBorder(null);
      jButton4.setContentAreaFilled(false);
      jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton4);
      jButton4.setBounds(855, 350, 95, 95);

      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton5.setBorder(null);
      jButton5.setContentAreaFilled(false);
      jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton5);
      jButton5.setBounds(1055, 350, 95, 95);

      jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton6.setBorder(null);
      jButton6.setContentAreaFilled(false);
      jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton6);
      jButton6.setBounds(255, 550, 95, 95);

      jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton7.setBorder(null);
      jButton7.setContentAreaFilled(false);
      jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton7);
      jButton7.setBounds(455, 550, 95, 95);

      jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton8.setBorder(null);
      jButton8.setContentAreaFilled(false);
      jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton8);
      jButton8.setBounds(655, 550, 95, 95);

      jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton9.setBorder(null);
      jButton9.setContentAreaFilled(false);
      jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton9);
      jButton9.setBounds(855, 550, 95, 95);

      jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      jButton10.setBorder(null);
      jButton10.setContentAreaFilled(false);
      jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/Lock.png"))); // NOI18N
      add(jButton10);
      jButton10.setBounds(1055, 550, 95, 95);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Test_Mode_Levels_Background.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 1400, 800);
   }// </editor-fold>//GEN-END:initComponents

   /**
    * A method to add all buttons to ArrayList.
    */
   public void addButtons() {
      buttons.add(jButton1);
      buttons.add(jButton2);
      buttons.add(jButton3);
      buttons.add(jButton4);
      buttons.add(jButton5);
      buttons.add(jButton6);
      buttons.add(jButton7);
      buttons.add(jButton8);
      buttons.add(jButton9);
      buttons.add(jButton10);

      for (int i = 1; i < buttons.size(); i++) {
         buttons.get(i).setEnabled(false);
      }
   }

   /**
    * Get method for specific Button.
    *
    * @param levelNo
    * @return button
    */
   public JButton getJButton(int levelNo) {
      return buttons.get(levelNo - 1);
   }

   /**
    * A method to set image into a button.
    *
    * @param jb JButton that an image will be set
    * @param i The image
    */
   public void setJButtonIcon(JButton jb, ImageIcon i) {
      jb.setIcon(i);
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   private algoZoo.game.LevelButton jButton1;
   private algoZoo.game.LevelButton jButton10;
   private algoZoo.game.LevelButton jButton2;
   private algoZoo.game.LevelButton jButton3;
   private algoZoo.game.LevelButton jButton4;
   private algoZoo.game.LevelButton jButton5;
   private algoZoo.game.LevelButton jButton6;
   private algoZoo.game.LevelButton jButton7;
   private algoZoo.game.LevelButton jButton8;
   private algoZoo.game.LevelButton jButton9;
   // End of variables declaration//GEN-END:variables
}
