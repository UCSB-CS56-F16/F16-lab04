package edu.ucsb.cs56.drawings.mschmit.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class TrafficSign extends trafficCone implements Shape{
   
    public TrafficSign(int x, int y, int height, int rectHeight, int rectWidth, boolean go){
	//(x,y) is the coordinates of the top point of the traffic cone
	//height is the height of the traffic cone
	//rectHeight and rectWidth are the height and width of the sign
	//boolean tells us which pictograph to draw on the sign
	//when true, draw a plus, when false, draw an upside down triangle

	super(x, y, height);
	//x, y is the coordinate of the top point of the cone

	GeneralPath gp = this.get();

	Rectangle2D.Double sign = 
	    new Rectangle2D.Double((x-(rectWidth/2)), y - rectHeight, rectWidth, rectHeight);
				   //height, width, x, y
				   //x,y is the top left

	GeneralPath wholeSign = this.get();
	wholeSign.append(sign, false);

	//draw pictographs onto sign
	if(go){
	    //draw cross
	 
	    //draw horizontal line
	    int lengthCross = rectWidth/2;
	    int heightCross = rectHeight/2;
	    
	    //find coordinates
	    int horX = x - (lengthCross/2);
	    int horY = y - (heightCross/2);
	    Line2D.Double horCross =
		new Line2D.Double(horX, horY, (horX+lengthCross), horY);

	    int verX = x;
	    int verY = y - heightCross;
	    Line2D.Double verCross = 
		new Line2D.Double(verX, verY, verX, (verY + heightCross));
	    wholeSign.append(horCross, false);
	    wholeSign.append(verCross, false);
	    
   
	}else{
	    //draw upside down triangle
	    
	}

	
    }

}