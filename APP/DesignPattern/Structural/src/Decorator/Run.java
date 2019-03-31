package Decorator;

public class Run {
	public static void main (String [] args)
	{
		Component c = new ConcreteComponent();
		System.out.println(c.cost());

		c = new ConcreteDecorator(c);
		System.out.println(c.cost());
		
		c = new ConcreteDecorator1(c);
		System.out.println(c.cost());
		
	}
}
