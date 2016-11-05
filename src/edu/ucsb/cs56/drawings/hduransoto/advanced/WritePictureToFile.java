package edu.ucsb.cs56.drawings.hduransoto.advanced;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 *  A class with a main method that can write a drawing to a graphics file.
 *
 *  @author P. Conrad,
 *  @version for CS56, W16, UCSB
 */

public class WritePictureToFile
{
    public static void usage()
    {
	System.out.println("Usage: java WritePictureToFile whichImage mypic");
	// @@@ modify the next line to describe your picture
	System.out.println(" whichImage should be 1,2 or 3");
	System.out.println(" whichImage chooses from drawPicture1, 2 or 3");
	System.out.println(" .png gets added to the filename");
	System.out.println("  e.g. if you pass mypic, filename is mypic.png");
	System.out.println("Example: java WritePictureToFile 3 foo");
	System.out.println(" produces foo.png from drawPicture3");
    }
    
    /** Write the chosen picture to a file.
     *
     * @param args  command line arguments
     */

   public static void main(String[] args)
   {
       if (args.length != 2) {
	   usage();
	   System.exit(1);
       }
       
       String whichPicture = args[0]; // first command line arg is 1, 2, 3
       String outputfileName = args[1]; // second command line arg is which pic
       
       final int WIDTH = 640;
       final int HEIGHT = 480;
       
       // create a new image
       // TYPE_INT_ARGB is "RGB image" with transparency (A = alpha channel)
       
       BufferedImage bi =
	   new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
       
       Graphics2D g2 = bi.createGraphics();
       
       if (whichPicture.equals("1")) {
	   AllMyDrawings.drawPicture1(g2);
       } else if (whichPicture.equals("2")) {
	   AllMyDrawings.drawPicture2(g2);
       } else if (whichPicture.equals("3")) {
	   AllMyDrawings.drawPicture3(g2);
       }
       
       final String imageType = "png"; // choices: "gif", "png", "jpg"

       // We must declare this variable outside the try block,
       // so we can see it inside the catch block
       
       String fullFileName = "";
       
       try {
	   fullFileName = outputfileName + "." + imageType; 
	   File outputfile = new File(fullFileName); 
	   ImageIO.write(bi, imageType, outputfile); // actually writes file
	   System.out.println("I created " + fullFileName); // tell the user
       } catch (IOException e) {
	   System.err.println("Sorry, an error occurred--I could not create "
			      + fullFileName 
			      +"\n The error was: "
			      + e.toString());
     }              
   }
}
