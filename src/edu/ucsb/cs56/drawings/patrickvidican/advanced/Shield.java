package edu.ucsb.cs56.drawings.patrickvidican.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Dark Ages round shield that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Patrick Vidican
   @version for CS56, F16, UCSB

*/
public class Shield extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param radius should be about the length of your forearm
    */
    public Shield(double x, double y, double radius){

        // Cut the wood out
        Ellipse2D.Double edge = new Ellipse2D.Double( x-radius, y-radius, 2*radius,  2*radius );

        // hammer out the boss
        double bossOuterRadius = radius/4.5;
        double bossInnerRadius = bossOuterRadius/1.667;
        Ellipse2D.Double bossOuter = new Ellipse2D.Double( x-bossOuterRadius, y-bossOuterRadius, 2*bossOuterRadius,  2*bossOuterRadius );
        Ellipse2D.Double bossInner = new Ellipse2D.Double( x-bossInnerRadius, y-bossInnerRadius, 2*bossInnerRadius,  2*bossInnerRadius );

        // rivet the boss onto the wood
        GeneralPath wholeShield = this.get();
        wholeShield.append(edge, false);
        wholeShield.append(bossOuter, false);
        wholeShield.append(bossInner, false);
    }
}
