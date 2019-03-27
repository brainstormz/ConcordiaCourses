package Factory;

/**
 * normally abstract but can be interface
 * 
 * @author DKM
 *
 */
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	String shape = "rectangle";

	@Override
	void draw() {
		System.out.println(shape);
	}
}

class Square extends Rectangle {
	String shape = "square";

	void draw() {
		System.out.println(shape);
	}
}