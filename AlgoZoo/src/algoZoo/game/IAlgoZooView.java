/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

/**
 * Interface for view classes of the game
 * @author Esra, Doğa
 * @version 1.0
 */
public interface IAlgoZooView {
    /**
     * method for updating the view classes by getting information from model classes
     * @param azm 
     */
    void updateView(AlgoZooModel azm);
}
