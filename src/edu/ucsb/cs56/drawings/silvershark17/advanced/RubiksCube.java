package edu.ucsb.cs56.drawings.silvershark17.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Line2D;

/**
   A Rubik's Cube that extends class Cube
      
   @author Eric Xiao 
   @version for CS56, F16, UCSB
   
*/
public class RubiksCube extends Cube implements Shape
{
    /**
     * Constructor for objects of class Cube
     */
    public RubiksCube(double x, double y, double length)
    {
	super(x,y,length);
	GeneralPath gp = this.get();
	double mini = length/3; // the length of the individual Rubik's squares
	double mini2 = length/6; // horizontal gap for  top and side faces
	double mini3 = 2*length/15; // vertical gap for top and side faces
	
	Line2D bottom1 =
	    new Line2D.Double(x, y+2*mini, x+length, y+2*mini);
	Line2D bottom2 =
	    new Line2D.Double(x, y+mini, x+length, y+mini);
	Line2D bottom3 =
	    new Line2D.Double(x+mini, y, x+mini, y+length);
	Line2D bottom4 =
	    new Line2D.Double(x+2*mini, y, x+2*mini, y+length);
	Line2D top1 =
	    new Line2D.Double(x+mini, y, x+mini+0.5*length, y-0.4*length);
	Line2D top2 =
	    new Line2D.Double(x+2*mini, y, x+2*mini+0.5*length, y-0.4*length);
	Line2D top3 =
	    new Line2D.Double(x+mini2, y-mini3, x+mini2+length, y-mini3);
	Line2D top4 =
	    new Line2D.Double(x+2*mini2, y-2*mini3, x+2*mini2+length, y-2*mini3);
	Line2D right1 =
	    new Line2D.Double(x+length, y+mini, x+1.5*length, y+mini-0.4*length);
	Line2D right2 =
	    new Line2D.Double(x+length, y+2*mini, x+1.5*length, y+2*mini-0.4*length);
	Line2D right3 =
	    new Line2D.Double(x+mini2+length, y-mini3, x+mini2+length, y-mini3+length);
	Line2D right4 =
	    new Line2D.Double(x+2*mini2+length, y-2*mini3, x+2*mini2+length, y-2*mini3+length);

	GeneralPath wholeCube = this.get();
	wholeCube.append(bottom1, false);
	wholeCube.append(bottom2, false);
	wholeCube.append(bottom3, false);
	wholeCube.append(bottom4, false);
	wholeCube.append(top1, false);
	wholeCube.append(top2, false);
	wholeCube.append(top3, false);
	wholeCube.append(top4, false);
	wholeCube.append(right1, false);
	wholeCube.append(right2, false);
	wholeCube.append(right3, false);
	wholeCube.append(right4, false);
    }
}
