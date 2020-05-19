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
public class LearnLevelsContainer implements Serializable {
   // properties
   ArrayList<LearnLevels> levelContainer;
   
   public LearnLevelsContainer(){
      levelContainer = new ArrayList<>();
   }

   public void add(LearnLevels level){
      levelContainer.add(level);
   }
   public ArrayList<LearnLevels> getLevelContainer() {
      return levelContainer;
   }
   public LearnLevels get(int number){
      return levelContainer.get(number);
   }
   
   
   
    
   
   
}
