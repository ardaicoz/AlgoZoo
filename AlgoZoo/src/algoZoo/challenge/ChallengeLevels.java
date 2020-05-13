/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import algoZoo.game.Animal;
import javax.swing.ImageIcon;

/**
 *
 * @author dogaersoy
 */
public class ChallengeLevels {
    // properties
   Animal animal;
   int startX;
   int startY;
   int finishX;
   int finishY;
   int minRequiredMovements;
   int minRequiredTime;
   ImageIcon mapBackground;
   int level;

   // constructor    
   public ChallengeLevels(Animal animal, int startX, int startY, int finishX, int finishY, int minRequiredMovements, int minRequiredTime, ImageIcon mapBackground, int level) {
      this.animal = animal;
      this.startX = startX;
      this.startY = startY;
      this.finishX = finishX;
      this.finishY = finishY;
      this.minRequiredMovements = minRequiredMovements;
      this.minRequiredTime = minRequiredTime;
      this.mapBackground = mapBackground;
      this.level = level;
   }


   // methods
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   public Animal getAnimal() {
      return animal;
   }

   public int getStartX() {
      return startX;
   }

   public int getStartY() {
      return startY;
   }

   public int getFinishX() {
      return finishX;
   }

   public int getFinishY() {
      return finishY;
   }

    public int getMinRequiredMovements() {
        return minRequiredMovements;
    }

    public int getMinRequiredTime() {
        return minRequiredTime;
    }
    
    public int getLevel() {
        return level;
    }
}
