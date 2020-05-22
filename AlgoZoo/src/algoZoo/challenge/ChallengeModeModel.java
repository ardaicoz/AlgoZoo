/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import algoZoo.game.*;
import java.util.ArrayList;

/**
 * This is a model class for challenge mode
 * @author Doğa, Esra, Alp
 * @version 1.0
 */
public class ChallengeModeModel extends AlgoZooModel {
   // properties
   int noOfMovements;
   int minRequiredMovements;
   int efficiency;
   int minRequiredTime;
   int usedTime;

   // constructors
   public ChallengeModeModel(int startX, int startY, int finishX, int finishY, int minRequiredMovements, int minRequiredTime, ArrayList<Flower> flowers) {
      super(startX, startY, finishX, finishY, flowers);
      this.minRequiredMovements = minRequiredMovements;
      this.minRequiredTime = minRequiredTime;
      noOfMovements = 0;
      efficiency = 0;
      usedTime = 0;
   }
   
   // methods
   /**
    * returns the total number of movements made by the user during a level
    * @return noOfMovements
    */
   public int getNoOfMovements() {
      return noOfMovements;
   }
   
   /**
    * sets the number of movements
    * @param noOfMovements
    */
   public void setNoOfMovements(int noOfMovements) {
      this.noOfMovements = noOfMovements;
   }
   
   /**
    * increase the number of movements
    */
   public void increaseNoOfMovements() {
      noOfMovements++;
   }

   /**
    * returns the minimum number of movements 
    * @return minRequiredMovements
    */
   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   /**
    * sets the minimum number of movements
    * @param minRequiredMovements 
    */
   public void setMinRequiredMovements(int minRequiredMovements) {
      this.minRequiredMovements = minRequiredMovements;
   }

   /**
    * returns the minimum required time to complete the level
    * @return minRequiredTime
    */
   public int getMinRequiredTime() {
      return minRequiredTime;
   }

   /**
    * sets the minimum required time to complete the level
    * @param minRequiredTime 
    */
   public void setMinRequiredTime(int minRequiredTime) {
      this.minRequiredTime = minRequiredTime;
   }

   /**
    * returns the efficiency
    * @return efficiency
    */
   public int getEfficiency() {
      return efficiency;
   }

   /**
    * sets the used time
    * @param usedTime 
    */
   public void setUsedTime(int usedTime) {
      this.usedTime = usedTime;
   }

   /**
    * increases the used time
    */
   public void increaseUsedTime() {
      usedTime++;
   }

   /**
    * computes the efficiency according to used time and number of movements made
    */
   public void computeEfficiency() {
      if (!hasWon()) {
         efficiency = 0;
      } 
      else {
         efficiency = 1;
         if (usedTime < minRequiredTime / 2) {
            efficiency++;
         }
         if (noOfMovements == minRequiredMovements) {
            efficiency++;
         }
      }
   }

   /**
    * overrides the initNewGame() method and resets the challenge model's properties
    */
   @Override
   public void initNewGame() {
      super.initNewGame();
      noOfMovements = 0;
      usedTime = 0;
      efficiency = 0;
   }

   /**
    * overrides the play() method and computes efficiency if the user wins the game
    */
   @Override
   public void play() {
      super.play();
      if(hasWon())
          computeEfficiency();
   }
   
   /**
    * overrides the addMovementPattern( char c) method and increases the number of movements
    * @param c 
    */
   @Override
   public void addMovementPattern( char c) {
       super.addMovementPattern(c);
       increaseNoOfMovements();
   }
}
