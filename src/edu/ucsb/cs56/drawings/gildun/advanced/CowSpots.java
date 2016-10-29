package edu.ucsb.cs56.drawings.gildun.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 A vector drawing of a cow with spots that extends Cow class that implements
 the Shape interface, and so can be drawn, as well as
 rotated, scaled, etc.

 @author Richard Young
 @version for CS56, F16, UCSB
 */
public class CowSpots extends Cow implements Shape {

    public CowSpots(double x, double y, double width, double height){

        super (x, y, width, height);
        Ellipse2D.Double topLeftSpot = new Ellipse2D.Double(x, y, width/2, height/4);
        Ellipse2D.Double bottomRightSpot = new Ellipse2D.Double(x + width/2, y + height/2, width/2, height/4);

        GeneralPath spots = this.get();
        spots.append(topLeftSpot, false);
        spots.append(bottomRightSpot, false);

    }



}
