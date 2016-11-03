package edu.ucsb.cs56.drawings.tcisewski.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import edu.ucsb.cs56.drawings.tcisewski.simple.Circle;

/**
 * Created by trent on 10/28/2016.
 */
public class IceCream extends GeneralPathWrapper implements java.awt.Shape {

    /**
     * Constructor for objects of class IceCream
     * @param x    x coordinate of center of ice cream
     * @param y    y coordinate of center of ice cream
     * @param r    radius of ice cream
     */

    public IceCream(double x, double y, double r)
    {

        Circle cream = new Circle(x, y, r);

        double leftEdgeX = x-r;
        double leftEdgeY = y;
        double rightEdgeX = x+r;
        double rightedgeY = y;

        Line2D.Double leftCone =
                new Line2D.Double (leftEdgeX, y,
                        x, y + 3.5*r);

        Line2D.Double rightCone =
                new Line2D.Double (rightEdgeX, y,
                        x, y + 3.5*r);

        GeneralPath iceCream = this.get();
        iceCream.append(cream, false);
        iceCream.append(leftCone, false);
        iceCream.append(rightCone, false);

    }
}
