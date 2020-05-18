/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import algoZoo.game.Animal;
import algoZoo.game.Flower;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Kerem
 */
public class TestLevels {
   // properties
   
   final int TILE_WIDTH = 64;
   final int TILE_HEIGHT = 64;
   final int SPACE_WIDTH = 8;
   final int SPACE_HEIGHT = 12;
   int startX;
   int startY;
   int finishX;
   int finishY;
   int level;
   ImageIcon mapBackground;
   ArrayList<Character> list1;
   ArrayList<Character> list2;
   ArrayList<Character> list3;
   ArrayList<Flower> flowers;

   // constructor    
   public TestLevels(int startX, int startY, int finishX, int finishY, ArrayList<Character> list1, ArrayList<Character> list2, ArrayList<Character> list3, ImageIcon mapBackground, int level) {
      this.startX = (TILE_WIDTH * (startX - 1)) + SPACE_WIDTH;
      this.startY = (TILE_HEIGHT * (startY - 1)) + SPACE_HEIGHT;
      this.finishX = (TILE_WIDTH * (finishX - 1)) + SPACE_WIDTH;
      this.finishY = (TILE_HEIGHT * (finishY - 1)) + SPACE_HEIGHT;
      this.mapBackground = mapBackground;
      this.list1 = list1;
      this.list2 = list2;
      this.list3 = list3;
      this.level = level;
      flowers = new ArrayList<>();

   }

   // methods
   /**
    * Get method for map background.
    *
    * @return map as ImageIcon
    */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   /**
    * Get method for animal's starting x-coordinate.
    *
    * @return x-coordinate as integer
    */
   public int getStartX() {
      return startX;
   }

   /**
    * Get method for animal's starting y-coordinate.
    *
    * @return y-coordinate as integer
    */
   public int getStartY() {
      return startY;
   }

   /**
    * Get method for the x-coordinate of animal's destination.
    *
    * @return x-coordinate as integer
    */
   public int getFinishX() {
      return finishX;
   }

   /**
    * Get method for the y-coordinate of animal's destination.
    *
    * @return y-coordinate as integer
    */
   public int getFinishY() {
      return finishY;
   }

   /**
    * Get method to get all elements of the option A.
    *
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList1() {
      return list1;
   }

   /**
    * Get method to get all elements of the option B.
    *
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList2() {
      return list2;
   }

   /**
    * Get method to get all elements of the option C.
    *
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList3() {
      return list3;
   }

   public int getLevel() {
      return level;
   }

   public ArrayList<Flower> getFlowers() {
      return flowers;
   }

   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>) flowers.clone();
   }
}
