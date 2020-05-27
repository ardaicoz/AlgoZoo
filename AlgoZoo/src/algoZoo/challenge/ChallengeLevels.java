package algoZoo.challenge;

import algoZoo.game.Flower;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * This class is for creating levels for Challenge Mode.
 * @author Doğa, Alp, Esra
 * @version 1.0
 */
public class ChallengeLevels {

   // properties
   private final int         TILE_WIDTH = 64;
   private final int         TILE_HEIGHT = 64;
   private final int         SPACE_WIDTH = 8;
   private final int         SPACE_HEIGHT = 12;
   private int               startX;
   private int               startY;
   private int               finishX;
   private int               finishY;
   private int               minRequiredMovements;
   private int               minRequiredTime;
   private int               level;
   private ImageIcon         mapBackground;
   private ArrayList<Flower> flowers;

   // constructor  
   /**
    * Creates a level in the specified start location, finish location, minimum required of movements, mapBackground and level.
    * @param startX Start point of the bee with respect to x-axis.
    * @param startY Start point of the bee with respect to y-axis.
    * @param finishX Finish point of the bee with respect to x-axis.
    * @param finishY Finish point of the bee with respect to y-axis.
    * @param minRequiredMovements The number of movements the player is recommended to play.
    * @param minRequiredTime Amount of time to complete the level.
    * @param mapBackground The background of the specified map whose format is png.
    * @param level Level number.
    */
   public ChallengeLevels(int startX, int startY, int finishX, int finishY, int minRequiredMovements, int minRequiredTime, ImageIcon mapBackground, int level) {
      this.startX = (TILE_WIDTH * (startX - 1)) + SPACE_WIDTH;
      this.startY = (TILE_HEIGHT * (startY - 1)) + SPACE_HEIGHT;
      this.finishX = (TILE_WIDTH * (finishX - 1)) + SPACE_WIDTH;
      this.finishY = (TILE_HEIGHT * (finishY - 1)) + SPACE_HEIGHT;
      this.minRequiredMovements = minRequiredMovements;
      this.minRequiredTime = minRequiredTime;
      this.mapBackground = mapBackground;
      this.level = level;
      flowers = new ArrayList<>();
   }

   // methods 
   /**
    * Returns the start X location of the animal in a particular level
    * @return startX Start point of the bee with respect to x-axis.
    */
   public int getStartX() {
      return startX;
   }

   /**
    * Returns the start Y location of the animal in a particular level
    * @return startY Start point of the bee with respect to y-axis.
    */
   public int getStartY() {
      return startY;
   }

   /**
    * Returns the final X location of the animal in a particular level
    * @return finishX Finish point of the bee with respect to x-axis.
    */
   public int getFinishX() {
      return finishX;
   }

   /**
    * Returns the final Y location of the animal in a particular level
    * @return finishY Finish point of the bee with respect to y-axis.
    */
   public int getFinishY() {
      return finishY;
   }

   /**
    * Returns the minimal number of required movements to win a particular level
    * @return minRequiredMovements The number of minimum required movement.
    */
   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   /**
    * Returns the minimal required time to win a particular level
    * @return minRequiredTime The number of minimum required movement.
    */
   public int getMinRequiredTime() {
      return minRequiredTime;
   }

   /**
    * Returns the level number
    * @return level Level number.
    */
   public int getLevel() {
      return level;
   }

   /**
    * Returns the specific background of level
    * @return mapBackground The background of the map whose format is png.
    */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   /**
    * Returns the ArrayList that contain Flower objects.
    * @return flowers the ArrayList that contain Flower objects.
    */
   public ArrayList<Flower> getFlowers() {
      return flowers;
   }

   /**
    * Sets the Flower ArrayList
    * @param flowers the ArrayList that contain Flower objects.
    */
   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>) flowers.clone();
   }
}
