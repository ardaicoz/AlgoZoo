/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author gorke
 */
public class TestLevelsSaveContainer implements Serializable {

   // properties
   ArrayList<Boolean> levelAccomplished;

   public TestLevelsSaveContainer() {
      levelAccomplished = new ArrayList<>();
      levelAccomplished.add(Boolean.TRUE);
      for (int i = 0; i < 9; i++) {
         levelAccomplished.add(Boolean.FALSE);
      }
   }
   
    public void setTrue(int levelNumber) {
      levelAccomplished.set(levelNumber, Boolean.TRUE);
   }

   public void setFalse(int levelNumber) {
      levelAccomplished.set(levelNumber, Boolean.FALSE);
   }

   public int size() {
      return levelAccomplished.size();
   }

   public boolean get(int i) {
      return levelAccomplished.get(i);
   }

}
