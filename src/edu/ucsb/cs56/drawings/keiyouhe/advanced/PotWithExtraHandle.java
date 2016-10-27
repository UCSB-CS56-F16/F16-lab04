package edu.ucsb.cs56.drawings.keiyouhe.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D; 


public class PotWithExtraHandle extends Pot implements Shape{

    public PotWithExtraHandle(double x, double y, double width, double height){

        super(x, y, width, height);

        GeneralPath gp = this.get();

        double handleLength = width * 1/4;
        double handleLeftX = width * 2.2 +x;
        double handleRightX = handleLength + width * 2.2 + x;
        double handleHeight= height*0.2;

        Line2D.Double handleTop = new Line2D.Double(handleLeftX, y+handleHeight*0.2, handleRightX, y);
        Line2D.Double handleBottom = new Line2D.Double(handleLeftX, y+ 1.2*handleHeight, handleRightX, y+handleHeight);
        Line2D.Double handleRight = new Line2D.Double(handleRightX, y+handleHeight, handleRightX, y);

        gp.append(handleTop, false);
        gp.append(handleRight, false);
        gp.append(handleBottom, false);
    }

}
