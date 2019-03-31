package Strategy;

public class Run {
	public static void main (String [] args)
	{
		Context context = new Context(new ConcreteStrategy1());
		context.compute();
		
		context.setStrategy(new ConcreteStrategy2());
		context.compute();
		
	}
}	
