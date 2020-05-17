/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * This class focuses on keeping track of the current status of the game
 * @author Esra, Doğa, Alp
 * @version 1.0
 */
public class AlgoZoo {
   //properties
   int                  startX;
   int                  startY;
   int                  currentX;
   int                  currentY;
   int                  finishX;
   int                  finishY;
   Animal               animal;
   ArrayList<Character> movementPattern;

   //constructors
   public AlgoZoo(int startX, int startY, int finishX, int finishY) {
       //initialize all properties
      movementPattern = new ArrayList<Character>();
      animal = new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
      this.startX = startX;
      this.startY = startY;
      this.currentX = this.startX;
      this.currentY = this.startY;
      this.finishX = finishX;
      this.finishY = finishY;
   }
   
   //methods
   /**
    * returns the final X location of the animal
    * @return finishX
    */
   public int getFinishX() {
      return finishX;
   }
   
   /**
    * sets the final X location of the animal
    * @param finishX
    */
   public void setFinishX(int finishX) {
      this.finishX = finishX;
   }
   
   /**
    * returns the final Y location of the animal
    * @return finishY
    */
   public int getFinishY() {
      return finishY;
   }
   
   /**
    * sets the final Y location of the animal
    * @param finishY
    */
   public void setFinishY(int finishY) {
      this.finishY = finishY;
   }
   
   /**
    * sets the animal's location 64 pixels up
    */
   public void goUp() {
      if ( currentY != 12) {
         currentY -= 64;
      }
   }
   
   /**
    * sets the animal's location 64 pixels down
    */
   public void goDown() {
      if ( currentY != 588) {
       currentY += 64;
      }
   }
   
   /**
    * sets the animal's location 64 pixels right
    */
   public void goRight() {
      if ( currentX != 584) {
          currentX += 64;
      }
   }
   
   
   /**
    * sets the animal's location 64 pixels left
    */
   public void goLeft() {
       if ( currentX != 8) {
          currentX -= 64;
       }
   }
   
   /**
    * returns the chosen animal character
    * @return animal
    */
   public Animal getAnimal() {
      return animal;
   }
   
   /**
    * sets the character to the chosen animal
    * @param animal
    */
   public void setAnimal(Animal animal) {
      this.animal = animal;
   }
   
   /**
    * returns the movement algorithm
    * @return movementPattern
    */
   public ArrayList<Character> getMovementPattern() {
      return movementPattern;
   }
   
   /**
    * adds the chosen movement to the movementPattern
    * @param c
    */
   public void addMovementPattern(char c) {
      movementPattern.add(c);
   }
   
   /**
    * resets the movement algorithm
    */
   public void resetMovementPattern() {
      movementPattern.removeAll(movementPattern);
   }
   
   /**
    * returns the first X location of the animal
    * @return startX
    */
   public int getStartX() {
      return startX;
   }
   
   /**
    * sets the first X location of the animal
    * @param startX
    */
   public void setStartX(int startX) {
      this.startX = startX;
   }
   
   /**
    * returns the first Y location of the animal
    * @return startY
    */
   public int getStartY() {
      return startY;
   }
   
    /**
    * sets the first Y location of the animal
    * @param startY
    */
   public void setStartY(int startY) {
      this.startY = startY;
   }
   
   /**
    * returns the current X location of the animal
    * @return currentX
    */
   public int getCurrentX() {
      return currentX;
   }
   
   /**
    * sets the first X location of the animal
    * @param currentX
    */
   public void setCurrentX(int currentX) {
      this.currentX = currentX;
   }
   
   /**
    * returns the current Y location of the animal
    * @return currentY
    */
   public int getCurrentY() {
      return currentY;
   }
   
   /**
    * sets the first Y location of the animal
    * @param currentY
    */
   public void setCurrentY(int currentY) {
      this.currentY = currentY;
   }
}
