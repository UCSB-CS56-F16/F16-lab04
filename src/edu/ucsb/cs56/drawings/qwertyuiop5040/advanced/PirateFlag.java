package edu.ucsb.cs56.drawings.qwertyuiop5040.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
   PirateFlag is a TriangularFlag with skull and crossbones on the flag. The flag is triangular shaped, with a flag pole.
   The user can specify the starting x, y, as well as the width and height of the flag. The user can optionally specify
   the ratio of height and width between the flag pole and the flag itself. For example, a ratio of 3 for flag pole height
   would mean the flag pole is 3 times longer than the flag itself.
   @author Hanqing Wang
   @version for CS56, F16, UCSB
   
*/
public class PirateFlag extends TriangularFlag implements Shape
{
    /**
     This constructor will supply flagPoleWidthRatio and flagPoleHeightRatio from default values then draw skull
     and crossbones.
     @param x top left corner of the PirateFlag, x coordinate
     @param y top left corner of the PirateFlag, y coordinate
     @param width width of PirateFlag image, in pixels
     @param height height of PirateFlag image, in pixels
     */
    public PirateFlag(double x, double y, double width, double height){
	this(x,y,width,height,TriangularFlag.DEFAULT_WIDTH_RATIO,TriangularFlag.DEFAULT_HEIGHT_RATIO);

    }
    /**
     This constructor will draw skull and crossbones.
     @param x top left corner of the PirateFlag, x coordinate
     @param y top left corner of the PirateFlag, y coordinate
     @param width width of PirateFlag image, in pixels
     @param height height of PirateFlag iamge, in pixels
     @param flagPoleWidthRatio ratio of the width of the flag pole to the width of the flag itself
     @param flagPoleHeightRatio ratio of the height of the flag pole to the height of the flag itself
     */
    public PirateFlag(double x, double y, double width, double height,double flagPoleWidthRatio,double flagPoleHeightRatio)
    {
	super(x,y,width,height,flagPoleWidthRatio,flagPoleHeightRatio);
	//defining variables
	double fW=this.getFlagWidth();//width of flag, which doesn't include flag pole
	double fH=this.getFlagHeight();//height of flag, which doesn't include flag pole
	double fSX=this.getFlagStartX();//starting x value of flag, which doesn't include flag pole
	double fSY=this.getFlagStartY();//starting y value of flag, which doesn't include flag pole
	GeneralPath gp = this.get();
	//skull shapes
	//to clarify, fSX+fW*0.15 means 15% width to the right of the left side of the flag.
	//similarly, fSY+fH*0.40 means 40% height below the top of the flag.
	Ellipse2D.Double upperHead=new Ellipse2D.Double(fSX+fW*0.15,fSY+fH*0.20,fW*0.2,fH*0.3);
	Ellipse2D.Double lowerHead=new Ellipse2D.Double(fSX+fW*0.19,fSY+fH*0.40,fW*0.12,fH*0.22);
	Ellipse2D.Double leftEye=new Ellipse2D.Double(fSX+fW*0.18,fSY+fH*0.27,fW*0.06,fH*0.09);
	Ellipse2D.Double rightEye=new Ellipse2D.Double(fSX+fW*0.26,fSY+fH*0.27,fW*0.06,fH*0.09);
	Rectangle2D.Double mouth=new Rectangle2D.Double(fSX+fW*0.21,fSY+fH*0.54,fW*0.08,fH*0.03);
	Line2D.Double toothBorder=new Line2D.Double(fSX+fW*0.23,fSY+fH*0.54,fSX+fW*0.23,fSY+fH*0.57);
	Line2D.Double toothBorder2=new Line2D.Double(fSX+fW*0.25,fSY+fH*0.54,fSX+fW*0.25,fSY+fH*0.57);
	Line2D.Double toothBorder3=new Line2D.Double(fSX+fW*0.27,fSY+fH*0.54,fSX+fW*0.27,fSY+fH*0.57);
	//crossbones shapes
	Ellipse2D.Double upperLeftBoneTip=new Ellipse2D.Double(fSX+fW*0.15,fSY+fH*0.62,fW*0.03,fH*0.03);
	Ellipse2D.Double upperRightBoneTip=new Ellipse2D.Double(fSX+fW*0.35,fSY+fH*0.62,fW*0.03,fH*0.03);
	Ellipse2D.Double lowerLeftBoneTip=new Ellipse2D.Double(fSX+fW*0.15,fSY+fH*0.72,fW*0.03,fH*0.03);
	Ellipse2D.Double lowerRightBoneTip=new Ellipse2D.Double(fSX+fW*0.35,fSY+fH*0.72,fW*0.03,fH*0.03);
	Line2D.Double boneLine=new Line2D.Double(fSX+fW*0.165,fSY+fH*0.62,fSX+fW*0.365,fSY+fH*0.72);
	Line2D.Double boneLine2=new Line2D.Double(fSX+fW*0.165,fSY+fH*0.65,fSX+fW*0.365,fSY+fH*0.75);
	Line2D.Double boneLine3=new Line2D.Double(fSX+fW*0.165,fSY+fH*0.72,fSX+fW*0.365,fSY+fH*0.62);
	Line2D.Double boneLine4=new Line2D.Double(fSX+fW*0.165,fSY+fH*0.75,fSX+fW*0.365,fSY+fH*0.65);
	//adding all the shapes so they will be drawn
	gp.append(upperHead,false);
	gp.append(lowerHead,false);
	gp.append(leftEye,false);
	gp.append(rightEye,false);
	gp.append(mouth,false);
	gp.append(toothBorder,false);
	gp.append(toothBorder2,false);
	gp.append(toothBorder3,false);
	gp.append(upperLeftBoneTip,false);
	gp.append(upperRightBoneTip,false);
	gp.append(lowerLeftBoneTip,false);
	gp.append(lowerRightBoneTip,false);
     	gp.append(boneLine,false);
	gp.append(boneLine2,false);
	gp.append(boneLine3,false);
	gp.append(boneLine4,false);
    }    
}
