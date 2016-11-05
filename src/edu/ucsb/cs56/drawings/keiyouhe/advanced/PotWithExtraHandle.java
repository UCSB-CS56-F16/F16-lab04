package edu.ucsb.cs56.drawings.keiyouhe.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D; 

/**
   A Pot with extra handle
      
   @author Huiyang He
   @version for CS56, F16, UCSB
   
*/

public class PotWithExtraHandle extends Pot implements Shape{

    /**
       Constructor
       
       @param x x coord of lower left corner of handle
       @param y y coord of lower left corner ofhandle
       @param width width of the pot body
       @param height of  the pot body
    */
    public PotWithExtraHandle(double x, double y, double width, double height){

	// construct the basic pot
        super(x, y, width, height);

	// get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

	// add the extra handle to the pot
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
