package Factory;

public class Run {
	public static void main (String [] args)
	{
		Shape rectangle = ShapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape square = ShapeFactory.getShape("square");
		square.draw();
		
	}
}
