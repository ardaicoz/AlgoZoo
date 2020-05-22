package algoZoo.learn;

import algoZoo.game.*;
import java.util.ArrayList;

/**
 * This is a model class for Learn Mode.
 * @author Doğa, Esra, Ayberk, Görkem
 * @version 1.0
 */
public class LearnModeModel extends AlgoZooModel {
   // properties
   int noOfMovements;
   int minRequiredMovements;

   // constructor
   /**
    * Creates a Learn Mode Model in the specified start location, finish location and flower objects.
    * @param startX Start point of the bee with respect to x-axis.
    * @param startY Start point of the bee with respect to y-axis.
    * @param finishX Finish point of the bee with respect to x-axis.
    * @param finishY Finish point of the bee with respect to y-axis.
    * @param minRequiredMovements The number of minimum required movements that a player will be recommended.
    * @param flowers The ArrayList containing all flower objects.
    */
   public LearnModeModel(int startX, int startY, int finishX, int finishY, int minRequiredMovements, ArrayList<Flower> flowers) {
      super(startX, startY, finishX, finishY, flowers);
      noOfMovements = 0;
      this.minRequiredMovements = minRequiredMovements;      
   }

   // methods
   /**
    * Overrides the addMovementPattern( char c) method and increases the number of movements.
    * @param c 
    */
   @Override
   public void addMovementPattern(char c) {
      super.addMovementPattern(c);
      increaseNoOfMovements();
   }

   /**
    * Gets the number of movements a player has made in a level.
    * @return The number of movements a player has made in a level.
    */
   public int getNoOfMovements() {
      return noOfMovements;
   }

   /**
    * Sets the number of movements a player has made in a level.
    * @param noOfMovements The number of movements a player has made in a level.
    */
   public void setNoOfMovements(int noOfMovements) {
      this.noOfMovements = noOfMovements;
   }

   /**
    * Gets the number of minimum required movements that a player is recommended.
    * @return The number of minimum required movement.
    */
   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   /**
    * Sets the number of minimum required movements that a player will be recommended.
    * @param minRequiredMovements The number of minimum required movements.
    */
   public void setMinRequiredMovements(int minRequiredMovements) {
      this.minRequiredMovements = minRequiredMovements;
   }
   
   /**
    * Increases the number of movements in every movement made.
    */
   public void increaseNoOfMovements() {
      noOfMovements++;
   }

   /**
    * Initializes the new Learn Mode game.
    */
   @Override
   public void initNewGame() {
      super.initNewGame();
      noOfMovements = 0;
   }
}
