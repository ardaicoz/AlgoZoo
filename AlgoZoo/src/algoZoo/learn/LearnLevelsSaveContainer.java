/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author gorke
 */
public class LearnLevelsSaveContainer implements Serializable {

   // properties   
   ArrayList<Boolean> levelAccomplished;   

   public LearnLevelsSaveContainer() {
      levelAccomplished = new ArrayList<>();     
      levelAccomplished.add(Boolean.TRUE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
      levelAccomplished.add(Boolean.FALSE);
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
