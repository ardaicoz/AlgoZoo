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
public class ChallengeLevelsSaveContainer implements Serializable {

   // properties
   ArrayList<Boolean> levelAccomplished;
   ArrayList<Integer> levelStars;

   public ChallengeLevelsSaveContainer() {
      levelAccomplished = new ArrayList<>();
      levelStars = new ArrayList<>();
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

   public boolean getLevelAccomplished(int index) {
      return levelAccomplished.get(index);
   }
   
   public void setStars(int levelNumber, int stars){
      levelStars.set(levelNumber - 1, stars);      
   }

}
