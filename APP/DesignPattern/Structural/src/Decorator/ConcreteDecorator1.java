package Decorator;

public class ConcreteDecorator1 extends Decorator {
	
	Component component; 
	
	public ConcreteDecorator1(Component c)
	{
		component = c;
	}
	
	@Override
	int cost() {
		return component.cost() + 3;
	}
}
