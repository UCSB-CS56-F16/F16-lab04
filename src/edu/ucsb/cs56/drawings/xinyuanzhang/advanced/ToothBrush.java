package edu.ucsb.cs56.drawings.xinyuanzhang.advanced;

import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.PathIterator;
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
	double tHeadHeight = height*0.2;
	double tHeadWidth = 0.98*width;
	double tNeckWidth = 0.02 * width;
	double lineSpace = 0.2 * tHeadHeight;

	//Make teh first toothbrush

	Rectangle2D.Double tNeck =
	    new Rectangle2D.Double(x,y+height,tNeckWidth,height);

	//make the head
	Rectangle2D.Double tHead =
	    new Rectangle2D.Double(x+tNeckWidth,y+height+0.2*tHeadHeight,tHeadWidth,tHeadHeight);
	//	int number = 4;
	//Line2D.Double [] tHeads = new Line2D.Double[number] ;
	//	for(int i=0;i<number;i++)
	Line2D.Double line1 = new Line2D.Double(x+tNeckWidth,y+height+0.4*tHeadHeight,
						x+tHeadWidth,y+height+0.4*tHeadHeight);
	Line2D.Double line2 = new Line2D.Double(x+tNeckWidth,y+height+0.6*tHeadHeight,
						x+tHeadWidth,y+height+0.6*tHeadHeight);
	Line2D.Double line3 = new Line2D.Double(x+tNeckWidth,y+height+0.8*tHeadHeight,
						x+tHeadWidth,y+height+0.8*tHeadHeight);
	Line2D.Double line4 = new Line2D.Double(x+tNeckWidth,y+height+tHeadHeight,
						x+tHeadWidth,y+height+tHeadHeight);

	//put the all components together
	GeneralPath toothBrush = this.get();
	toothBrush.append(tNeck,false);
	toothBrush.append(tHead,false);
	toothBrush.append(line1,false);
	toothBrush.append(line2,false);
	toothBrush.append(line3,false);
	toothBrush.append(line4,false);
	
    }
}

							      
							      
							     
