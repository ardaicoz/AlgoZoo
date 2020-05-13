/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import javax.swing.JButton;

/**
 *
 * @author A.T.A
 */
public class LevelButton extends JButton {

   // properties
   int levelNo;

   // constructor
   public LevelButton(int levelNo) {
      this.levelNo = levelNo;
   }

   /**
    *
    * @return
    */
   public int getLevelNo() {
      return levelNo;
   }

}
