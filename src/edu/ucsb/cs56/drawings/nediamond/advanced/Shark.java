package edu.ucsb.cs56.drawings.nediamond.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;

public class Shark extends Fish implements Shape{
    static double PERCENT_HEIGHT_FIN = .5;
    public Shark(double x, double y, double width, double height) {
        //Note: PERCENT_HEIGHT_FIN is not functioning properly for some reason
        super(x,y,width,height*(1-PERCENT_HEIGHT_FIN));
        
        GeneralPath gp = this.get();

        double tailWidth = this.PERCENT_WIDTH_TAIL * width;
        double bodyHeight = height*(1-PERCENT_HEIGHT_FIN);

        // Making fin
        Line2D.Double f1 = new Line2D.Double(x, y-bodyHeight/2, x-tailWidth/2, y-height/2);
        Line2D.Double f2 = new Line2D.Double(x-tailWidth, y-bodyHeight/2, x-tailWidth/2, y-height/2);


        gp.append(f1,false);
        gp.append(f2,false);
    }
}