package Factory;

public class ShapeFactory {

	/**
	 * private constructor to prevent instantiation of the class
	 */
	private ShapeFactory() {

	}

	static Shape getShape(String shape) {
		if (shape.equals("rectangle")) {
			return new Rectangle();
		} else if (shape.equals("square")) {
			return new Square();
		}
		return null;
	}
}
