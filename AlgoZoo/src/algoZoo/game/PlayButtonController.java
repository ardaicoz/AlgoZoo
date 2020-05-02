/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

/**
 *
 * @author A.T.A
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonController extends JButton {
   // properties
   AlgoZooModel azm;
   
   // constructors
   public PlayButtonController( AlgoZooModel azm) {
      this.azm = azm;  
   }
   
   public void actionPerformed( ActionEvent e) {
      azm.play();
   }
   
}