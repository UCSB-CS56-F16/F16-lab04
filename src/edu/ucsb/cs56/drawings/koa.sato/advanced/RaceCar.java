package edu.ucsb.cs56.drawings.koa.sato.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import javax.swing.JLabel;

/**
 * Vector drawing of RaceCar which extends Car.
 * Adds a number 1 to side and spoiler.
 *
 * @author koa-sato
 * @version for CS56, F16, UCSB
 */
public class RaceCar extends Car implements Shape{
    
    /**
     * Constructor
     *
     * @param x The bottom left x position of the RaceCar
     * @param y The bottom left y position of the RaceCar
     * @param width The total width of the RaceCar
     * @param height The total height of the RaceCar (inlcuding the bottom of the wheels)
     *
     */
    public RaceCar(double x, double y, double width, double height) {
        super(x, y, width, height);
        y = y - .2 * height;
        double grillHeight = .50 * height;
        double spoilerDistance = x + .925 * width;
        double verticalSpoilerHeight = .1 * height;
        
        Line2D.Double verticalSpoiler = new Line2D.Double(spoilerDistance, y - grillHeight,
                spoilerDistance, y - grillHeight - verticalSpoilerHeight);
        
        double topSpoilerWidth = .1 * width;
        double topSpoilerHeight = .075 * height;
        
        Line2D.Double topOfSpoiler = new Line2D.Double(spoilerDistance - .5 * topSpoilerWidth,
                y - grillHeight - verticalSpoilerHeight + .5 * topSpoilerHeight,
                spoilerDistance + .5 * topSpoilerWidth,
                y - grillHeight - verticalSpoilerHeight - .5 * topSpoilerHeight
                );
        
        // Adds "1" to side of car
        
        Line2D.Double number = new Line2D.Double(x + width/2, 
                y - height * .1, 
                x + width/2,
                y - height * .4);
        
        GeneralPath wholeRaceCar = this.get();
        
        
        wholeRaceCar.append(verticalSpoiler, false);
        wholeRaceCar.append(topOfSpoiler, false);
        wholeRaceCar.append(number, false);
    }
}
