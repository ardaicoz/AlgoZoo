/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import algoZoo.game.*;
import java.util.*;
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
   final int TILE_WIDTH = 64;
   final int TILE_HEIGHT = 64;
   final int SPACE_WIDTH = 8;
   final int SPACE_HEIGHT = 12;

   /**
    * Creates new form TestModeLevelsGUI
    */
   public TestModeGUI() {

      initMyComponents();
      initComponents();
   }

   /**
    * A method to initialise all components of the GUI.
    */
   private void initMyComponents() {
      initLevels();
      currentLevel = levelContainer.get(0);
      tmm = new TestModeModel(currentLevel.getStartX(), currentLevel.getStartY(), currentLevel.getFinishX(), currentLevel.getFinishY(), currentLevel.getFlowers());
      options = new TestSelectionButtonsController(tmm, currentLevel.getList1(), currentLevel.getList2(), currentLevel.getList3());
      map = new MapView(tmm);
      add(map);
      map.setBounds(50, 50, 640, 640);
      add(options);
      options.setBounds(700, 0, 700, 800);
      initNewLevel();
      tmm.addView(map);
      map.getMapBackground().setIcon(currentLevel.getMapBackground());
      if (tmm.hasWon()) {
         System.out.println("won");
      }
   }

   /**
    * A method to initialise every level of the game.
    */
   public void initLevels() {
     TestLevels level1 = new TestLevels((TILE_WIDTH * 3) + SPACE_WIDTH, (TILE_HEIGHT * 4) + SPACE_HEIGHT, (TILE_WIDTH * 7) + SPACE_WIDTH,(TILE_HEIGHT * 3) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('d', 'd', 'w', 'd', 'd')), new ArrayList<Character>(Arrays.asList('s', 'a', 's', 'd', 'd')), new ArrayList<Character>(Arrays.asList('s', 'd', 'd', 'w', 'a')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level1.png")), 1);
      TestLevels level2 = new TestLevels((TILE_WIDTH * 5) + SPACE_WIDTH, (TILE_HEIGHT * 7) + SPACE_HEIGHT, (TILE_WIDTH * 2) + SPACE_WIDTH, (TILE_HEIGHT * 4) + SPACE_HEIGHT, new ArrayList<Character>(Arrays.asList('s', 's', 'd', 's', 'd', 'w')), new ArrayList<Character>(Arrays.asList('w', 'a', 'w', 'a', 'w', 'a')), new ArrayList<Character>(Arrays.asList('a', 's', 'd', 'w', 'w', 'a')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level2.png")), 2);
      TestLevels level3 = new TestLevels((TILE_WIDTH * 3) + SPACE_WIDTH, (TILE_HEIGHT * 5) + SPACE_HEIGHT, (TILE_WIDTH * 7) + SPACE_WIDTH, (TILE_HEIGHT * 4) + SPACE_HEIGHT, new ArrayList<Character>(Arrays.asList('s', 'd', 'd', 'w', 'w', 'd', 'd')), new ArrayList<Character>(Arrays.asList('d', 'd', 'a', 's', 's', 's', 'w')), new ArrayList<Character>(Arrays.asList('a', 'a', 's', 's', 's', 'd', 'w')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level3.png")), 3);
      TestLevels level4 = new TestLevels((TILE_WIDTH * 3) + SPACE_WIDTH, (TILE_HEIGHT * 4) + SPACE_HEIGHT, (TILE_WIDTH * 6) + SPACE_WIDTH,(TILE_HEIGHT * 6) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('s', 'd', 'f', 'd', 'f', 's', 'd')), new ArrayList<Character>(Arrays.asList('a', 'a', 's', 'f', 's', 's', 'd')), new ArrayList<Character>(Arrays.asList('w', 'w', 'f', 'd', 'd', 'f', 's')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level4.png")), 4);
      TestLevels level5 = new TestLevels((TILE_WIDTH * 5) + SPACE_WIDTH, (TILE_HEIGHT * 3) + SPACE_HEIGHT, (TILE_WIDTH * 2) + SPACE_WIDTH,(TILE_HEIGHT * 6) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('a', 's', 'f', 'd', 'd', 's', 'f', 'w', 'a')), new ArrayList<Character>(Arrays.asList('d', 'd', 'f', 'f', 's', 's', 'd', 'w', 'd')), new ArrayList<Character>(Arrays.asList('s', 's', 'f', 'f', 's', 'a', 'f', 'a', 'a')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level5.png")), 5);
      TestLevels level6 = new TestLevels((TILE_WIDTH * 6) + SPACE_WIDTH, (TILE_HEIGHT * 9) + SPACE_HEIGHT, (TILE_WIDTH * 1) + SPACE_WIDTH, (TILE_HEIGHT * 6) + SPACE_HEIGHT, new ArrayList<Character>(Arrays.asList('a', 'w', 'a', 'w', 'a', 'w', 'a', 'a')), new ArrayList<Character>(Arrays.asList('d', 's', 'a', 'a', 'w', 'w', 's', 's')), new ArrayList<Character>(Arrays.asList('s', 'd', 'd', 'd', 'w', 's', 'w', 'w')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level6.png")), 6);
      TestLevels level7 = new TestLevels((TILE_WIDTH * 8) + SPACE_WIDTH, (TILE_HEIGHT * 9) + SPACE_HEIGHT, (TILE_WIDTH * 3) + SPACE_WIDTH,(TILE_HEIGHT * 4) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('a', 's', 'a', 'w', 'd', 'd', 'a', 'a', 'w', 'w')), new ArrayList<Character>(Arrays.asList('a', 'd', 'w', 's', 's', 'd', 'w', 'd', 'w', 'd')), new ArrayList<Character>(Arrays.asList('a', 'a', 'w', 'a', 'w', 'a', 'w', 'a', 'w', 'w')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level7.png")), 7);
      TestLevels level8 = new TestLevels((TILE_WIDTH * 8) + SPACE_WIDTH, (TILE_HEIGHT * 6) + SPACE_HEIGHT, (TILE_WIDTH * 6) + SPACE_WIDTH,(TILE_HEIGHT * 4) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('d', 'a', 'a', 'a', 'a', 'w', 'w', 's')), new ArrayList<Character>(Arrays.asList('w', 'w', 's', 's', 'w', 'd', 'd', 'd')), new ArrayList<Character>(Arrays.asList('w', 'd', 'w', 'w', 'a', 's', 'a', 'a')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level8.png")), 8);
      TestLevels level9 = new TestLevels((TILE_WIDTH * 5) + SPACE_WIDTH, (TILE_HEIGHT * 7) + SPACE_HEIGHT, (TILE_WIDTH * 4) + SPACE_WIDTH,(TILE_HEIGHT * 4) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('d', 'a', 'd', 'a', 'd', 'd', 's', 'a', 'd', 'w')), new ArrayList<Character>(Arrays.asList('d', 'd', 'w', 'w', 'w', 'a', 's', 'a', 'w', 'a')), new ArrayList<Character>(Arrays.asList('s', 'd', 'a', 'w', 'a', 'a', 'a', 'a', 'w', 'd')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level9.png")), 9);
      TestLevels level10 = new TestLevels((TILE_WIDTH * 9) + SPACE_WIDTH, (TILE_HEIGHT * 9) + SPACE_HEIGHT, (TILE_WIDTH * 2) + SPACE_WIDTH,(TILE_HEIGHT * 8) + SPACE_HEIGHT , new ArrayList<Character>(Arrays.asList('w', 'a', 'a', 's', 'a', 'w', 'a', 'a', 'a', 'a')), new ArrayList<Character>(Arrays.asList('s', 'd', 'a', 'w', 's', 'w', 'w', 'w', 'a', 'd')), new ArrayList<Character>(Arrays.asList('s', 'd', 'a', 's', 'a', 'w', 's', 'd', 'a', 'w')), new ImageIcon(getClass().getResource("/algoZoo/Maps/TestMode/Level10.png")), 10);
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
    * A method to initialise specific level.
    */
   public void initNewLevel() {
      tmm.setStartX(currentLevel.getStartX());
      tmm.setStartY(currentLevel.getStartY());
      tmm.setFinishX(currentLevel.getFinishX());
      tmm.setFinishY(currentLevel.getFinishY());
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
    * A method to initialise current level.
    */
   public void initNewGame() {
      tmm.initNewGame();
      options.resetSelectionController();
      options.setList1(currentLevel.getList1());
      options.setList2(currentLevel.getList2());
      options.setList3(currentLevel.getList3());
   }

   public void setAnimal(Animal animal) {
      tmm.setAnimal(animal);
   }
   
   public int getLevel(){
      return currentLevel.getLevel();
   }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      background = new javax.swing.JLabel();

      setMaximumSize(new java.awt.Dimension(1400, 800));
      setMinimumSize(new java.awt.Dimension(1400, 800));
      setLayout(null);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Test_In_Game_Background.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 1400, 800);
   }// </editor-fold>//GEN-END:initComponents

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   // End of variables declaration//GEN-END:variables
}
