
import java.awt.*;
public abstract class Shape {
	protected String name;
	public Shape() {
		
	}
	
	
	public abstract double getArea();
	
	public abstract String getShape();

	public abstract String getShapeParametrs();

	public abstract void Draw();
	
	public abstract void DrawR();
}
