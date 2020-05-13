/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import algoZoo.game.Animal;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Kerem
 */
public class TestLevels {
    // properties
   Animal animal;
   int startX;
   int startY;
   int finishX;
   int finishY;
   ImageIcon mapBackground;
   ArrayList<Character> list1;
   ArrayList<Character> list2;
   ArrayList<Character> list3;

   // constructor    
   public TestLevels(Animal animal, int startX, int startY, int finishX, int finishY, ArrayList<Character> list1, ArrayList<Character> list2, ArrayList<Character> list3, ImageIcon mapBackground) {
      this.animal = animal;
      this.startX = startX;
      this.startY = startY;
      this.finishX = finishX;
      this.finishY = finishY;
      this.mapBackground = mapBackground;
      this.list1 = list1;
      this.list2 = list2;
      this.list3 = list3;
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
    * Get method for animal.
    * @return Animal class
    */
   public Animal getAnimal() {
      return animal;
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
   public ArrayList<Character> getList1(){
       return list1;
   }
   
   /**
    * Get method to get all elements of the option B.
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList2(){
       return list2;
   }
   
   /**
    * Get method to get all elements of the option C.
    * @return all elements inside a ArrayList
    */
   public ArrayList<Character> getList3(){
       return list3;
   }
}
