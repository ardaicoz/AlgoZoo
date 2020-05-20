/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import algoZoo.game.*;
import java.io.File;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

/**
 *
 * @author Kerem, Arda
 */
public class TestModeGUI extends javax.swing.JPanel {

   //properties
   TestSelectionButtonsController options;
   MapView map;
   TestModeModel tmm;
   TestLevels currentLevel;
   ArrayList<TestLevels> levelContainer;

   //constructors
   
   /**
    * Creates new form TestModeLevelsGUI
    */
   public TestModeGUI() {

      initMyComponents();
      initComponents();
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
    * A method to initialize all components of the GUI.
    */
   private void initMyComponents() {
      
      //initializes the components of the level
      initLevels();
      currentLevel = levelContainer.get(0);
      tmm = new TestModeModel(currentLevel.getStartX(), currentLevel.getStartY(), currentLevel.getFinishX(), currentLevel.getFinishY(), currentLevel.getFlowers());
      options = new TestSelectionButtonsController(tmm, currentLevel.getList1(), currentLevel.getList2(), currentLevel.getList3());
      map = new MapView(tmm);
      
      //adds the created components to the panel
      add(map);
      map.setBounds(50, 50, 640, 640);
      add(options);
      options.setBounds(700, 50, 700, 800);
      initNewLevel();
      tmm.addView(map);
      map.getMapBackground().setIcon(currentLevel.getMapBackground());
      if (tmm.hasWon()) {
         System.out.println("won");
      }
   }

   /**
    * A method to initialize every level of the test mode.
    */
   public void initLevels() {
      TestLevels level1 = new TestLevels(4, 5, 8, 4, new ArrayList<Character>(Arrays.asList('d', 'd', 'w', 'd', 'd')), new ArrayList<Character>(Arrays.asList('w', 'w', 'd', 'd', 'd')), new ArrayList<Character>(Arrays.asList('d', 'd', 'd', 'w', 's')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level1.png")), 1);
      TestLevels level2 = new TestLevels(6, 8, 3, 5, new ArrayList<Character>(Arrays.asList('w', 'w', 'w', 'a', 'a', 's')), new ArrayList<Character>(Arrays.asList('w', 'a', 'w', 'a', 'w', 'a')), new ArrayList<Character>(Arrays.asList('a', 'w', 'w', 'a', 'w', 'd')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level2.png")), 2);
      TestLevels level3 = new TestLevels(4, 6, 8, 5, new ArrayList<Character>(Arrays.asList('s', 'd', 'd', 'w', 'w', 'd', 'd')), new ArrayList<Character>(Arrays.asList('d', 'd', 'd', 'w', 'a', 'w', 'd')), new ArrayList<Character>(Arrays.asList('s', 's', 'd', 'd', 'w', 'd', 'd')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level3.png")), 3);
      TestLevels level4 = new TestLevels(4, 5, 7, 7, new ArrayList<Character>(Arrays.asList('s', 'd', 'f', 'd', 'f', 's', 'd')), new ArrayList<Character>(Arrays.asList('d', 's', 'f', 's', 'f', 'd', 's')), new ArrayList<Character>(Arrays.asList('s', 'd', 'f', 'd', 'f', 'd', 'd')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level4.png")), 4);
      TestLevels level5 = new TestLevels(6, 4, 3, 7, new ArrayList<Character>(Arrays.asList('s', 's', 's', 'f', 's', 'a', 'a', 'f', 'a', 's')), new ArrayList<Character>(Arrays.asList('s', 's', 's', 'f', 'a', 'a', 's', 'f', 'a', 'a')), new ArrayList<Character>(Arrays.asList('s', 's', 's', 'f', 's', 'a', 'a', 'f', 'a', 'w')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level5.png")), 5);
      TestLevels level6 = new TestLevels(6, 5, 2, 7, new ArrayList<Character>(Arrays.asList('a', 's', 'f', 's', 's', 'a', 'f', 'a', 'w', 'a')), new ArrayList<Character>(Arrays.asList('a', 's', 'f', 's', 's', 'a', 'f', 's', 'd', 's')), new ArrayList<Character>(Arrays.asList('a', 's', 'f', 's', 's', 'a', 'f', 'a', 'w', 'd')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level6.png")), 6);
      TestLevels level7 = new TestLevels(6, 10, 4, 5, new ArrayList<Character>(Arrays.asList('w', 'w', 'f', 'a', 'w', 'f', 'a', 'w', 'f', 'd')), new ArrayList<Character>(Arrays.asList('w', 'w', 'f', 'a', 'w', 'f', 'a', 's', 'f', 'w')), new ArrayList<Character>(Arrays.asList('w', 'w', 'f', 'a', 'w', 'f', 'a', 'w', 'f', 'w')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level7.png")), 7);
      TestLevels level8 = new TestLevels(5, 2, 7, 5, new ArrayList<Character>(Arrays.asList('a', 's', 'f', 'd', 's', 'f', 'a', 'w', 'f', 's')), new ArrayList<Character>(Arrays.asList('a', 's', 'f', 'd', 's', 'f', 's', 'd', 'f', 'w')), new ArrayList<Character>(Arrays.asList('a', 's', 'f', 'd', 's', 'f', 's', 'd', 'f', 'd')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level8.png")), 8);
      TestLevels level9 = new TestLevels(8, 6, 5, 5, new ArrayList<Character>(Arrays.asList('s', 's', 'a', 'a', 'f', 'w', 'w', 'f', 's', 'd')), new ArrayList<Character>(Arrays.asList('s', 's', 'a', 'a', 'f', 'w', 'w', 'f', 'a', 'w')), new ArrayList<Character>(Arrays.asList('s', 's', 'a', 'a', 'f', 'w', 'a', 'f', 'd', 's')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level9.png")), 9);
      TestLevels level10 = new TestLevels(6, 5, 3, 9, new ArrayList<Character>(Arrays.asList('s', 's', 'f', 'a', 's', 'f', 's', 'a', 'f', 'a')), new ArrayList<Character>(Arrays.asList('s', 's', 'f', 'a', 's', 'f', 's', 'a', 'f', 'w')), new ArrayList<Character>(Arrays.asList('s', 's', 'f', 'a', 's', 'f', 's', 'a', 'f', 's')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level10.png")), 10);
      
      // Set flowers
      ArrayList<Flower> flowerContainer = new ArrayList<>();
      //Level1
      level1.setFlowers(flowerContainer);
      
      //Level2
      level2.setFlowers(flowerContainer);
      
      //Level3
      level3.setFlowers(flowerContainer);
      
      //Level4
      flowerContainer.add(new Flower(5, 6));
      flowerContainer.add(new Flower(6, 6));
      level4.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      //Level5
      flowerContainer.add(new Flower(4, 8));
      flowerContainer.add(new Flower(6, 7));
      level5.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      //Level6
      flowerContainer.add(new Flower(5, 6));
      flowerContainer.add(new Flower(4, 8));
      level6.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      //Level7
      flowerContainer.add(new Flower(4, 6));
      flowerContainer.add(new Flower(5, 7));
      flowerContainer.add(new Flower(6, 8));
      level7.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      //Level8
      flowerContainer.add(new Flower(4, 3));
      flowerContainer.add(new Flower(5, 4));
      flowerContainer.add(new Flower(6, 5));
      level8.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      //Level9
      flowerContainer.add(new Flower(6, 6));
      flowerContainer.add(new Flower(6, 8));
      level9.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      //Level10      
      flowerContainer.add(new Flower(4, 9));
      flowerContainer.add(new Flower(5, 8));
      flowerContainer.add(new Flower(6, 7));
      level10.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      
      //creates an ArrayList for all levels and adds all levels to it
      levelContainer = new ArrayList<>();
      levelContainer.add(level1);
      levelContainer.add(level2);
      levelContainer.add(level3);
      levelContainer.add(level4);
      levelContainer.add(level5);
      levelContainer.add(level6);
      levelContainer.add(level7);
      levelContainer.add(level8);
      levelContainer.add(level9);
      levelContainer.add(level10); 
      
   }

   /**
    * Get method to get the model of Test mode.
    *
    * @return the model as TestModeModel class
    */
   public TestModeModel getModel() {
      return tmm;
   }

   /**
    * A method to initialize specific level.
    */
   public void initNewLevel() {
      tmm.setStartX(currentLevel.getStartX());
      tmm.setStartY(currentLevel.getStartY());
      tmm.setFinishX(currentLevel.getFinishX());
      tmm.setFinishY(currentLevel.getFinishY());
      tmm.setFlowers(currentLevel.getFlowers());
      map.getMapBackground().setIcon(currentLevel.getMapBackground());
   }

   /**
    * Determines which level will start.
    *
    * @param level level number.
    */
   public void setCurrentLevel(int level) {
      currentLevel = levelContainer.get(level - 1);
      initNewLevel();
   }

   /**
    * A method to initialize current level.
    */
   public void initNewGame() {
      tmm.initNewGame();
      map.resetMap();
      options.resetSelectionController();
      options.removeLabels();
      options.setList1(currentLevel.getList1());
      options.setList2(currentLevel.getList2());
      options.setList3(currentLevel.getList3());
      options.createLabels();
      for ( int i = 0; i < tmm.getFlowers().size(); i++) {
         tmm.getFlowers().get(i).setPollenGathered(false);
      }
   }
   
   /**
    * Sets the animal to be played with
    *
    * @param animal animal chosen to be played with
    */
   public void setAnimal(Animal animal) {
      tmm.setAnimal(animal);
   }
   
   /**
    * Gets the current level of the test mode
    *
    * @return the processing level of the test mode
    */
   public int getLevel(){
      return currentLevel.getLevel();
   }
   
   public boolean isBeeMoving() {
       return map.isBeeMoving();
   }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      retryButton = new javax.swing.JButton();
      background = new javax.swing.JLabel();

      setMaximumSize(new java.awt.Dimension(1400, 800));
      setMinimumSize(new java.awt.Dimension(1400, 800));
      setLayout(null);

      retryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Retry_Button.png"))); // NOI18N
      retryButton.setBorder(null);
      retryButton.setContentAreaFilled(false);
      retryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      retryButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            retryButtonActionPerformed(evt);
         }
      });
      add(retryButton);
      retryButton.setBounds(0, 0, 40, 40);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Test_In_Game_Background.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 1400, 800);
   }// </editor-fold>//GEN-END:initComponents

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
      if(isBeeMoving()) { }
      else {
        tmm.resetMovementPattern();
        if ( tmm.getAnimal().getName().equals("Bee")){
           tmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));         
        }
        else if ( tmm.getAnimal().getName().equals("Butterfly")){
           tmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Butterfly_Right.png")));               
        }
        tmm.setCurrentX(tmm.getStartX());
        tmm.setCurrentY(tmm.getStartY());
        tmm.setGameOver(false);
        tmm.update();
        map.resetMap();
        options.resetSelectionController();
        options.setList1(currentLevel.getList1());
        options.setList2(currentLevel.getList2());
        options.setList3(currentLevel.getList3());
        initNewLevel();
      }
      
      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
    }//GEN-LAST:event_retryButtonActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   private javax.swing.JButton retryButton;
   // End of variables declaration//GEN-END:variables
}
