/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.io.Serializable;

/**
 * Flower class to represent flowers with a boolean pollenGathered property
 * @author Görkem, Ayberk
 * @version 1.0
 */
public class Flower implements Serializable{

   // properties
   final int TILE_WIDTH = 64;
   final int TILE_HEIGHT = 64;
   final int SPACE_WIDTH= 8;
   final int SPACE_HEIGHT = 12;
   private int x;
   private int y;
   private boolean pollenGathered;

   // constructor
   public Flower(int x, int y) {
      //set location units
      this.x = (TILE_WIDTH * (x - 1)) + SPACE_WIDTH;
      this.y = (TILE_HEIGHT * (y - 1)) + SPACE_HEIGHT;
      //set pollenGathered
      pollenGathered = false;
   }
   
   // methods
   /**
    * Returns x which is the x location of the flower
    * @return x
    */
   public int getX() {
      return x;
   }

   /**
    * Returns y which is the y location of the flower
    * @return y
    */
   public int getY() {
      return y;
   }
   
   /**
    * Sets pollenGathered property
    * @param gathered 
    */
   public void setPollenGathered(boolean gathered) {
      pollenGathered = gathered;
   }
   
   /**
    * Returns pollenGathered property
    * @return 
    */
   public boolean getPollenGathered(){
      return pollenGathered;
   }
}
