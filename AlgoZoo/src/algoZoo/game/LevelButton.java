package algoZoo.game;

import javax.swing.JButton;

/**
 * This class extends JButton class and adds a levelNo property to create level-specific buttons 
 * @author Alp
 * @version 1.0
 */
public class LevelButton extends JButton {

   // properties
   private int levelNo;

   // constructor
   /**
    * Creates an instance of LevelButton.
    * @param levelNo Specific levelNo for each level.
    */
   public LevelButton(int levelNo) {
      this.levelNo = levelNo;
   }

   /**
    * returns levelNo
    * @return levelNo
    */
   public int getLevelNo() {
      return levelNo;
   }
}
