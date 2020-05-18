/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

/**
 *
 * @author Görkem, Ayberk
 */
public class Flower {

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
      this.x = (TILE_WIDTH * (x - 1)) + SPACE_WIDTH;
      this.y = (TILE_HEIGHT * (y - 1)) + SPACE_HEIGHT;
      pollenGathered = false;
   }
   
   // methods
   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }
   
   public void setPollenGathered(boolean gathered) {
      pollenGathered = gathered;
   }
   public boolean getPollenGathered(){
      return pollenGathered;
   }

}
