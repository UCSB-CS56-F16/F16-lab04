package edu.ucsb.cs56.drawings.xinyuanzhang.advanced;

import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Recantagle2D;
import java.awt.geom.PathInerator;
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

    public ToothBrush(double x,double y,double width,double height)
    { 
	double tHeadHeight = 0.2 * height;
	double tHeadWidth = 0.8*width;
	double tNeckWidth = 0.2 * width;
	double lineSpace = 0.1 * toothbrushHeadh;

	//Make teh first toothbrush

	Rectangle2D.Double tNeck =
	    new Rectangle2D.Double(x,y,tNeckWidth,height);

	//make the head
	Rectangle2D.Double tHead =
	    new Rectangle2D.Double(x+tNeckWidth,0.95*y,tHeadWidth,tHeadHeight);     
	Rectangle2D.Double [] tHeads = new Rectangle2D.Double[5] ;
	for(double i=0;i<5 ;i++)
	    tHeads[i]= new Rectangle2D.Double(x+tNeckWidth,0.95*y-0.2*(i+1),tHeadWidth,lineSpace);

	//put the all components together
	GeneralPath toothBrush = this.get();
	toothBrush.append(tNeck,false);
	toothBrush.append(tHead,false);
	for(int j=0;j<5;j++)
	    toothBrush.append(tHeads[j],false);
    }
}

							      
							      
							     
