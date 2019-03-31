package Decorator;

public class ConcreteDecorator extends Decorator {
	
	Component component; 
	
	public ConcreteDecorator(Component c)
	{
		component = c;
	}
	

	@Override
	int cost() {
		return component.cost() + 2;
	}
}
