package edu.ucsb.cs56.drawings.dwchojnacki.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   Draws a MasterBall (from Pokemon)
      
   @author Daniel Chojnacki
   @version for CS56, F16, UCSB
   
*/
public class MasterBall extends PokeBall implements Shape
{

    /**
       Constructor
       
       @param x x coord of the center of the master ball
       @param y y coord of the center of the master ball
       @param radius radius of the master ball
    */
    public MasterBall(double x, double y, double radius)
    {
	// construct the basic pokeball
	super(x,y,(radius*(0.3)),(radius*(0.7)));
	double innerRadius = (0.3)*radius;
	double outerRadius = (0.7)*radius;
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	// get the various points we need
	double pointx1 = x - innerRadius;
	double pointy1 = y - innerRadius;
	double pointx2 = pointx1 + ((0.1)*radius);
	double pointy2 = pointy1;
	double pointx3 = x - ((0.5)*innerRadius);
	double pointy3 = y - ((0.7)*radius);
	double pointx4 = pointx3 + ((0.05)*innerRadius);;
	double pointy4 = pointy3 + ((0.1)*radius);
	double pointx5 = x;
	double pointy5 = y - innerRadius - ((0.2)*radius);
	double pointx6 = x;
	double pointy6 = y - innerRadius - ((0.1)*radius);
	// add the various lines of the "M" on the master ball
	Line2D.Double mLine1 =
	    new Line2D.Double(pointx1, pointy1, pointx2, pointy2);
	Line2D.Double mLine2 =
	    new Line2D.Double(pointx1, pointy1, pointx3, pointy3);
	Line2D.Double mLine3 =
	    new Line2D.Double(pointx3, pointy3, pointx5, pointy5);
	Line2D.Double mLine4 =
	    new Line2D.Double(pointx2, pointy2, pointx4, pointy4);
	Line2D.Double mLine5 =
	    new Line2D.Double(pointx4, pointy4, pointx6, pointy6);
	Line2D.Double mLine6 =
	    new Line2D.Double(x+(x-pointx1), pointy1, x+(x-pointx2), pointy2);
	Line2D.Double mLine7 =
	    new Line2D.Double(x+(x-pointx1), pointy1, x+(x-pointx3), pointy3);
	Line2D.Double mLine8 =
	    new Line2D.Double(x+(x-pointx3), pointy3, x+(x-pointx5), pointy5);
	Line2D.Double mLine9 =
	    new Line2D.Double(x+(x-pointx2), pointy2, x+(x-pointx4), pointy4);
	Line2D.Double mLine10 =
	    new Line2D.Double(x+(x-pointx4), pointy4, x+(x-pointx6), pointy6);
	
        GeneralPath wholePokeBall = this.get();
        wholePokeBall.append(mLine1, false);
        wholePokeBall.append(mLine2, false);
        wholePokeBall.append(mLine3, false);
        wholePokeBall.append(mLine4, false);
        wholePokeBall.append(mLine5, false);
        wholePokeBall.append(mLine6, false);
        wholePokeBall.append(mLine7, false);
        wholePokeBall.append(mLine8, false);
        wholePokeBall.append(mLine9, false);
        wholePokeBall.append(mLine10, false);
    }    
}
