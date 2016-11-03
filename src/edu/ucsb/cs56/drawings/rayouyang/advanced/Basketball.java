package edu.ucsb.cs56.drawings.rayouyang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
/**
   BasketBall and Player
      
   @author Phill Conrad, Ray Ouyang 
   @version for CS56, W16, UCSB
   
*/
public class Basketball extends GeneralPathWrapper implements Shape{
	public Basketball ( double x, double y, double width, double height){
		GeneralPath gp = this.get();
		double ballWidth = 0.3 * width;
		double ballHeight = 0.3 * height;
		double xCoordinate = x + .75 * width;
		double yCoordinate = y + .45 * height;
		double curveXstart = xCoordinate + ballWidth;
		
		
		Ellipse2D.Double basketball = new Ellipse2D.Double(xCoordinate,yCoordinate,ballWidth,ballHeight);
		
		GeneralPath bLine = new GeneralPath ();
		bLine.moveTo(xCoordinate, yCoordinate + (ballHeight / 2));
		bLine.lineTo(xCoordinate + ballWidth, yCoordinate + (ballHeight / 2));

		bLine.moveTo(	xCoordinate + (ballWidth / 2), 
							yCoordinate);
		bLine.lineTo(	xCoordinate + (ballWidth / 2), 
							yCoordinate + ballHeight);

		bLine.moveTo(xCoordinate + (	ballWidth * 2 / 9), 
											yCoordinate + (ballHeight * .1 ));
		bLine.curveTo(xCoordinate + (ballWidth / 3), 
					  yCoordinate + (ballHeight / 4),
					  xCoordinate + (ballWidth / 3), 
					  yCoordinate + (ballHeight * 3 / 4),
					  xCoordinate + (ballWidth * 2 / 9), 
					  yCoordinate + (ballHeight * .9));

		bLine.moveTo(curveXstart - (ballWidth * 2 / 9), 
						 yCoordinate + (ballHeight * .1));
		bLine.curveTo(curveXstart - (ballWidth / 3), 
					  yCoordinate + (ballHeight / 4),
	  				  curveXstart - (ballWidth / 3), 
	  				  yCoordinate + (ballHeight * 3 / 4),
					  curveXstart - (ballWidth * 2 / 9), 
					  yCoordinate + (ballHeight * .9));


		GeneralPath Basketball = this.get();
		Basketball.append(bLine, false);
		Basketball.append(basketball, false);


	}

}