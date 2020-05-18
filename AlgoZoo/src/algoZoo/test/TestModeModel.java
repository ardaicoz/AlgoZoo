/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import algoZoo.game.*;
import java.util.ArrayList;

/**
 *
 * @author Doğa ,Esra, Kerem
 */
public class TestModeModel extends AlgoZooModel{
    //properties
    
    //constructors
    public TestModeModel(int startX, int startY, int finishX, int finishY, ArrayList<Flower> flowers) {
       super(startX, startY, finishX, finishY, flowers);
    }
    
    //methods
    /**
     * A method to initialise current level.
     */
    @Override
    public void initNewGame() {
      super.initNewGame();
    }
    
    /**
     * A method add animal's movement pattern to an ArrayList.
     * @param c is the single pattern of movement
     */
    @Override
   public void addMovementPattern(char c) {
      
      getMovementPattern().add(c);
   }
    
}
