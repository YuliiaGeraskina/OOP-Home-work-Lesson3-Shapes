import java.awt.Graphics;



public class Triangle extends Shape {
	protected int a;
	protected int b;
	protected int c;
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	


public double getArea() {
	int p=a+b+c;
	return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
}

@Override
public String getShape(){
	return "Triangle";
}

@Override
public String getShapeParametrs(){
	String s;
	s = "a:" + Integer.toString(a) + "," + " b:" + Integer.toString(b) + "," + " c:" + Integer.toString(c);
	return s;
}

@Override
public void Draw(){
}

@Override
public void DrawR() {

}

}
