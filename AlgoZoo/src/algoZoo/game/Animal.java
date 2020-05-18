/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import javax.swing.ImageIcon;

/**
 *
 * @author Esra, Doğa, Kerem, Arda, Görkem
 */
public class Animal {
   //properties
   private String name;
   private ImageIcon icon;
   
   //constructors
   public Animal(String name, ImageIcon icon) {
      this.name = name;
      this.icon = icon;
   }

   //methods 
   /**
    * 
    * @return 
    */
   public String getName() {
      return name;
   }
   /**
    * 
    * @return 
    */
   public ImageIcon getIcon() {
      return icon;
   }
   
   public void setIcon(ImageIcon icon){
      this.icon = icon;      
   }
}
