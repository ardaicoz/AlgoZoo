/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;

/**
 * This class is for basic functional structure of the game
 * @author Esra, Doğa, Alp, Ayberk, Görkem
 * @version 1.0
 */
public class AlgoZooModel extends AlgoZoo {
   //properties
   boolean                        gameOver;
   boolean                        hasWon;
   public ArrayList<IAlgoZooView> views;
   

   //constructors
   public AlgoZooModel(int startX, int startY, int finishX, int finishY, ArrayList<Flower> flowers) {
      super(startX, startY, finishX, finishY, flowers);
      //initialize all properties
      views = new ArrayList<IAlgoZooView>();
      gameOver = false;
      hasWon = false;
   }

   //methods
   /**
    * overrides AlgoZoo's goUp() method and updates the views
    */
   @Override
   public void goUp() {
      super.goUp();
      update();

   }

   /**
    * overrides AlgoZoo's goDown() method and updates the views
    */
   @Override
   public void goDown() {
      super.goDown();
      update();

   }

   /**
    * overrides AlgoZoo's goRight() method and updates the views
    */
   @Override
   public void goRight() {
      super.goRight();      
      update();

   }

   /**
    * overrides AlgoZoo's goLeft() method and updates the views
    */
   @Override
   public void goLeft() {
      super.goLeft();      
      update();

   }

   /**
    * overrides AlgoZoo's addMovementPattern(char c) method and updates the views
    */
   @Override
   public void addMovementPattern(char c) {
      super.addMovementPattern(c);
      views.get(1).updateView(this); // update only codeView because mapView shouldn't be updated before pressing play button
   }

   /**
    * overrides AlgoZoo's resetMovementPattern() method and updates the views
    */
   @Override
   public void resetMovementPattern() {
      super.resetMovementPattern();
   }

   /**
    * initialize a new game by resetting the movementPattern, setting current X and Y locations to the starting location etc. and updates the views accordingly
    */
   public void initNewGame() {
      resetMovementPattern();
      if ( animal.getName().equals("Bee")){
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));         
      }
      else if ( animal.getName().equals("Bee2")){
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));               
      }
      else if ( animal.getName().equals("Bee3")){
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));               
      }
      else if ( animal.getName().equals("Bee4")){
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));               
      }
      
      currentX = startX;
      currentY = startY;
      gameOver = false;
      hasWon = false;
      update();
   }

   /**
    * updates the views
    */
   public void update() {
      if (!views.isEmpty()) {
         Iterator i = this.views.iterator();
         while (i.hasNext()) {
            IAlgoZooView view = (IAlgoZooView) i.next();
            view.updateView(this);
         }
      }
   }

   /**
    * adds necessary views to the game
    * @param view 
    */
   public void addView(IAlgoZooView view) {
      this.views.add(view);
      //view.updateView(this);
   }
   
   /**
    * moves the animal according to the movement algorithm
    */
   public void play() {
      for ( int i = 0; i < movementPattern.size(); i++) {
         if ( movementPattern.get(i).equals('w')) { goUp(); }
         else if ( movementPattern.get(i).equals('a')) { goLeft(); }
         else if ( movementPattern.get(i).equals('s')) { goDown(); }
         else if ( movementPattern.get(i).equals('d')) { goRight(); }
         else if ( movementPattern.get(i).equals('f')) {
            for( int j = 0; j < flowers.size(); j++) {
               if( flowers.get(j).getX() == this.getCurrentX() && flowers.get(j).getY() == this.getCurrentY()) {
                  flowers.get(j).setPollenGathered(true);                 
               }               
            }
         }
      }
      gameOver = true;
      if (getCurrentX() == getFinishX() && getCurrentY() == getFinishY() && allPollensGathered()) {
        //System.out.println("HasWon");         
         hasWon = true;
      }
   }

   public boolean allPollensGathered() {
      boolean allGathered = true;      
      for( int i = 0; i < flowers.size(); i++) {        
         if( flowers.get(i).getPollenGathered() == false) {
            allGathered = false;
         }             
      }      
      return allGathered;                                       
   }
   
   /**
    * checks if the game is over
    * @return true if the game is over, otherwise false
    */
   public boolean isGameOver() {
      return gameOver;
   }

   /**
    * sets the winning status
    * @param gameOver 
    */
   public void setGameOver(boolean gameOver) {
       this.gameOver = gameOver;
   }

   /**
    * checks if the user has won the game
    * @return true if the user has won the game, otherwise false
    */
   public boolean hasWon() {
      return hasWon;
   }
}
