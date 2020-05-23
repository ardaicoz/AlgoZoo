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
 * It creates level objects for the test mode
 * @author Kerem, Arda
 * @version 1.0
 */
public class TestLevels {
   // properties
   
   private final int            TILE_WIDTH = 64;
   private final int            TILE_HEIGHT = 64;
   private final int            SPACE_WIDTH = 8;
   private final int            SPACE_HEIGHT = 12;
   private int                  startX;
   private int                  startY;
   private int                  finishX;
   private int                  finishY;
   private int                  level;
   private ImageIcon            mapBackground;
   private ArrayList<Character> list1;
   private ArrayList<Character> list2;
   private ArrayList<Character> list3;
   private ArrayList<Flower>    flowers;

   // constructor    
   /**
    * Creates a level in the specified start location, finish location, minimum required of movements, mapBackground and level.
    * @param startX Start point of the bee with respect to x-axis.
    * @param startY Start point of the bee with respect to y-axis.
    * @param finishX Finish point of the bee with respect to x-axis.
    * @param finishY Finish point of the bee with respect to y-axis.
    * @param ArrayList<Character> list1  ArrayList of chars to replace the algorithm for the first option.
    * @param ArrayList<Character> list2  ArrayList of chars to replace the algorithm for the second option.
    * @param ArrayList<Character> list3  ArrayList of chars to replace the algorithm for the third option.
    * @param mapBackground The background of the map whose format is png.
    * @param level Level number.
    */
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
    * @return map as ImageIcon
    */
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   /**
    * Get method for animal's starting x-coordinate.
    * @return x-coordinate as integer
    */
   public int getStartX() {
      return startX;
   }

   /**
    * Get method for animal's starting y-coordinate.
    * @return y-coordinate as integer
    */
   public int getStartY() {
      return startY;
   }

   /**
    * Get method for the x-coordinate of animal's destination.
    * @return x-coordinate as integer
    */
   public int getFinishX() {
      return finishX;
   }

   /**
    * Get method for the y-coordinate of animal's destination.
    * @return y-coordinate as integer
    */
   public int getFinishY() {
      return finishY;
   }

   /**
    * Get method to get all elements of the option A.
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList1() {
      return list1;
   }

   /**
    * Get method to get all elements of the option B.
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList2() {
      return list2;
   }

   /**
    * Get method to get all elements of the option C.
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList3() {
      return list3;
   }
   
    /**
    * Get method for the level number
    * @return the level number
    */
   public int getLevel() {
      return level;
   }
   
    /**
    * Get method for the flowers in the level
    * @return ArrayList of all flowers in the level
    */
   public ArrayList<Flower> getFlowers() {
      return flowers;
   }
 
   /**
    * Set method for the flowers in the level
    * @param flowers to be set as flowers of the level
    */
   public void setFlowers(ArrayList<Flower> flowers) {
      this.flowers = (ArrayList<Flower>) flowers.clone();
   }
}
