package edu.ucsb.cs56.drawings.xinyuanzhang.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.wat.geom.Recantagle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a toothbrush that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Xinyuan Zhang 
   @version for CS56, F16, UCSB
   
*/
public class ToothBrush extends GeneralPathWrapper implements Shape

{
    /**
       Constructor

       @param x x coord of lower left corner of toothbrush
       @param y y coord of lower left corner of toothbrush
       @param width width of the toothbrush
       @param height of toothbrush
    */

    public House(double x,double y,double width,double height)
    { 
	double tHeadHeight = 0.2 * height;
	double tHeadWidth = 0.8*width;
	double tNeckWidth = 0.2 * width;
	double lineSpace = 0.1 * toothbrushHeadh;

	//Make teh first toothbrush

	Rectangle2D.Double firstTb =
	    new Rectangle2D.Double(x,y,tNeckWidth,height);

	//make the head
	Rectangle2D.Double tHead =
	    new Rectangle2D.Double(x+tNeckWidth,y,tHeadWidth,tHeadHeight);
	Rectangle2D.Double tHead1;
	Rectangle2D.Double tHead2 ;
	Rectangle2D.Double tHead3;
	Rectangle2D.Double tHead4;
	Rectangle2D.Double tHead5;
	//for(int i=1;i<5 ;i++){
	    
    }
}

							      
							      
							     
