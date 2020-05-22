/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author gorke
 */
public class ChallengeLevelsSaveContainer implements Serializable{
   // properties
   ArrayList<Boolean> levelAccomplished;
   
   public ChallengeLevelsSaveContainer() {
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
      levelAccomplished.set(levelNumber - 1, Boolean.TRUE);      
   }
   
   public void setFalse(int levelNumber) {
      levelAccomplished.set(levelNumber - 1, Boolean.FALSE);
   }
   
   public int size() {
      return levelAccomplished.size();
   }
   
   public boolean get(int index) {
      return levelAccomplished.get(index);      
   }
   
}
