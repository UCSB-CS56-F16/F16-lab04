package edu.ucsb.cs56.drawings.xuewenli.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 A cake (wrapper around a General Path, implements Shape)

 This provides an example of how you can start with the coordinates
 of a hard coded object, and end up with an object that can be
 drawn anywhere, with any width or height.

 @author Xuewen Sherry Li
 @version for CS56, F16, UCSB

 */
public class Cake extends GeneralPathWrapper implements Shape
{
    /**
     Constructor

     @param x x coord of upper left corner of middle layer of cake
     @param y y coord of upper left corner of middle layer of cake
     @param width width of the entire cake
     @param height of cake (includes all 3 layers)

     */
    public Cake(double x, double y, double width, double height)
    {


        // height of each layer of cake is the same
        double layerHeight = (0.33) * height;

        // width of each layer decreases as we go from bottom
        // layer to top layer
        double bottomWidth = width;
        double middleWidth = (0.70) * bottomWidth;
        double topWidth = (0.70) * middleWidth;

        Rectangle2D.Double bottomLayer =
                new Rectangle2D.Double(x, y + layerHeight, bottomWidth, layerHeight);

        Rectangle2D.Double middleLayer =
                new Rectangle2D.Double(x + (0.15 * bottomWidth), y, middleWidth, layerHeight);

        Rectangle2D.Double topLayer =
                new Rectangle2D.Double(x + (0.15 * bottomWidth) + (0.15 * middleWidth), y - layerHeight, topWidth, layerHeight);

        GeneralPath wholeCake = this.get();
        wholeCake.append(bottomLayer, false);
        wholeCake.append(middleLayer, false);
        wholeCake.append(topLayer, false);


    }

}
