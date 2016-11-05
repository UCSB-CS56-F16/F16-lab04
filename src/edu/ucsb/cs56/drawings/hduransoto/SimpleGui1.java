package edu.ucsb.cs56.drawings.hduransoto;

import javax.swing.*;
/**    
    @author Head First Java, 2nd Edition p. 355
    @author P. Conrad (who only typed it in and added the Javadoc comments)
    @author Hernan Duran Soto
    @version CS56, Fall 2016, UCSB
*/

public class SimpleGui1 {
    
    /** main method to fire up a JFrame on the screen
	@param args not used
    */
    
    public static void main (String[] args) {
	JFrame frame           = new JFrame() ;
	JButton button         = new JButton("Do Not Click Here!") ;
	java.awt.Color myColor = new java.awt.Color(203,000,000);
	
	button.setBackground(myColor);
	button.setOpaque(true);
	
	frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
	frame. getContentPane() . add(button) ;
	frame. setSize(300,300) ;
	frame. setVisible(true) ;
    }
}
