/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;
import algoZoo.learn.*;
/**
 *
 * @author dogaersoy, esragenç
 */
public class ChallengeModeModel extends LearnModeModel {
    // properties
    int minRequiredMovements;
    int efficiency;
    int minRequiredTime;
    // Timer??
    
    // constructors
    public ChallengeModeModel() {
        super();
        minRequiredMovements = 0;
        efficiency = 0;
        minRequiredTime = 0;
}
    // methods
    public int getMinRequiredMovements() {
        return minRequiredMovements;
    }
    
    public void setMinRequiredMovements( int minRequiredTime) {
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
    
    public void computeEfficiency() {
        if ( !hasWon()) {
            efficiency = 0;
        }
        else {
            efficiency = 1;
            // if ( TimerView.getUsedTime() < minRequiredTime) {
                  // efficiency++; }
            // if ( noOfMovements == minRequiredMovements) {
                 // efficiency++; }
        }
    }
    
    @Override
    public void initNewGame() {
        super.initNewGame();
        efficiency = 0;
        // reset timer
        
    }
            
    
}
