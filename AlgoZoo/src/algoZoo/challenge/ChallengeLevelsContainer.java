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
public class ChallengeLevelsContainer implements Serializable{
   // properties
   ArrayList<ChallengeLevels> levelContainer;
   
   public ChallengeLevelsContainer(){
      levelContainer = new ArrayList<>();
   }

   public void add(ChallengeLevels level){
      levelContainer.add(level);
   }
   public ArrayList<ChallengeLevels> getLevelContainer() {
      return levelContainer;
   }
   public ChallengeLevels get(int number){
      return levelContainer.get(number);
   }
   
}
