package algoZoo.learn;

import algoZoo.game.Flower;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * It was created to create level objects in Learn Mode.
 * @author Görkem, Ayberk
 * @version 1.0
 */
public class LearnLevels {
   // properties
   final int TILE_WIDTH = 64;
   final int TILE_HEIGHT = 64;
   final int SPACE_WIDTH = 8;
   final int SPACE_HEIGHT = 12;
   int startX;
   int startY;
   int finishX;
   int finishY;
   int minRequiredMovements;
   int level;
   ImageIcon mapBackground;
   ArrayList<Flower> flowers;

   // constructor  
   /**
    * Creates a level in the specified start location, finish location, minimum required of movements, mapBackground and level.
    * @param startX Start point of the bee with respect to x-axis.
    * @param startY Start point of the bee with respect to y-axis.
    * @param finishX Finish point of the bee with respect to x-axis.
    * @param finishY Finish point of the bee with respect to y-axis.
    * @param minRequiredMovements  The number of minimum required movements that a player will be recommended.
    * @param mapBackground The background of the map whose format is png.
    * @param level Level number.
    */
   public LearnLevels(int startX, int startY, int finishX, int finishY, int minRequiredMovements, ImageIcon mapBackground, int level) {
      this.startX = (TILE_WIDTH * (startX - 1)) + SPACE_WIDTH;
      this.startY = (TILE_HEIGHT * (startY - 1)) + SPACE_HEIGHT;
      this.finishX = (TILE_WIDTH * (finishX - 1)) + SPACE_WIDTH;
      this.finishY = (TILE_HEIGHT * (finishY - 1)) + SPACE_HEIGHT;
      this.minRequiredMovements = minRequiredMovements;
      this.mapBackground = mapBackground;
      this.level = level;
      flowers = new ArrayList<>();
   }

   // methods
   /**
    * Gets the start X location of the bee in a particular level
    * @return startX Start point of the bee with respect to x-axis.
    */
   public int getStartX() {
      return startX;
   }

   /**
    * Gets the start Y location of the bee in a particular level
    * @return startY Start point of the bee with respect to y-axis.
    */
   public int getStartY() {
      return startY;
   }

   /**
    * Gets the final X location of the bee in a particular level
    * @return finishX Finish point of the bee with respect to x-axis.
    */
   public int getFinishX() {
      return finishX;
   }

   /**
    * Gets the final Y location of the bee in a particular level
    * @return finishY Finish point of the bee with respect to y-axis.
    */
   public int getFinishY() {
      return finishY;
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
    * @param minRequiredMovements The number of minimum required movement.
    */
   public void setMinRequiredMovements(int minRequiredMovements) {
      this.minRequiredMovements = minRequiredMovements;
   }

   /**
    * Gets the specific background of level whose format is png.
    * @return mapBackground The background of the map whose format is png.
    */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   /**
    * Gets the level number
    * @return level Level number.
    */
   public int getLevel() {
      return level;
   }

   /**
    * Gets the ArrayList that contain Flower objects.
    * @return flowers the ArrayList that contain Flower objects.
    */
   public ArrayList<Flower> getFlowers() {
      return flowers;
   }

   /**
    * Clones the ArrayList that contain Flower objects.
    * @param flowers the ArrayList that contain Flower objects.
    */
   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>) flowers.clone();
   }
}
