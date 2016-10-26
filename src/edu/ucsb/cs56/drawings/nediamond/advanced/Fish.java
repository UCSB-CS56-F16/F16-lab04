package edu.ucsb.cs56.drawings.nediamond.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;

// import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class Fish extends GeneralPathWrapper implements Shape {
    static double PERCENT_WIDTH_TAIL = .2;

    public Fish(double x, double y, double width, double height) {
        Ellipse2D.Double body = new Ellipse2D.Double(x-width/2,y-height/2,width*(1-PERCENT_WIDTH_TAIL),height);

        // Tail
        Line2D.Double t1= new Line2D.Double(x+(width/2-PERCENT_WIDTH_TAIL*width),y,x+width/2,y+height/2);
        Line2D.Double t2= new Line2D.Double(x+(width/2-PERCENT_WIDTH_TAIL*width),y,x+width/2,y-height/2);
        Line2D.Double t3= new Line2D.Double(x+width/2,y+height/2,x+width/2,y-height/2);

        GeneralPath wholeFish = this.get();
        wholeFish.append(body, false);
        wholeFish.append(t1, false);
        wholeFish.append(t2, false); 
        wholeFish.append(t3, false); 
    }

}