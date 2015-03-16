import java.awt.Graphics;

import javax.swing.JFrame;


public class Circle extends Shape {
	protected int r;


public Circle(int r) {
	this.r = r;
}

@Override
public double getArea() {
	return (Math.PI*r*r);
}

@Override
public String getShape(){
	return "Circle";
}

@Override
public String getShapeParametrs(){
	String s;
	s = "r:" +Integer.toString(r);
	return s;
}

@Override
public void Draw(){
}

@Override
public void DrawR() {

}


}
