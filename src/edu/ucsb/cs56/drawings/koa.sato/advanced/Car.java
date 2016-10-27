package edu.ucsb.cs56.drawings.koa.sato.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a car that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Koa Sato
   @version for CS56, F16, UCSB
   
*/
public class Car extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of car
       @param y y coord of lower left corner of car
       @param width width of the car
       @param height of car (including bottom of tires))
    */
    
    public Car(double x, double y, double width, double height) {
        // make front of car
        double trueY = y;
        //offset y so that tires can be fit underneath
        y = y - .20 * height;
        
        double grillHeight = .50 * height;
        double hoodWidth =  .275 * width;
        double windshieldHeight = .30 * height;
        double windshieldWidth = .075 * width;
        double headlightHeight = .20 * height;
        double headlightWidth = .10 * width;
        
        Line2D.Double grill = new Line2D.Double(x, y - grillHeight, x, y);
        Line2D.Double hood = new Line2D.Double(x, y - grillHeight , x + hoodWidth, y - grillHeight);
        Line2D.Double windshield = new Line2D.Double(x + hoodWidth, y - grillHeight,
                x + hoodWidth + windshieldWidth, y - grillHeight - windshieldHeight);
        
        Rectangle2D.Double headlight = new Rectangle2D.Double(x, y - grillHeight,
                headlightWidth, headlightHeight);
        
        // Make top of car
        double topWidth = .30 * width;
        
        Line2D.Double top = new Line2D.Double(
                x + hoodWidth + windshieldWidth,
                y - grillHeight - windshieldHeight,
                x + hoodWidth + windshieldWidth + topWidth,
                y - grillHeight - windshieldHeight);
        
        // Make back of Car
        Line2D.Double backWindshield = new Line2D.Double(
                x + hoodWidth + windshieldWidth + topWidth,
                y - grillHeight - windshieldHeight,
                x + hoodWidth + 2*windshieldWidth + topWidth,
                y - grillHeight
                );
        
        Line2D.Double trunkTop = new Line2D.Double(
                x + hoodWidth + 2 * windshieldWidth + topWidth,
                y - grillHeight,
                x + 2 * hoodWidth + 2*windshieldWidth + topWidth,
                y - grillHeight);
        
        Line2D.Double back = new Line2D.Double(
                x + 2 * hoodWidth + 2*windshieldWidth + topWidth,
                y - grillHeight,
                x + 2 * hoodWidth + 2*windshieldWidth + topWidth,
                y);
        
        // Draw in tires
        double tireDiameter = .4 * height;
        
        Ellipse2D.Double frontTire = new Ellipse2D.Double(
                x + hoodWidth - tireDiameter * .5,
                y - tireDiameter * .5,
                tireDiameter, tireDiameter);
        
        Ellipse2D.Double backTire = new Ellipse2D.Double(
                x + hoodWidth + 2 * windshieldWidth + topWidth - tireDiameter * .5,
                y - tireDiameter * .5,
                tireDiameter, tireDiameter);
        
        //Draw in bottom
        Line2D.Double bottomFront = new Line2D.Double(
                x,
                y,
                x + hoodWidth - tireDiameter * .5,
                y);
        
        Line2D.Double bottomMiddle = new Line2D.Double(
                x + hoodWidth + tireDiameter * .5,
                y,
                x + hoodWidth + 2 * windshieldWidth + topWidth - .5 * tireDiameter,
                y);
        
        Line2D.Double bottomBack = new Line2D.Double(
                x + hoodWidth + 2 * windshieldWidth + topWidth + tireDiameter * .5,
                y,
                x + 2 * hoodWidth + 2 * windshieldWidth + topWidth,
                y);
        
        GeneralPath wholeCar = this.get();
        
        wholeCar.append(grill, false);
        wholeCar.append(hood, false);
        wholeCar.append(windshield, false);
        wholeCar.append(headlight, false);
        wholeCar.append(top, false);
        wholeCar.append(backWindshield, true);
        wholeCar.append(trunkTop, false);
        wholeCar.append(back, false);
        wholeCar.append(frontTire, false);
        wholeCar.append(backTire, false);
        wholeCar.append(bottomFront, false);
        wholeCar.append(bottomMiddle, false);
        wholeCar.append(bottomBack, false);
        
    }
}
