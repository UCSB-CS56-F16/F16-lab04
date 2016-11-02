package edu.ucsb.cs56.drawings.dong_he.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
A vector drawing of a rocket that implements
the Shape interface, and so can be drawn, as well as
rotated, scaled, etc.

@author Phill Conrad
@author Dong He
@version for CS56, F16, UCSB

*/
public class Rocket extends GeneralPathWrapper implements Shape
{
/**
Constructor

@param x x coord of lower left corner of rocket
@param y y coord of lower left corner of rocket
@param width width of the rocket
@param height of rocket (including base and tip)
*/
public Rocket(double x, double y, double width, double height)
{

// Rather than having to scale at the end, we can just
// draw things the right way to begin with, using the
// x, y, width and height.   If you haven't already
// hard coded a particular drawing, this may be an easier
// way.

double firstStage = .75 * height;
double tip = height - firstStage;

double firstStageUpperLeftY = y + tip;

// Make the first stage

Rectangle2D.Double base =
new Rectangle2D.Double(x, firstStageUpperLeftY ,
width, firstStage);

// make the tip.   Remember that y goes DOWN the page,
// so we ADD to y to get a "lower" value on the screen

Line2D.Double leftTip =
new Line2D.Double (x , y + tip,
x + width/2.0, y);

Line2D.Double rightTip =
new Line2D.Double (x + width/2.0, y,
x + width, y + tip);

// make the left fin
Line2D.Double LeftFin1 =
new Line2D.Double (x, y + height,
x - width/2, y + height + width/4);
    
Line2D.Double LeftFin2 =
new Line2D.Double (x - width/2, y + height + width/4,
x, y + height - height/2);

//make the right fin
Line2D.Double RightFin1 =
new Line2D.Double (x + width, y + height,
x + width + width/2, y + height + width/4);
    
Line2D.Double RightFin2 =
new Line2D.Double (x + width + width/2, y + height + width/4,
x + width, y + height - height/2);

// put the whole rocket together

GeneralPath wholeRocket = this.get();
wholeRocket.append(base, false);
wholeRocket.append(leftTip, false);
wholeRocket.append(rightTip, false);
wholeRocket.append(LeftFin1, false);
wholeRocket.append(LeftFin2, false);
wholeRocket.append(RightFin1, false);
wholeRocket.append(RightFin2, false);

}
}
