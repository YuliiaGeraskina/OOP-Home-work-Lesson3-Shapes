import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.*;


public class Draw extends JPanel{
	protected int a;
	protected int b;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);

		g.drawRect(25, 25, this.a, this.b);
	}

	public void setAB(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
