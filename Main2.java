import java.awt.Point;
import java.awt.Graphics;
import javax.swing.*;
public class Main2 {
	public static void main(String[] args) {
		Shape[] list = { 
				new Rectangle(2+(int)(Math.random() * 4), 2+(int)(Math.random() * 7)),
				new Rectangle(2+(int)(Math.random() * 4), 2+(int)(Math.random() * 7)),
				new Rectangle(2+(int)(Math.random() * 4), 2+(int)(Math.random() * 7))
		};

		
//		JFrame f = new JFrame("Title");
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Draw g = new Draw();
//		g.setAB(20, 50);
//		f.add(g);
//		f.setSize(400, 500);
//		f.setVisible(true);

		StringBuilder sb;
		double AreaRect = 0;
		for (Shape s : list) {
			sb = new StringBuilder();
			sb.append(s.getShape());
			sb.append("[" + s.getShapeParametrs() + "]");
			sb.append(": ");
			sb.append(s.getArea());

			System.out.println(sb.toString());

			if (s.getShape() == "Rectangle") {
				AreaRect = s.getArea() + AreaRect;
			}
			
			s.Draw();
			s.DrawR();
			System.out.println("");
		}
		System.out.println("Summary area of all Rectangles: " + AreaRect);
	
	}

}
