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
public abstract class AlgoZooModel extends AlgoZoo {
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
   public boolean goUp() {
      super.goUp();
      update();
      return true;
   }

   @Override
   public boolean goDown() {
      super.goDown();
      update();
      return true;
   }

   @Override
   public boolean goRight() {
      super.goRight();
      update();
      return true;
   }

   @Override
   public boolean goLeft() {
      super.goLeft();
      update();
      return true;
   }

   @Override
   public void addMovementPattern(char c) {
      super.addMovementPattern(c);
      update();
   }

   @Override
   public void resetMovementPattern() {
      super.resetMovementPattern();
      update();
   }

   public void initNewGame() {
      resetMovementPattern();
      currentX = startX;
      currentY = startY;
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
      view.updateView(this);
   }

   public void play() {

      Iterator itr = movementPattern.iterator();

      while (itr.hasNext()) {
         if ((char) itr.next() == 'w') {
            goUp();
         } else if ((char) itr.next() == 'a') {
            goLeft();
         } else if ((char) itr.next() == 's') {
            goDown();
         } else if ((char) itr.next() == 'd') {
            goRight();
         }
      }
      gameOver = true;
      if (getStartX() == getFinishX() && getStartY() == getFinishY()) {
         hasWon = true;
      }
   }

   public boolean isGameOver() {
      return gameOver;
   }

   public boolean isHasWon() {
      return hasWon;
   }

}
