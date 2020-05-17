/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.*;

/**
 * This is a model class for learn mode
 * @author Doğa, Esra, Ayberk, Görkem
 * @version 1.0
 */
public class LearnModeModel extends AlgoZooModel {
   // properties
   int noOfMovements;

   // constructors
   public LearnModeModel(int startX, int startY, int finishX, int finishY) {
      super(startX, startY, finishX, finishY);
      noOfMovements = 0;
   }

   // methods
   /**
    * Gets the number of movements a player has made in a level.
    *
    * @return
    */
   public int getNoOfMovements() {
      return noOfMovements;
   }

   /**
    * Sets the number of movements
    *
    * @param noOfMovements
    */
   public void setNoOfMovements(int noOfMovements) {
      this.noOfMovements = noOfMovements;
   }

   /**
    * Increases the number of movements in every movement made.
    */
   public void increaseNoOfMovements() {
      noOfMovements++;
   }

   /**
    * Ititializes the new Learn Mode game.
    */
   @Override
   public void initNewGame() {
      super.initNewGame();
      noOfMovements = 0;
   }
}
