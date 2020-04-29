/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;
import algoZoo.game.*;
/**
 *
 * @author dogaersoy, esragenç
 */
public class ChallengeModeModel extends AlgoZooModel {
    // properties
    int noOfMovements;
    int minRequiredMovements;
    int efficiency;
    int minRequiredTime;
    int usedTime;
    int startX;
    int startY;
    int currentX;
    int currentY;
    
    
    // constructors
    public ChallengeModeModel() {
        super();
        noOfMovements = 0;
        minRequiredMovements = 0;
        efficiency = 0;
        minRequiredTime = 0;
        usedTime = 0;
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
    
    public int getMinRequiredMovements() {
        return minRequiredMovements;
    }
    
    public void setMinRequiredMovements( int minRequiredMovements) {
        this.minRequiredMovements = minRequiredMovements;
    }
    
    public int getMinRequiredTime() {
        return minRequiredTime;
    }
    
    public void setMinRequiredTime( int minRequiredTime) {
        this.minRequiredTime = minRequiredTime;
    }
    
    public int getEfficiency() {
        return efficiency;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }
    
    public void increaseUsedTime() {
        usedTime++;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }
    
    
    
    public void computeEfficiency() {
        if ( !hasWon()) {
            efficiency = 0;
        }
        else {
            efficiency = 1;
            if ( usedTime < minRequiredTime / 2) {
                efficiency++; }
            if ( noOfMovements == minRequiredMovements) {
                 efficiency++; }
        }
    }
    
    @Override
    public void initNewGame() {
        resetMovementPattern();
        noOfMovements = 0;
        usedTime = 0;
        efficiency = 0;
        currentX = startX;
        currentY = startY;
        
        
    }
            
    
}
