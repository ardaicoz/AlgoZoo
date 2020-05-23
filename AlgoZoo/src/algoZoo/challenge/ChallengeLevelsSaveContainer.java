package algoZoo.challenge;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The class holding the save files of challenge mode levels
 * @author Görkem
 * @version 1.0
 */
public class ChallengeLevelsSaveContainer implements Serializable {

   // properties
   ArrayList<Boolean> levelAccomplished;
   ArrayList<Integer> levelStars;

   // constructor
   /**
    * Creates the ArrayList containing the boolean values of the
    * ChallengeModeLevels
    */
   public ChallengeLevelsSaveContainer() {
      levelAccomplished = new ArrayList<>();
      levelAccomplished.add(Boolean.TRUE);
      for (int i = 0; i < 9; i++) {
         levelAccomplished.add(Boolean.FALSE);
      }
      
      levelStars = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
         levelStars.add(-1);
      }
   }

   /**
    * Sets true the specific level's boolean value based on the level number.
    *
    * @param levelNumber
    */
   public void setTrue(int levelNumber) {
      levelAccomplished.set(levelNumber, Boolean.TRUE);
   }

   /**
    * Sets false the specific level's boolean value based on the level number.
    *
    * @param levelNumber
    */
   public void setFalse(int levelNumber) {
      levelAccomplished.set(levelNumber, Boolean.FALSE);
   }

   /**
    * Returns the size of the ArrayList
    *
    * @return Size of the ArrayList
    */
   public int levelAccomplishedSize() {
      return levelAccomplished.size();
   }

   /**
    * Returns the determined elements of the ArrayList based on index number.
    *
    * @param i Index number
    * @return boolean. The elements of the ArrayList.
    */
   public boolean getLevelAccomplished(int index) {
      return levelAccomplished.get(index);
   }
   
   public void setLevelStars(int levelNumber, int stars) {
      levelStars.set(levelNumber - 1, stars);
   }
   
   public int levelStarsSize() {
      return levelStars.size();
   }
   
   public int getLevelStars(int index) {
      return levelStars.get(index);
   }
}
