public class Main {
	public static void main(String[] args) {
		Shape[] list = {
				new Rectangle(1+(int)(Math.random() * 50), 1+(int)(Math.random() * 50)),
				new Rectangle(1+(int)(Math.random() * 50), 1+(int)(Math.random() * 50)),
				new Triangle(1+(int)(Math.random() * 50), 1+(int)(Math.random() * 50), 1+(int)(Math.random() * 50)),
				new Circle(1+(int)(Math.random() * 50))		
		};
		

		StringBuilder sb;
		double Areas = 0;
		double AreaRect = 0;
		double AreaTriangle = 0;
		double AreaCircle = 0;
		for (Shape s : list) {
			sb = new StringBuilder();
			sb.append(s.getShape());
			sb.append("[" + s.getShapeParametrs() + "]");
			sb.append(": ");
			sb.append(s.getArea());
		
			System.out.println(sb.toString());
			
			if(s.getShape() == "Rectangle"){
				AreaRect = s.getArea() + AreaRect;
			}
			if(s.getShape() == "Triangle"){
				AreaTriangle = s.getArea() + AreaTriangle;
			}
			if(s.getShape() == "Circle"){
				AreaCircle = s.getArea() + AreaCircle;
			}
			s.Draw();

		}
		System.out.println("Summary area of all Rectangles: " + AreaRect);
		System.out.println("Summary area of all Triangles: " + AreaTriangle);
		System.out.println("Summary area of all Circles: " + AreaCircle);
		Areas = AreaRect + AreaTriangle + AreaCircle;
		System.out.println("Summary area of all shapes: " + Areas);
	}
		

	
}
