package edu.ucsb.cs56.drawings.ttsherpa.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a car with windows because it extends the car class. Along with implementing the shape interface, and so can be drawn, as well as rotated, scaled, etc. 

@author Tenzing Sherpa
@version for CS56, M16, UCSB

*/

public class CarWithWindowsandAnt extends Car implements Shape
{
    /** Constructor that uses the super class to extend from the Car Class. 
	
@param x x coord of upper left corner of car
@param y y coord of upper left corner of car
@param length length of the car
@param height of car (including first story and second story) 
    */

    public CarWithWindowsandAnt(double x, double y, double length, double height){
	super(x,y,length,height);

	GeneralPath gp= this.get();

	double gap = .10 * (.5 *length);
	doublewinTop = y -(.435 * height);
	double winHt = .4 *(height);

	Rectangle2D.Double win1 = new Rectangle2D.Double(x+ (.25*length)+ gap, winTop, 3*gap, winHt);

	Rectangle2D.Double win2 = new Rectangle2D.Double(x+ (.5*length)+ gap, winTop, 4*gap, winHt);

	Rectangle2D.Double anten = new Rectangle2D.Double(x+ gap, y - winHt , .6*gap, winHt);

	Ellipse2D.Double antenball= new Ellipse2D.Double(x+ gap -( .25*gap),y-winHt-10, 10,10);


	GeneralPath wholeHouse = this.get();
	wholeHouse.append(win1, false);
	wholeHouse.append(win2, false);
	wholeHouse.append(anten,false);
	wholeHouse.append(antenball, false);
    }
}
