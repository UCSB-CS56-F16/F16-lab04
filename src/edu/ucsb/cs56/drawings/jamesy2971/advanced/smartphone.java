package edu.ucsb.cs56.drawings.jamesy2971.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A smartphone with the screen on 
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class smartphone extends phone implements Shape
{
  
    public smartphone(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	
	double w = 0.1 * width;
	double winTop = y + 0.55 * height;
	double winHt =  0.1 * height;
	double winTop2 = y + .4 * height;
	double winTop3 = y + .25 * height;
	
	
	Rectangle2D.Double win1 =
	    new Rectangle2D.Double(x + 1.3*w, winTop, w, winHt);

	Rectangle2D.Double win2 =
	    new Rectangle2D.Double(x + 4.2*w, winTop, w, winHt);

	Rectangle2D.Double win3 =
	    new Rectangle2D.Double(x + 7.1*w, winTop, w, winHt);

       	Rectangle2D.Double win4 =
	    new Rectangle2D.Double(x + 1.3*w, winTop2, w, winHt);

	Rectangle2D.Double win5 =
	    new Rectangle2D.Double(x + 4.2*w, winTop2, w, winHt);

	Rectangle2D.Double win6 =
	    new Rectangle2D.Double(x + 7.1*w, winTop2, w, winHt);

	Rectangle2D.Double win7 =
	    new Rectangle2D.Double(x + 1.3*w, winTop3, w, winHt);

	Rectangle2D.Double win8 =
	    new Rectangle2D.Double(x + 4.2*w, winTop3, w, winHt);

	Rectangle2D.Double win9 =
	    new Rectangle2D.Double(x + 7.1*w, winTop3, w, winHt);





	
	// add the app windows to the phone's "screen"
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholePhone = this.get();
        wholePhone.append(win1, false);
        wholePhone.append(win2, false);
        wholePhone.append(win3, false);
       	wholePhone.append(win4, false);
	wholePhone.append(win5, false);
	wholePhone.append(win6, false);
       	wholePhone.append(win7, false);
	wholePhone.append(win8, false);
       	wholePhone.append(win9, false);
       
    }  
  
}
