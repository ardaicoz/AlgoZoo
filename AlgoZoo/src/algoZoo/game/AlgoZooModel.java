/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esra, Doğa
 */
public class AlgoZooModel extends AlgoZoo {
   //properties

   ArrayList<IAlgoZooView> views;
   boolean gameOver;
   boolean hasWon;

   //constructors
   public AlgoZooModel(Animal animal, int startX, int startY, int finishX, int finishY) {
      super(animal, startX, startY, finishX, finishY);
      views = new ArrayList<IAlgoZooView>();
      gameOver = false;
      hasWon = false;
   }

   //methods
   @Override
   public void goUp() {
      super.goUp();
      update();

   }

   @Override
   public void goDown() {
      super.goDown();
      update();

   }

   @Override
   public void goRight() {
      super.goRight();
      update();

   }

   @Override
   public void goLeft() {
      super.goLeft();
      update();

   }

   @Override
   public void addMovementPattern(char c) {
      super.addMovementPattern(c);
      views.get(1).updateView(this); // update only codeView because mapView shouldn't be updated before pressing play button
   }

   @Override
   public void resetMovementPattern() {
      super.resetMovementPattern();
   }

   public void initNewGame() {
      resetMovementPattern();
      currentX = startX;
      currentY = startY;
      update();
   }

   public void update() {
      if (!views.isEmpty()) {
         Iterator i = this.views.iterator();
         while (i.hasNext()) {
            IAlgoZooView view = (IAlgoZooView) i.next();
            view.updateView(this);
         }
      }
   }

   public void addView(IAlgoZooView view) {
      this.views.add(view);
      //view.updateView(this);
   }

   public void play() {
      /*
      Iterator itr = movementPattern.iterator();

      while (itr.hasNext()) {
         if ((char)itr.next() == 'w') {
            goUp();
         }
         else if ((char)itr.next() == 'a') {
            goLeft();
         }
         else if ((char)itr.next() == 's') {
            goDown();
         }
         else if ((char)itr.next() == 'd') {
            goRight();
         }
      }
      */
      for ( int i = 0; i < movementPattern.size(); i++) {
         if ( movementPattern.get(i).equals('w')) { goUp(); }
         else if ( movementPattern.get(i).equals('a')) { goLeft(); }
         else if ( movementPattern.get(i).equals('s')) { goDown(); }
         else if ( movementPattern.get(i).equals('d')) { goRight(); }
      }
      gameOver = true;
      if (getCurrentX() == getFinishX() && getCurrentY() == getFinishY()) {
         hasWon = true;
      }
   }

   public boolean isGameOver() {
      return gameOver;
   }

   public boolean HasWon() {
      return hasWon;
   }

}
