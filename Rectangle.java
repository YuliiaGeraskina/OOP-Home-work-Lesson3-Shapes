import java.awt.*;

import javax.swing.*;


public class Rectangle extends Shape {
	protected int a;
	protected int b;

public Rectangle(int a, int b) {
	this.a = a;
	this.b = b;
}

@Override
public double getArea() {
	return (a*b);
}

@Override
public String getShape(){
	return "Rectangle";
}

@Override
public String getShapeParametrs(){
	String s;
	s = "a:" + Integer.toString(a) + "," + " b:" + Integer.toString(b);
	return s;
}

@Override
public void Draw(){
	String element = ".";
	String line = "";
	

	line = "";
			
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
			if((i==0) || (i==a-1)){
				line = line + element;
			}
			else {
				if(j==0 || j==b-1){
					line = line + element;
				}
				else{
					line = line + " ";
				}
			}
		}
		System.out.println(line);
		line = "";
	}
}

@Override
public void DrawR() {
	
	JFrame f = new JFrame("Title");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Draw g = new Draw();
	g.setAB(this.a*10, this.b*10);
	f.add(g);
	f.setSize(400, 500);
	f.setVisible(true);

}

}
