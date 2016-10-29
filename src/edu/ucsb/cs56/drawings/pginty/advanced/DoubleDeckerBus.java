package edu.ucsb.cs56.drawings.pginty.advanced;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 * A vector drawing of a Bus that implements Shape.
 * It can be drawn, scaled, rotated, etc.
 *
 * @author pginty
 * @version for CS56, W16, UCSB
 */
public class DoubleDeckerBus extends Bus implements Shape{

    /**
     * Constructor for a Bus
     * @param x x coordinate of lower left corner of bus
     * @param y y coordinate of lower left corner of bus
     * @param width width of bus
     * @param height height of bus
     */
    public DoubleDeckerBus(double x, double y, double width, double height){
        super(x,y,width,height/2); //construct a bus in the lower half of the available window
        GeneralPath doubleBus = this.get();

        double bodyWidth = 0.92 * width;

        double windowSideLength = bodyWidth * .16;

        double secondLevelY = y - height;

        double windowY = secondLevelY + height/16;
        double window1X = x + (bodyWidth/15);
        double window2X = window1X + (bodyWidth/15) + windowSideLength;
        double window3X = window2X + (bodyWidth/15) + windowSideLength;
        double window4X = window3X + (bodyWidth/15) + windowSideLength;

        Rectangle2D.Double body = new Rectangle2D.Double(x, secondLevelY, bodyWidth, height/2);

        Rectangle2D.Double window1 = new Rectangle2D.Double(window1X, windowY, windowSideLength, windowSideLength);
        Rectangle2D.Double window2 = new Rectangle2D.Double(window2X, windowY, windowSideLength, windowSideLength);
        Rectangle2D.Double window3 = new Rectangle2D.Double(window3X, windowY, windowSideLength, windowSideLength);
        Rectangle2D.Double window4 = new Rectangle2D.Double(window4X, windowY, windowSideLength, windowSideLength);

        doubleBus.append(body,false);
        doubleBus.append(window1,false);
        doubleBus.append(window2,false);
        doubleBus.append(window3,false);
        doubleBus.append(window4,false);
    }
}
