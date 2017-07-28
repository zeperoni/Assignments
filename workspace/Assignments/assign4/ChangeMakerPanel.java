// Colin Bruzas
// Creates a panel that allows you to enter in dollars amounts and converts
// into respect dollars bills and coins

package assign4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ChangeMakerPanel extends JPanel 
{
	private JLabel inputLabel, inputLabel1, inputLabel2, inputLabel3; 
	private JLabel outputLabel,outputLabel1, outputLabel2, outputLabel3, outputLabel4 ,outputLabel5, resultLabel, nameLabel;
	private JButton push;
	private JTextField dollarsIn, changeIn;
	private Change change = new Change(0,0);
	 
	public ChangeMakerPanel () 
	{
	createComponents();
	createPanel();
	setPreferredSize(new Dimension (100, 400));
	}
	
	/**
	 * Creates panel, adds respective labels and calls the listener
	 */
	private void createPanel() 
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout (15,1));
		panel.setBorder (BorderFactory.createRaisedBevelBorder());
		
		
		push = new JButton("Make Change");
		push.addActionListener(new ButtonListener());
		
		dollarsIn = new JTextField (5);
		changeIn = new JTextField (5);
		
		add(panel);
		panel.add(inputLabel);
		panel.add(inputLabel1);
		panel.add(inputLabel2);
		panel.add(dollarsIn);
		panel.add(inputLabel3);
		panel.add(changeIn);
		panel.add(push);
		panel.add(outputLabel);
		panel.add(outputLabel1);
		panel.add(outputLabel2);
		panel.add(outputLabel3);
		panel.add(outputLabel4);
		panel.add(outputLabel5);
		panel.add(resultLabel);
		panel.add(nameLabel);
		
	}
	/**
	 * Creates the labels used in CreaPanel
	 */
	private void createComponents() 
	{
		 inputLabel = new JLabel ("Enter Dollars and cents amounts");
		 inputLabel1 = new JLabel ("then press \"Make Change\"");
		 inputLabel2 = new JLabel ("Dollars");
		 inputLabel3 = new JLabel ("Cents");
		 outputLabel = new JLabel ("Fives: " + Integer.toString (change.getFives()));
		 outputLabel1 = new JLabel ("Singles: " + Integer.toString (change.getSingles()));
		 outputLabel2 = new JLabel ("Quarters: " + Integer.toString (change.getQuarters()));
		 outputLabel3 = new JLabel ("Dimes: " + Integer.toString (change.getDimes()));
		 outputLabel4 = new JLabel ("Nickels: " + Integer.toString (change.getNickels()));
		 outputLabel5 = new JLabel ("Pennies: " + Integer.toString (change.getPennies()));
		 resultLabel = new JLabel (); 
		 nameLabel = new JLabel ("Colin Bruzas");
	}
	
	/**
	 * Button Listener and action class set
	 * Action takes input dollars and cents and call the Change class
	 * Resets respective labels to the amount of change created
	 */
	private class ButtonListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent event) 
	{
		String dolString, centString;
		int dollars, cents;
		
		dolString = dollarsIn.getText();
		centString = changeIn.getText();
		
		dollars = Integer.parseInt(dolString);
		cents = Integer.parseInt(centString);
		
		change = new Change(dollars, cents);
		change.makeChange();  
		inputLabel.setText("Enter Dollars and cents ran once");
		outputLabel.setText("Fives: " + Integer.toString (change.getFives()));
		outputLabel1.setText("Singles: " + Integer.toString (change.getSingles()));
		outputLabel2.setText("Quarters: " + Integer.toString (change.getQuarters()));
		outputLabel3.setText("Dimes: " + Integer.toString (change.getDimes()));
		outputLabel4.setText("Nickels: " + Integer.toString (change.getNickels()));
		outputLabel5.setText("Pennies: " + Integer.toString (change.getPennies()));	
	}
  }
}


