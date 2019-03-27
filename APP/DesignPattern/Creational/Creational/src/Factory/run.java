package Factory;

public class run {
	
	public static void main (String [] args)
	{
		Rectangle square = ShapeFactory.getShape("square");
		Shape rectangle = ShapeFactory.getShape("rectangle");
		
	}
}
