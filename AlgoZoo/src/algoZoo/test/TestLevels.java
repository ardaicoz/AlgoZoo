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
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   public Animal getAnimal() {
      return animal;
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
   public ArrayList<Character> getList1(){
       return list1;
   }
   public ArrayList<Character> getList2(){
       return list2;
   }
   public ArrayList<Character> getList3(){
       return list3;
   }
}
