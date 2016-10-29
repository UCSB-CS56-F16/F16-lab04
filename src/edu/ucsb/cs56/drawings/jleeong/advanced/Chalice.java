package edu.ucsb.cs56.drawings.jleeong.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import edu.ucsb.cs56.drawings.jleeong.simple.Circle;
/**
	A Chalice
	
	@author Jared Leeong
	@version for CS56, F16, UCSB
*/
public class Chalice extends Cup implements Shape{
	/**
		Constructor for Chalice
	*/
	public Chalice(double x, double y, double width, double height)
	{
		super(x,y,width,height/2);
		
		GeneralPath gp = this.get();

		double stemheight=height/2;
		double appendagewidth = 5;
		double mid = x+width/2-appendagewidth/2;
	
		Rectangle2D.Double stem =
			new Rectangle2D.Double(mid, y+height/2,
			appendagewidth, height/4);
		Rectangle2D.Double cupRing =
			new Rectangle2D.Double(x, y+height/4,
			width, 3);
		Line2D.Double base =
			new Line2D.Double(x, y+height, x+width,
			y+height);
		Line2D.Double lbase =
			new Line2D.Double(x, y+height, mid,
			y+3*height/4);
		Line2D.Double rbase =
			new Line2D.Double(x+width, y+height,
			mid+appendagewidth, y+3*height/4);
			
		gp.append(stem, false);
		gp.append(base,false);
		gp.append(lbase,false);
		gp.append(rbase,false);
		gp.append(cupRing,false);
	}
}
