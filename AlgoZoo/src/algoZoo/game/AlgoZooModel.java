/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esra, Doğa
 */
public abstract class AlgoZooModel extends AlgoZoo{
    //properties
    ArrayList<IAlgoZooView> views;
    
    //constructors
    public AlgoZooModel() {
        super();
        views = new ArrayList<IAlgoZooView>();
    }
            
    //methods
    public boolean goUp() {
        super.goUp();
        update();
        return true;
    }
    
    public boolean goDown() {
        super.goDown();
        update();
        return true;
    }
    
    public boolean goRight() {
        super.goRight();
        update();
        return true;
    }
    
    public boolean goLeft() {
        super.goLeft();
        update();
        return true;
    }
    
    public abstract void initNewGame();
    
    public void update() {
        if(!views.isEmpty()) {
            Iterator i = this.views.iterator();
            while(i.hasNext()) {
            IAlgoZooView view = (IAlgoZooView)i.next();
            view.updateView(this);
            }
        }
    }
    
    public void addView(IAlgoZooView view) {
        this.views.add(view);
        view.updateView(this);
    }
    
}
