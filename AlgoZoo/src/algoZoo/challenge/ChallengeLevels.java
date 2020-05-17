/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import javax.swing.ImageIcon;

/**
 * This class is for creating levels for Challenge Mode
 * @author Doğa, Alp, Esra
 * @version 1.0
 */
public class ChallengeLevels {
   // properties
   int       startX;
   int       startY;
   int       finishX;
   int       finishY;
   int       minRequiredMovements;
   int       minRequiredTime;
   int       level;
   ImageIcon mapBackground;

   // constructor    
   public ChallengeLevels(int startX, int startY, int finishX, int finishY, int minRequiredMovements, int minRequiredTime, ImageIcon mapBackground, int level) {
      this.startX = startX;
      this.startY = startY;
      this.finishX = finishX;
      this.finishY = finishY;
      this.minRequiredMovements = minRequiredMovements;
      this.minRequiredTime = minRequiredTime;
      this.mapBackground = mapBackground;
      this.level = level;
   }

   // methods
    /**
     * returns the specific background of level
     * @return mapBackground
     */
    public ImageIcon getMapBackground() {
        return mapBackground;
    }

   /**
    * returns the start X location of the animal in a particular level
    * @return startX
    */
   public int getStartX() {
      return startX;
   }

    /**
    * returns the start Y location of the animal in a particular level
    * @return startY
    */
   public int getStartY() {
      return startY;
   }

   /**
    * returns the final X location of the animal in a particular level
    * @return finishX
    */
   public int getFinishX() {
      return finishX;
   }

   /**
    * returns the final Y location of the animal in a particular level
    * @return finishY 
    */
   public int getFinishY() {
      return finishY;
   }

   /**
    * returns the minimal number of required movements to win a particular level
    * @return  minRequiredMovements 
    */
   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   /**
    * returns the minimal required time to win a particular level
    * @return  minRequiredTime
    */
   public int getMinRequiredTime() {
      return minRequiredTime;
   }

   /**
    * returns the current level
    * @return  level
    */
   public int getLevel() {
      return level;
   }
}
