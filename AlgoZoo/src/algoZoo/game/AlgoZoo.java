/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
/**
 *
 * @author Esra, Doğa
 */
public class AlgoZoo {
    //properties
    Animal animal;
    ArrayList<Character> movementPattern;
    int startX;
    int startY;
    int currentX;
    int currentY;

    //constructors
    public AlgoZoo() {
        movementPattern = new ArrayList<Character>();
        animal = null;
        startX = 0;
        startY = 0;
        currentX = startX;
        currentY = startY;
    }
         
    //methods
    public boolean goUp() {
        return true;
    }
    
    public boolean goDown() {
        return true;
    }
    
    public boolean goRight() {
        return true;
    }
    
    public boolean goLeft() {
        return true;
    }
    
    public Animal getAnimal() {
        return animal;
    }
    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public ArrayList<Character> getMovementPattern() {
        return movementPattern;
    }
    
    public void addMovementPattern(char c) {
        movementPattern.add(c);     
    }
    
    public void resetMovementPattern() {
        movementPattern = new ArrayList<Character>();
    }
     
    public boolean isGameOver() {
        return true;
    }
    
    public boolean hasWon() {
        return true;
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
    
}