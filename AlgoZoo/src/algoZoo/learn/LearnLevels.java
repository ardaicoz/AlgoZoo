/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.Flower;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * It was created to create level objects in learn mode.
 *
 * @author Görkem, Ayberk
 * @version 1.0
 */
public class LearnLevels implements Serializable{

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
   boolean accomplished;

   // constructor  
   public LearnLevels(int startX, int startY, int finishX, int finishY, int minRequiredMovements, ImageIcon mapBackground, int level, boolean accomplished) {
      this.startX = (TILE_WIDTH * (startX - 1)) + SPACE_WIDTH;
      this.startY = (TILE_HEIGHT * (startY - 1)) + SPACE_HEIGHT;
      this.finishX = (TILE_WIDTH * (finishX - 1)) + SPACE_WIDTH;
      this.finishY = (TILE_HEIGHT * (finishY - 1)) + SPACE_HEIGHT;
      this.minRequiredMovements = minRequiredMovements;
      this.mapBackground = mapBackground;
      this.level = level;
      this.accomplished = accomplished;
      flowers = new ArrayList<>();
   }

   // methods
   /**
    * returns the start X location of the animal in a particular level
    *
    * @return startX
    */
   public int getStartX() {
      return startX;
   }

   /**
    * returns the start Y location of the animal in a particular level
    *
    * @return startY
    */
   public int getStartY() {
      return startY;
   }

   /**
    * returns the final X location of the animal in a particular level
    *
    * @return finishX
    */
   public int getFinishX() {
      return finishX;
   }

   /**
    * returns the final Y location of the animal in a particular level
    *
    * @return finishY
    */
   public int getFinishY() {
      return finishY;
   }

   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   public void setMinRequiredMovements(int minRequiredMovements) {
      this.minRequiredMovements = minRequiredMovements;
   }

   /**
    * returns the specific background of level
    *
    * @return mapBackground
    */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   /**
    * returns the level number
    *
    * @return level
    */
   public int getLevel() {
      return level;
   }

   public void setAccomplished(boolean accomplished) {
      this.accomplished = accomplished;
   }

   public boolean isAccomplished() {
      return accomplished;
   }   
   

   /**
    * returns the ArrayList that contain Flower objects.
    * @return flowers
    */
   public ArrayList<Flower> getFlowers() {
      return flowers;
   }

   /**
    * 
    * @param flowers 
    */
   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>) flowers.clone();
   }

}
