package edu.ucsb.cs56.drawings.ckoziol;

import javax.swing.*;

/** SimpleGui1 comes from Head First Java 2nd Edition p. 355.
    It illustrates a simple GUI with a Button that doesn't do anything yet.
    
    @author Head First Java, 2nd Edition p. 355
    @author P. Conrad (who only typed it in and added the Javadoc comments)
    @author Chet Koziol
    @version CS56, Fall 2016, UCSB
*/

public class SimpleGui1 {
    
    /** main method to fire up a JFrame on the screen
	@param args not used
    */
    
    public static void main (String[] args) {
	JFrame frame = new JFrame() ;
	
	JButton button = new JButton("Click me,ee if this is working correctly") ;
	
	java.awt.Color myColor = new java.awt.Color(255,2,0);   // R, G, B values.
	
	button.setBackground(myColor);
	button.setOpaque(true);

	myColor = new java.awt.Color(200,200,200);
	button.setForeground(myColor);
	
	frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
	frame. getContentPane() . add(button) ;
	frame. setSize(300,300) ;
	frame. setVisible(true) ;
    }
}
