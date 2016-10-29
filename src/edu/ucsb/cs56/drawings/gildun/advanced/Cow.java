package edu.ucsb.cs56.drawings.gildun.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 A vector drawing of a cow that implements
 the Shape interface, and so can be drawn, as well as
 rotated, scaled, etc.

 @author Richard Young
 @version for CS56, F16, UCSB

 */
public class Cow extends GeneralPathWrapper implements Shape {

    /**
     Constructor

     @param x x coord of lower left corner of left leg
     @param y y coord of lower left corner of left leg
     @param width width of the house
     @param height how tall the cow is (including legs and body, **not top of head**)
     */
    public Cow (double x, double y, double width, double height){
        double legHeight = .3 * height;
        double bodyHeight = .9 * height;
        double headHeight = .65 * width;
        double headLength = .35 * width;
        double tailLength = .3 * width;

        Rectangle2D.Double body = new Rectangle2D.Double(x, y, width, bodyHeight);
        Rectangle2D.Double head = new Rectangle2D.Double(x - headHeight, y - headLength, headHeight, headLength);
        Line2D.Double leftLegs = new Line2D.Double(x, y + legHeight + height, x, y);
        Line2D.Double rightLegs = new Line2D.Double(x + width, y + height + legHeight, x + width, y);
        Line2D.Double tail = new Line2D.Double(x + width, y, x + width + tailLength, y + .1 * width);

        GeneralPath wholeCow = this.get();
        wholeCow.append(leftLegs, false);
        wholeCow.append(rightLegs, false);
        wholeCow.append(body, false);
        wholeCow.append(head, false);
        wholeCow.append(tail, false);





    }

}
