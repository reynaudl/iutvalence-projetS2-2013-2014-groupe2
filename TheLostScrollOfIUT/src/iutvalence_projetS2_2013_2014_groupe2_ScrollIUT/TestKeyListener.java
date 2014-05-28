package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TestKeyListener implements Runnable, KeyListener {

	
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new TestKeyListener());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		System.out.println(e.getKeyChar());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run()
	{
		JFrame frame = new JFrame("testKeyListener");
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		frame.setVisible(true);
	}

}
