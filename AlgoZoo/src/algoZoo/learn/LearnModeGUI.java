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
 * This class is for basic GUI design of Learn Mode.
 * @author Ayberk, Görkem
 * @version 1.0
 */
public class LearnModeGUI extends javax.swing.JPanel {

   // properties
   private MapView                  mapView;
   private CodeView                 codeView;
   private LearnModeModel           lmm;
   private LearnLevels              currentLevel;
   private SelectionController      selectionController;
   private ArrayList<LearnLevels>   levelContainer;
   private LearnLevelsSaveContainer learnLevelsSaveContainer;

   // constructor
   /**
    * Creates new form LearnModeGUI
    */
   public LearnModeGUI() {
      initMyComponents();
      initComponents();
      addScroll();
   }

   //methods
   /**
    * Method to play sound when buttons clicked.
    *
    * @param soundName The path of the sound file.
    */
   private void playSound(String filePath) {
      try {
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
         Clip clip = AudioSystem.getClip();
         clip.open(audioInputStream);
         clip.start();
      } catch (Exception ex) {
         System.out.println("Error with playing sound.");
         ex.printStackTrace();
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

      playButton = new javax.swing.JButton();
      retryButton = new javax.swing.JButton();
      scrollUp = new javax.swing.JButton();
      scrollDown = new javax.swing.JButton();
      background = new javax.swing.JLabel();

      setLayout(null);

      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Game_Button.png"))); // NOI18N
      playButton.setBorder(null);
      playButton.setContentAreaFilled(false);
      playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      playButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Game_Button.png"))); // NOI18N
      playButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Game_Button_Clicked.png"))); // NOI18N
      playButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            playButtonActionPerformed(evt);
         }
      });
      add(playButton);
      playButton.setBounds(1005, 335, 80, 70);

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

      scrollUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Scroll_Up_Button.png"))); // NOI18N
      scrollUp.setBorder(null);
      scrollUp.setContentAreaFilled(false);
      scrollUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      scrollUp.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            scrollUpActionPerformed(evt);
         }
      });
      add(scrollUp);
      scrollUp.setBounds(1050, 720, 54, 30);

      scrollDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Scroll_Down_Button.png"))); // NOI18N
      scrollDown.setBorder(null);
      scrollDown.setContentAreaFilled(false);
      scrollDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      scrollDown.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            scrollDownActionPerformed(evt);
         }
      });
      add(scrollDown);
      scrollDown.setBounds(1050, 760, 54, 30);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/In_Game_Background.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 1400, 800);
   }// </editor-fold>//GEN-END:initComponents

   /**
    * Actions that accures after the play button is clicked.
    * @param Event mouse clicked.
    */
   private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
      if (lmm.getMovementPattern().isEmpty() || lmm.isGameOver()) {
      } 
      else {
         getModel().play();
         for (JButton b : selectionController.getButtons()) {
            b.setEnabled(false);
         }
         playButton.setEnabled(false);
         selectionController.getForButton().setEnabled(false);
         if (lmm.getMovementPattern().isEmpty()) {
            mapView.endMessage();
         }
         if (lmm.hasWon() && currentLevel.getLevel() != 10) {
            learnLevelsSaveContainer.setTrue(currentLevel.getLevel());
            // to record achievements
            LearnLevelsSave.save(learnLevelsSaveContainer);
         }
      }
      playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
   }//GEN-LAST:event_playButtonActionPerformed

   /**
    * Actions that accures after the retry button is clicked.
    * @param Event mouse clicked.
    */
    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
       if (isBeeMoving()) {
       } 
       else {
          lmm.resetMovementPattern();
          if (lmm.getAnimal().getName().equals("Bee")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
          } 
          else if (lmm.getAnimal().getName().equals("Bee2")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));
          } 
          else if (lmm.getAnimal().getName().equals("Bee3")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));
          } 
          else if (lmm.getAnimal().getName().equals("Bee4")) {
             lmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));
          }
          lmm.setCurrentX(lmm.getStartX());
          lmm.setCurrentY(lmm.getStartY());
          lmm.setGameOver(false);
          lmm.update();
          mapView.resetMap();
          selectionController.resetSelectionController();
          playButton.setEnabled(true);
          initNewLevel();
          codeView.setLocation(845, 0);
       }
       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_retryButtonActionPerformed

   /**
    * Actions that accures after the scrollDown button is clicked.
    * @param Event mouse clicked.
    */
    private void scrollDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollDownActionPerformed
       int x = codeView.getX();
       int y = codeView.getY();
       int h = codeView.getHeight();

       if (y == 800 - h || codeView.getLength() < 800 || (codeView.getLength() - 800 + 10) < -y) {
       } 
       else {
          codeView.setLocation(x, y - 50);
       }
    }//GEN-LAST:event_scrollDownActionPerformed

   /**
    * Actions that accures after the scrollUp button is clicked.
    *
    * @param Event mouse clicked.
    */
    private void scrollUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollUpActionPerformed
       int x = codeView.getX();
       int y = codeView.getY();
       int h = codeView.getHeight();

       if (y == 0) {
       } 
       else {
          codeView.setLocation(x, y + 50);
       }
    }//GEN-LAST:event_scrollUpActionPerformed

   /**
    * Initializes the new level and view classes. Sets view componenets' bounds.
    * Adds views to model.
    */
   private void initMyComponents() {
      // initialize components  
      initLevels();
      currentLevel = levelContainer.get(0);
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
      codeView.setBounds(845, 0, 200, 2000);
      add(selectionController);
      selectionController.setBounds(1200, 0, 200, 800);

      // initialize game
      lmm.addView(mapView);
      lmm.addView(codeView);
      lmm.addView(selectionController.getForView());

   }

   /**
    * Creates each level of the Learn Mode.
    */
   private void initLevels() {
      // Initialize levels.
      LearnLevels level1 = new LearnLevels(4, 6, 7, 6, 3, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level1.png")), 1);
      LearnLevels level2 = new LearnLevels(7, 6, 5, 5, 3, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level2.png")), 2);
      LearnLevels level3 = new LearnLevels(4, 7, 7, 5, 6, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level3.png")), 3);
      LearnLevels level4 = new LearnLevels(4, 5, 7, 4, 6, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level4.png")), 4);
      LearnLevels level5 = new LearnLevels(7, 7, 4, 9, 7, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level5.png")), 5);
      LearnLevels level6 = new LearnLevels(4, 7, 8, 7, 6, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level6.png")), 6);
      LearnLevels level7 = new LearnLevels(7, 8, 9, 4, 11, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level7.png")), 7);
      LearnLevels level8 = new LearnLevels(5, 7, 8, 6, 8, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level8.png")), 8);
      LearnLevels level9 = new LearnLevels(4, 8, 8, 8, 11, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level9.png")), 9);
      LearnLevels level10 = new LearnLevels(8, 5, 4, 8, 15, new ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level10.png")), 10);

      // Set flowers according to LearnMode Levels
      ArrayList<Flower> flowerContainer = new ArrayList<>();
      //Level1
      level1.setFlowers(flowerContainer);
      //Level2
      level2.setFlowers(flowerContainer);
      //Level3
      flowerContainer.add(new Flower(6, 7));
      level3.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level4
      flowerContainer.add(new Flower(6, 5));
      flowerContainer.add(new Flower(6, 5));
      level4.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level5
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(5, 9));
      level5.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level6
      flowerContainer.add(new Flower(5, 7));
      flowerContainer.add(new Flower(6, 7));
      level6.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level7
      flowerContainer.add(new Flower(8, 5));
      flowerContainer.add(new Flower(7, 6));
      flowerContainer.add(new Flower(6, 7));
      level7.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level8
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(7, 8));
      level8.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level9
      flowerContainer.add(new Flower(5, 7));
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(7, 9));
      level9.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);
      //Level10      
      flowerContainer.add(new Flower(7, 5));
      flowerContainer.add(new Flower(8, 6));
      flowerContainer.add(new Flower(7, 7));
      flowerContainer.add(new Flower(8, 8));
      level10.setFlowers(flowerContainer);
      flowerContainer.removeAll(flowerContainer);

      // Add levels to level container.
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

      // to create a save file when the game is first opened
      if (LearnLevelsSave.load() == null || !LearnLevelsSave.load().get(1)) {
         learnLevelsSaveContainer = new LearnLevelsSaveContainer();
         LearnLevelsSave.save(learnLevelsSaveContainer);         
      } 
      // To be able to read the data in the save file
      else {
         learnLevelsSaveContainer = LearnLevelsSave.load();
      }

   }

   /**
    * Moves the codeView pannel accordig to movement of mouse wheel.
    */
   private void addScroll() {
      codeView.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
         public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
            int a = evt.getWheelRotation();

            int x = codeView.getX();
            int y = codeView.getY();
            int h = codeView.getHeight();
            int b = 0;

            if (a > 0) {
               if (y == 800 - h || codeView.getLength() < 800 || (codeView.getLength() - 800 + 10) < -y) {
                  a = 0;
               } 
               else {
                  b -= 50;
                  codeView.setLocation(x, y + b);
               }
            }
            if (a < 0) {
               if (y == 0) {
                  a = 0;
               } 
               else {
                  b += 50;
                  codeView.setLocation(x, y + b);
               }
            }
         }
      });
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
    * Check if bee is moving.
    *
    * @return Return true if bee is moving. Return false if bee is not moving.
    */
   public boolean isBeeMoving() {
      return mapView.isBeeMoving();
   }

   /**
    * Initializes the new game.
    */
   public void initNewGame() {
      lmm.initNewGame();
      mapView.resetMap();
      selectionController.resetSelectionController();
      playButton.setEnabled(true);
      codeView.setLocation(845, 0);
      for (int i = 0; i < lmm.getFlowers().size(); i++) {
         lmm.getFlowers().get(i).setPollenGathered(false);
      }
   }
   
   /**
    * Resets the save file.
    */
   public void resetLearnMode() {
      learnLevelsSaveContainer = new LearnLevelsSaveContainer();
      LearnLevelsSave.save(learnLevelsSaveContainer);      
   }

   /**
    * Get Learn Mode Model
    * @return Learn Mode Model
    */
   public LearnModeModel getModel() {
      return lmm;
   }

   /**
    * Get current level number
    * @return level number
    */
   public int getLevel() {
      return currentLevel.getLevel();
   }

   /**
    * Determines which level will start.
    * @param level Level number.
    */
   public void setCurrentLevel(int level) {
      currentLevel = levelContainer.get(level - 1);
      initNewLevel();
   }

   /**
    * Set Animal object for Learn Mode Model.
    * @param animal Animal object
    */
   public void setAnimal(Animal animal) {
      lmm.setAnimal(animal);
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   private javax.swing.JButton playButton;
   private javax.swing.JButton retryButton;
   private javax.swing.JButton scrollDown;
   private javax.swing.JButton scrollUp;
   // End of variables declaration//GEN-END:variables
}
