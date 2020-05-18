/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;
import javax.swing.ImageIcon;

/**
 * Animal class to represent animal characters in the game with their icon and name.
 * @author Esra, Doğa, Kerem, Arda, Görkem
 * @version 18.05.2020 (final)
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
    * Get method for the name of the animal.
    * @return the name of the animal as String.
    */
   public String getName() {
      return name;
   }
   /**
    * Get method for the icon(image) of the animal.
    * @return the icon as ImageIcon variable
    */
   public ImageIcon getIcon() {
      return icon;
   }
   
   /**
    * Method to set an icon(image) for the animal.
    * @param icon is the image that is going to be set 
    */
   public void setIcon(ImageIcon icon){
      this.icon = icon;      
   }
}
