package edu.ucsb.cs56.drawings.jordanang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a bomb that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jordan Ang 
   @version for CS56, F16, UCSB
   
*/

public class Bomb extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of bomb
       @param y y coord of lower left corner of bomb
       @param diameter diameter of the bomb size
    */
    public Bomb(double x, double y, double diameter)
    {

        double totalHeight = diameter/0.7;
        
        double fuseHeight = 0.175 * totalHeight;
        double fuseWidth = 0.08 * diameter;
        double fuseTopLeftX = x + (diameter/2) - (0.04*diameter);
        double fuseTopLeftY = y;

        double bombTopLeftX = x;
        double bombTopLeftY = y + fuseHeight;

        double fuseSparkX = x + (diameter/2);
        double sparkLength = 0.2 * diameter;
        double sparkCoordX = 0.8 * sparkLength * Math.cos(Math.toRadians(45));
        double sparkCoordY = 0.8 * sparkLength * Math.sin(Math.toRadians(45));

        Rectangle2D.Double fuse = new Rectangle2D.Double(fuseTopLeftX, fuseTopLeftY, fuseWidth, fuseHeight);
        Ellipse2D.Double circle = new Ellipse2D.Double(bombTopLeftX,bombTopLeftY,diameter,diameter);
        
        GeneralPath fuseSpark = new GeneralPath();
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX - sparkLength, y); //left
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX + sparkLength, y); //right
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX, y - sparkLength); //down
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX, y + sparkLength); //up
        fuseSpark.moveTo(fuseSparkX,y);

        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX - sparkCoordX, y - sparkCoordY); //up-left 45
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX + sparkCoordX, y - sparkCoordY); //up-right 45
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX - sparkCoordX, y + sparkCoordY); //down-left 45
        fuseSpark.moveTo(fuseSparkX,y);
        fuseSpark.lineTo(fuseSparkX + sparkCoordX, y + sparkCoordY); //down-right 45
        fuseSpark.moveTo(fuseSparkX,y);
        
        GeneralPath wholeBomb = this.get();
        wholeBomb.append(circle, false);
        wholeBomb.append(fuse, false);
        wholeBomb.append(fuseSpark, false);
    }

}
