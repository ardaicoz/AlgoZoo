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
   ArrayList<LearnLevels> levelContainer = new ArrayList<>();
   
   public LearnLevelsContainer(ArrayList<LearnLevels> levelContainer){
      this.levelContainer = levelContainer;   
   }

   public ArrayList<LearnLevels> getLevelContainer() {
      return levelContainer;
   }
   
   
   
    
   
   
}
