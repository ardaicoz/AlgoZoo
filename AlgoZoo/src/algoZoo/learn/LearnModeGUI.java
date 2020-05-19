/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.Animal;
import algoZoo.game.CodeView;
import algoZoo.game.Flower;
import algoZoo.game.MapView;
import algoZoo.game.SelectionController;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Ayberk, Görkem
 * @version 1.0
 */
public class LearnModeGUI extends javax.swing.JPanel {

   // properties
   MapView mapView;
   CodeView codeView;
   LearnModeModel lmm;
   SelectionController selectionController;
   LearnLevels currentLevel;
   LearnLevelsContainer learnLevelsContainer;

   // constructor
   /**
    * Creates new form LearnModeGUI
    */
   public LearnModeGUI() {
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
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        retryButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Game_Button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(1005, 335, 80, 70);

        retryButton.setText("RETRY");
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });
        add(retryButton);
        retryButton.setBounds(0, 0, 83, 29);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/In_Game_Background.png"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1400, 800);
    }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      getModel().play();
      for (JButton b : selectionController.getButtons()) {
         b.setEnabled(false);
      }
      selectionController.getForButton().setEnabled(false);
      if (lmm.getMovementPattern().isEmpty()) {
         mapView.endMessage();
      }
      if (lmm.hasWon()) {
         saveLearnLevel(currentLevel.getLevel());
      }

      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
   }//GEN-LAST:event_jButton1ActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
       if (isBeeMoving()) {
       } else {
          lmm.resetMovementPattern();
          if (lmm.getAnimal().getName().equals("Bee")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
          } else if (lmm.getAnimal().getName().equals("Bee2")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));
          } else if (lmm.getAnimal().getName().equals("Bee3")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));
          } else if (lmm.getAnimal().getName().equals("Bee4")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));
          }
          lmm.setCurrentX(lmm.getStartX());
          lmm.setCurrentY(lmm.getStartY());
          lmm.setGameOver(false);
          lmm.update();
          mapView.resetMap();
          selectionController.resetSelectionController();
          initNewLevel();
       }

       playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
    }//GEN-LAST:event_retryButtonActionPerformed

   // methods
   /**
    *
    */
   private void initMyComponents() {
      // initialize components  

      initLevels();
      currentLevel = learnLevelsContainer.get(0);
      lmm = new LearnModeModel(currentLevel.getStartX(), currentLevel.getStartY(), currentLevel.getFinishX(), currentLevel.getFinishY(), currentLevel.getMinRequiredMovements(), currentLevel.getFlowers());

      mapView = new MapView(lmm);
      codeView = new CodeView();
      selectionController = new SelectionController(lmm);
      initNewLevel();
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());

      // place components to panel and setVisible
      add(mapView);
      mapView.setBounds(50, 50, 640, 640);
      add(codeView);
      codeView.setBounds(845, 50, 200, 640);
      add(selectionController);
      selectionController.setBounds(1200, 0, 200, 800);

      // initialize game
      lmm.addView(mapView);
      lmm.addView(codeView);
      lmm.addView(selectionController.getForView());

   }

   /**
    * Initialize each level of the Learn Mode.
    */
   public void initLevels() {
      LearnLevels level1 = new LearnLevels(4, 6, 7, 6, 3, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level1.png")), 1, true);
      LearnLevels level2 = new LearnLevels(7, 6, 5, 5, 3, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level2.png")), 2, false);
      LearnLevels level3 = new LearnLevels(4, 7, 7, 5, 6, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level3.png")), 3, false);
      LearnLevels level4 = new LearnLevels(4, 5, 7, 4, 6, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level4.png")), 4, false);
      LearnLevels level5 = new LearnLevels(7, 7, 4, 9, 7, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level5.png")), 5, false);
      LearnLevels level6 = new LearnLevels(4, 7, 8, 7, 6, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level6.png")), 6, false);
      LearnLevels level7 = new LearnLevels(7, 8, 9, 4, 11, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level7.png")), 7, false);
      LearnLevels level8 = new LearnLevels(5, 7, 8, 6, 8, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level8.png")), 8, false);
      LearnLevels level9 = new LearnLevels(4, 8, 8, 8, 11, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level9.png")), 9, false);
      LearnLevels level10 = new LearnLevels(8, 5, 4, 8, 15, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level10.png")), 10, false);

      // Set flowers according to LearnMode Levels
      ArrayList<Flower> flowerContainer = new ArrayList<>();
      //Level1
      level1.setFlowers(flowerContainer);
      //Level2
      level2.setFlowers(flowerContainer);
      //Level3
      flowerContainer.add(new Flower(6, 7));
      level3.setFlowers(flowerContainer);
      //Level4
      flowerContainer.add(new Flower(6, 5));
      flowerContainer.add(new Flower(6, 5));
      level4.setFlowers(flowerContainer);
      //Level5
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(5, 9));
      level5.setFlowers(flowerContainer);
      //Level6
      flowerContainer.add(new Flower(5, 7));
      flowerContainer.add(new Flower(6, 7));
      level6.setFlowers(flowerContainer);
      //Level7
      flowerContainer.add(new Flower(8, 5));
      flowerContainer.add(new Flower(7, 6));
      flowerContainer.add(new Flower(6, 7));
      level7.setFlowers(flowerContainer);
      //Level8
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(7, 8));
      level8.setFlowers(flowerContainer);
      //Level9
      flowerContainer.add(new Flower(5, 7));
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(7, 9));
      level9.setFlowers(flowerContainer);
      //Level10      
      flowerContainer.add(new Flower(7, 5));
      flowerContainer.add(new Flower(8, 6));
      flowerContainer.add(new Flower(7, 7));
      flowerContainer.add(new Flower(8, 8));
      level10.setFlowers(flowerContainer);

      learnLevelsContainer = new LearnLevelsContainer();
      learnLevelsContainer.add(level1);
      learnLevelsContainer.add(level2);
      learnLevelsContainer.add(level3);
      learnLevelsContainer.add(level4);
      learnLevelsContainer.add(level5);
      learnLevelsContainer.add(level6);
      learnLevelsContainer.add(level7);
      learnLevelsContainer.add(level8);
      learnLevelsContainer.add(level9);
      learnLevelsContainer.add(level10);

      //SaveGame.save(learnLevelsContainer);
   }

   /**
    * Initialize new Learn Mode level.
    */
   public void initNewLevel() {
      lmm.setStartX(currentLevel.getStartX());
      lmm.setStartY(currentLevel.getStartY());
      lmm.setFinishX(currentLevel.getFinishX());
      lmm.setFinishY(currentLevel.getFinishY());
      lmm.setFlowers(currentLevel.getFlowers());
      lmm.setNoOfMovements(0);
      lmm.setMinRequiredMovements(currentLevel.getMinRequiredMovements());
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());
   }

   /**
    * Determines which level will start.
    *
    * @param level level number.
    */
   public void setCurrentLevel(int level) {
      currentLevel = learnLevelsContainer.get(level - 1);
      initNewLevel();
   }

   public void saveLearnLevel(int level) {
      learnLevelsContainer.get(level - 1).setAccomplished(true);
      LearnLevelsSave.save(learnLevelsContainer);
   }

   /**
    * Initializes the new game.
    */
   public void initNewGame() {
      lmm.initNewGame();
      mapView.resetMap();
      selectionController.resetSelectionController();
      jButton1.setEnabled(true);
   }

   /**
    *
    * @return
    */
   public LearnModeModel getModel() {
      return lmm;
   }

   public int getLevel() {
      return currentLevel.getLevel();
   }

   /**
    *
    * @return
    */
   public void setAnimal(Animal animal) {
      lmm.setAnimal(animal);
   }

   public boolean isBeeMoving() {
      return mapView.isBeeMoving();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton retryButton;
    // End of variables declaration//GEN-END:variables
}
