package edu.ucsb.cs56.drawings.jleeong.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;
import java.wt.geom.Line2D;

/**
	A Chalice
	
	@author Jared Leeong
	@version for CS56, F16, UCSB
*/
public class Chalice extends Cup implements shape{
	/**
		Constructor for Chalice
	*/
	public Chalice(double x, double y, double width, double height)
	{
		super(x,2*y,width,height/2);
	}
}