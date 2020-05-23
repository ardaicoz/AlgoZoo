/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import algoZoo.game.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * This is a model class for challenge mode
 *
 * @author Doğa, Esra, Alp
 * @version 1.0
 */
public class ChallengeModeModel extends AlgoZooModel {

   // properties
   private int     noOfMovements;
   private int     minRequiredMovements;
   private int     efficiency;
   private int     minRequiredTime;
   private int     usedTime;
   private boolean timeIsUp;

   // constructors
   /**
    * Creates a Learn Mode Model in the specified start location, finish location and flower objects.
    * @param startX Start point of the bee with respect to x-axis.
    * @param startY Start point of the bee with respect to y-axis.
    * @param finishX Finish point of the bee with respect to x-axis.
    * @param finishY Finish point of the bee with respect to y-axis.
    * @param minRequiredMovements The number of minimum required movements that a player will be recommended.
    * @param minRequiredTime Amount of time to complete the level.
    * @param flowers The ArrayList containing all flower objects.
    */
   public ChallengeModeModel(int startX, int startY, int finishX, int finishY, int minRequiredMovements, int minRequiredTime, ArrayList<Flower> flowers) {
      super(startX, startY, finishX, finishY, flowers);
      this.minRequiredMovements = minRequiredMovements;
      this.minRequiredTime = minRequiredTime;
      noOfMovements = 0;
      efficiency = 0;
      usedTime = 0;
      timeIsUp = false;
   }

   // methods
   public void addMovementPattern(char c) {
      super.addMovementPattern(c);
      increaseNoOfMovements();
   }

   /**
    * returns the total number of movements made by the user during a level
    *
    * @return noOfMovements
    */
   public int getNoOfMovements() {
      return noOfMovements;
   }

   /**
    * sets the number of movements
    *
    * @param noOfMovements
    */
   public void setNoOfMovements(int noOfMovements) {
      this.noOfMovements = noOfMovements;
   }

   /**
    * increase the number of movements
    */
   public void increaseNoOfMovements() {
      noOfMovements++;
   }

   /**
    * returns the minimum number of movements
    *
    * @return minRequiredMovements
    */
   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   /**
    * sets the minimum number of movements
    *
    * @param minRequiredMovements
    */
   public void setMinRequiredMovements(int minRequiredMovements) {
      this.minRequiredMovements = minRequiredMovements;
   }

   /**
    * returns the minimum required time to complete the level
    *
    * @return minRequiredTime
    */
   public int getMinRequiredTime() {
      return minRequiredTime;
   }

   /**
    * sets the minimum required time to complete the level
    *
    * @param minRequiredTime
    */
   public void setMinRequiredTime(int minRequiredTime) {
      this.minRequiredTime = minRequiredTime;
   }

   /**
    * returns the efficiency
    *
    * @return efficiency
    */
   public int getEfficiency() {
      return efficiency;
   }

   /**
    * sets the used time
    *
    * @param usedTime
    */
   public void setUsedTime(int usedTime) {
      this.usedTime = usedTime;
   }
   
   /**
    * returns timeIsUp condition
    * @return timeIsUp
    */
   public boolean isTimeIsUp() {
        return timeIsUp;
    }

   /**
    * sets timeIsUp condition
    * @param timeIsUp 
    */
   public void setTimeIsUp(boolean timeIsUp) {
       this.timeIsUp = timeIsUp;
   }

   /**
    * increases the used time
    */
   public void increaseUsedTime() {
      usedTime++;
   }

   /**
    * computes the efficiency according to used time and number of movements
    * made
    */
   public void computeEfficiency() {
      if (!hasWon()) {
         efficiency = 0;
      } else {
         efficiency = 1;
         if (usedTime < minRequiredTime / 2) {
            efficiency++;
            System.out.println("Number of movement" + noOfMovements);
         }
         if (noOfMovements == minRequiredMovements) {

            efficiency++;
         }
      }
   }

   /**
    * overrides the initNewGame() method and resets the challenge model's
    * properties
    */
   @Override
   public void initNewGame() {
      resetMovementPattern();
      //set anlimal
      if ( getAnimal().getName().equals("Bee")){
         getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));         
      }
      else if ( getAnimal().getName().equals("Bee2")){
         getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));               
      }
      else if ( getAnimal().getName().equals("Bee3")){
         getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));               
      }
      else if ( getAnimal().getName().equals("Bee4")){
         getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));               
      }
      
      //initialize new game by resetting properties
      setCurrentX(getStartX());
      setCurrentY(getStartY());
      setGameOver(false);
      setHasWon(false);
      noOfMovements = 0;
      usedTime = 0;
      efficiency = 0;
      timeIsUp = false;
      update();
   }

   /**
    * overrides the play() method and computes efficiency if the user wins the
    * game
    */
   @Override
   public void play() {
      super.play();
      if (hasWon()) {
         computeEfficiency();
      }
   } 
}
