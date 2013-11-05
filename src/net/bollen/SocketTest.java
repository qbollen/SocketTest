package net.bollen;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SocketTest
{
	private JFrame frame;
	
	public SocketTest()
	{
		frame = new JFrame("SocketTest");
		frame.setBounds(100,100,800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new SocketTest();
			}
		});
	}
}
