package edu.ucsb.cs56.drawings.mschmit.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves                                                                                                                
import java.awt.Shape; // general class for shapes                                                                                                                                   

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class trafficCone extends GeneralPathWrapper implements Shape
{

    public trafficCone(int x, int y, int height){
	
	//x, y are the coordinates of the top tip of the traffic cone
	
	int width = height/2;
	int x1, y1;  //coordinates of the bottom left corner of the cone
	int x2;  //coordinates of the bottom right corner of the cone

	x1 = x - (width/2);
	y1 = y + height;

	x2 = x + (width/2);


	int y2 = y +(height/2);  //where the middle line is
	int x3 = width/4;
	//use these coordinates to draw the lines
	Line2D.Double leftLine =
	    new Line2D.Double(x, y, x1, y1);
	
	Line2D.Double rightLine =
	    new Line2D.Double(x, y, x2, y1);

	Line2D.Double bottomLine =
	    new Line2D.Double(x1, y1, x2, y1);

	Line2D.Double midLine =
	    new Line2D.Double( (x-x3), y2, (x+x3), y2);
	
	GeneralPath cone = this.get();

	cone.append(leftLine, false);
	cone.append(rightLine, false);
	cone.append(bottomLine, false);
	cone.append(midLine, false);

	
	
    }

}
