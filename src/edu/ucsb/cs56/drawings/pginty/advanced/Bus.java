package edu.ucsb.cs56.drawings.pginty.advanced;

import edu.ucsb.cs56.drawings.pginty.simple.Circle;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

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

public class Bus extends GeneralPathWrapper implements Shape {

    /**
     * Constructor for a Bus
     * @param x x coordinate of lower left corner of bus
     * @param y y coordinate of lower left corner of bus
     * @param width width of bus
     * @param height height of bus
     */
    public Bus (double x, double y, double width, double height) {

        double bodyHeight = 0.8 * height;
        double bodyWidth = 0.92 * width;

        double frontHeight = 0.45 * height;
        double frontWidth = 0.08 * width;

        double wheelRadius = (height - bodyHeight)/2;

        double windowSideLength = bodyWidth * 0.16;

        double bodyY = y - height; //bodyX=x

        double frontX = x + bodyWidth;
        double frontY = y - wheelRadius * 2 - frontHeight;

        double wheel1CenterX = x + (bodyWidth/4);
        double wheel2CenterX = x + (3*bodyWidth/4);
        double wheelCenterY = y - wheelRadius;

        double windowY = bodyY + (bodyHeight/8);
        double window1X = x + (bodyWidth/15);
        double window2X = window1X + (bodyWidth/15) + windowSideLength;
        double window3X = window2X + (bodyWidth/15) + windowSideLength;
        double window4X = window3X + (bodyWidth/15) + windowSideLength;

        Rectangle2D.Double body = new Rectangle2D.Double(x, bodyY, bodyWidth, bodyHeight);
        Rectangle2D.Double front = new Rectangle2D.Double(frontX, frontY, frontWidth, frontHeight);

        Rectangle2D.Double window1 = new Rectangle2D.Double(window1X, windowY, windowSideLength, windowSideLength);
        Rectangle2D.Double window2 = new Rectangle2D.Double(window2X, windowY, windowSideLength, windowSideLength);
        Rectangle2D.Double window3 = new Rectangle2D.Double(window3X, windowY, windowSideLength, windowSideLength);
        Rectangle2D.Double window4 = new Rectangle2D.Double(window4X, windowY, windowSideLength, windowSideLength);

        Circle wheel1 = new Circle(wheel1CenterX, wheelCenterY, wheelRadius);
        Circle wheel2 = new Circle(wheel2CenterX, wheelCenterY, wheelRadius);

        GeneralPath entireBus = this.get();

        entireBus.append(body, false);
        entireBus.append(front, false);

        entireBus.append(window1, false);
        entireBus.append(window2, false);
        entireBus.append(window3, false);
        entireBus.append(window4, false);

        entireBus.append(wheel1, false);
        entireBus.append(wheel2, false);

    }
}
