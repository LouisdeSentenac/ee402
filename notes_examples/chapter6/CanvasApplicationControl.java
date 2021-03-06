package ee402;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CanvasApplicationControl extends Frame implements WindowListener, ItemListener{
	
	private CustomCanvasControl canvas;
	private Choice colorChoice;
	
	public CanvasApplicationControl(){
		super("Canvas Mouse Application");
		this.canvas = new CustomCanvasControl(250,250);
		this.add(canvas, BorderLayout.CENTER);
		
		Panel south = new Panel(new FlowLayout());
		colorChoice = new Choice();
		colorChoice.addItem("Red");
		colorChoice.addItem("Green");
		colorChoice.addItem("Blue");
		south.add(colorChoice);
		colorChoice.addItemListener(this);
		this.add(south, BorderLayout.SOUTH);
		
		this.addWindowListener(this);
		this.pack();
		this.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem().equals("Red")) canvas.setColor(Color.red);
		else if (e.getItem().equals("Green")) canvas.setColor(Color.green);
		else canvas.setColor(Color.blue);
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) { System.exit(0); }
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

	public static void main(String[] args) {
		new CanvasApplicationControl();
	}
}
