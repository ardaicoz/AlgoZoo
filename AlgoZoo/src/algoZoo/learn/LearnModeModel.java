/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;
import algoZoo.game.*;
import java.util.ArrayList;

/**
 *
 * @author dogaersoy, esragenç
 */
public class LearnModeModel extends AlgoZooModel {
    // properties
    int noOfMovements;
    int startX;
    int startY;
    int currentX;
    int currentY;
    
    // constructors
    public LearnModeModel() {
        super();
        noOfMovements = 0; 
        startX = 0;
        startY = 0;
        currentX = 0;
        currentY = 0;
        
    }
    
    // methods
    public int getNoOfMovements() {
        return noOfMovements;
    }
    
    public void setNoOfMovements( int noOfMovements) {
        this.noOfMovements = noOfMovements;
    }
    
    public void increaseNoOfMovements() {
        noOfMovements++;
    }
    
    @Override
    public void initNewGame() {
        resetMovementPattern();
        noOfMovements = 0;
        currentX = startX;
        currentY = startY;
    }
}
