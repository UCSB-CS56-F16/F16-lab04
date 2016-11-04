package edu.ucsb.cs56.drawings.xinyuanzhang.advanced;

import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.PathIterator;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/**
   @author Xinyuan Zhang

   @version for CS56,F16,UCSB
*/

public class CuteToothBrush extends ToothBrush implements Shape{

    /**
       Constructor
       @param x the coordinate of the left edge
       @param y the coordinate of the top
       @param width width of the ToothBrush 
       @param height  height of the ToothBrush
    */

    public CuteToothBrush (double x, double y,double width, double height){
	super(x,y,width,height);

	double units = 0.1*height;

	Rectangle2D.Double body= new Rectangle2D.Double(x-units,y+2*height,
							units*2,units*2);
	Rectangle2D.Double larm = new Rectangle2D.Double(x-2*units,y+0.5*units+2*height,
							 units,0);
	Rectangle2D.Double rarm = new Rectangle2D.Double(x+units,y+0.5*units+2*height,
							 units,0);
	Rectangle2D.Double lleg = new Rectangle2D.Double(x-0.5*units,y+2*units+2*height,
							 0, units);
	Rectangle2D.Double rleg = new Rectangle2D.Double(x+0.5*units,y+2*units+2*height,
							 0, units);
	//put all components together
	GeneralPath CuteToothBrush = this.get();
	CuteToothBrush.append(body, false);
	CuteToothBrush.append(larm, false);
	CuteToothBrush.append(rarm, false);
	CuteToothBrush.append(lleg, false);
	CuteToothBrush.append(rleg, false);
    }
}
