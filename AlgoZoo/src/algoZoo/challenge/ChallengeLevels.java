/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import algoZoo.game.Flower;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * This class is for creating levels for Challenge Mode
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
    * @param minRequiredMovements  The number of minimum required movements that a player will be recommended.
    * @param minRequiredTime Amount of time to complete the level.
    * @param mapBackground The background of the map whose format is png.
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
    * @return minRequiredMovements
    */
   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   /**
    * returns the minimal required time to win a particular level
    * @return minRequiredTime
    */
   public int getMinRequiredTime() {
      return minRequiredTime;
   }

   /**
    * returns the level number
    * @return level
    */
   public int getLevel() {
      return level;
   }

   /**
    * returns the specific background of level
    * @return mapBackground
    */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   /**
    * returns the ArrayList that contain Flower objects.
    * @return flowers
    */
   public ArrayList<Flower> getFlowers() {
      return flowers;
   }

   /**
    * sets the Flower ArrayList
    * @param flowers
    */
   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>) flowers.clone();
   }

}
