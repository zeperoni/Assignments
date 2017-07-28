// Colin Bruzas
// Calls and runs ChangeMakerPanel.java
package assign4;

import javax.swing.JFrame;

public class Assign4 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Changer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ChangeMakerPanel());
		frame.pack();
		frame.setVisible(true);
	}
}

