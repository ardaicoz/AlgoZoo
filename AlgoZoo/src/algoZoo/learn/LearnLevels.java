/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.Animal;
import algoZoo.game.Flower;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * It was created to create level objects in learn mode.
 *
 * @author Görkem, Ayberk
 * @version 1.0
 */
public class LearnLevels {

   // properties
   final int TILE_WIDTH = 64;
   final int TILE_HEIGHT = 64;
   final int SPACE_WIDTH= 8;
   final int SPACE_HEIGHT = 12;
   int startX;
   int startY;
   int finishX;
   int finishY;  
   int level;
   ImageIcon mapBackground;  
   ArrayList<Flower> flowers;

   // constructor    
   public LearnLevels(int startX, int startY, int finishX, int finishY, ImageIcon mapBackground, int level) {
      this.startX = (TILE_WIDTH * (startX - 1)) + SPACE_WIDTH;
      this.startY = (TILE_HEIGHT * (startY - 1)) + SPACE_HEIGHT;
      this.finishX = (TILE_WIDTH * (finishX - 1)) + SPACE_WIDTH;
      this.finishY = (TILE_HEIGHT * (finishY - 1)) + SPACE_HEIGHT;
      this.mapBackground = mapBackground;  
      this.level = level;
      flowers = new ArrayList<>();
   }

   

   // methods
   /*
   
   */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   public int getStartX() {
      return startX;
   }

   public int getStartY() {
      return startY;
   }

   public int getFinishX() {
      return finishX;
   }

   public int getFinishY() {
      return finishY;
   }
   
   public int getLevel() {
      return level;
   }  
   
   public ArrayList<Flower> getFlowers() {
      return flowers;
   } 

   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>)flowers.clone();
   }
   
   
}
