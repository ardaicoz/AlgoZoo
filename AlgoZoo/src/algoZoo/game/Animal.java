/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author Esra, Doğa, Kerem, Arda
 */
public class Animal {
    //properties
    private String name;
    private BufferedImage image;
        
    //constructors
    public Animal(String name) throws IOException{
        this.name = name;
        this.image = ImageIO.read(new File(name + ".png"));
    }

    //methods 
    public String getName () {
        return name;
    }

    public BufferedImage getImage () {
        return image;
    }
    
}
