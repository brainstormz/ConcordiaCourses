package Factory;

abstract class Shape {
	abstract void draw();
}

class Square extends Rectangle {

	void draw() {
		System.out.println("draw square");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("draw rectangle");

	}

}