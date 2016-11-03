package edu.ucsb.cs56.drawings.youxinjie.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A phone with App Icons

   @author Xinjie You 
   @version for CS56, F16, UCSB
*/
public class PhoneWithAppIcon extends phone implements Shape
{
    public PhoneWithAppIcon(double x, double y, double width, double height)
    {
	// construct the basic phone shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	double w = 0.1625 * width;
	double iconTop = y + 0.08 * height;
	double iconHt =  0.2 * height;
	
	Rectangle2D.Double icon1 =
	    new Rectangle2D.Double(x + 0.1*width, iconTop, w, w);
	Rectangle2D.Double icon2 =
	    new Rectangle2D.Double(x + 0.3125*width, iconTop, w, w);
	Rectangle2D.Double icon3 =
	    new Rectangle2D.Double(x + 0.525*width, iconTop, w, w);
	Rectangle2D.Double icon4 =
	    new Rectangle2D.Double(x + 0.7375*width, iconTop, w, w);
	Rectangle2D.Double icon5 =
	    new Rectangle2D.Double(x + 0.1*width, iconTop + 0.1625*width +0.05*height , w, w);
	Rectangle2D.Double icon6 =
	    new Rectangle2D.Double(x + 0.3125*width, iconTop + 0.1625*width +0.05*height , w, w);
	Rectangle2D.Double icon7 =
	    new Rectangle2D.Double(x + 0.525*width, iconTop + 0.1625*width +0.05*height , w, w);
	Rectangle2D.Double icon8 =
	    new Rectangle2D.Double(x + 0.7375*width, iconTop + 0.1625*width +0.05*height , w, w);
	Rectangle2D.Double icon9 =
	    new Rectangle2D.Double(x + 0.1*width, iconTop + 0.325*width +0.1*height , w, w);
	Rectangle2D.Double icon10 =
	    new Rectangle2D.Double(x + 0.3125*width, iconTop + 0.325*width +0.1*height , w, w);
	Rectangle2D.Double icon11 =
	    new Rectangle2D.Double(x + 0.525*width, iconTop + 0.325*width +0.1*height , w, w);
	Rectangle2D.Double icon12 =
	    new Rectangle2D.Double(x + 0.7375*width, iconTop + 0.325*width +0.1*height , w, w);
	

	// add the icons to the phone
	
        GeneralPath wholephone = this.get();
        wholephone.append(icon1, false);
        wholephone.append(icon2, false);
        wholephone.append(icon3, false); 
        wholephone.append(icon4, false);
        wholephone.append(icon5, false);
        wholephone.append(icon6, false);
        wholephone.append(icon7, false); 
        wholephone.append(icon8, false); 
        wholephone.append(icon9, false);
        wholephone.append(icon10, false); 
        wholephone.append(icon11, false); 
        wholephone.append(icon12, false);
       
    }    
}
