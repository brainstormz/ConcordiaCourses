package TwoWayAdapter;

public class Adaptor implements Client, Adaptee{

	ConcreteClient c;
	ConcreteAdaptee a;
	public Adaptor(ConcreteClient client)
	{
		c = client;
	}
	public Adaptor(ConcreteAdaptee adaptee)
	{
		a = adaptee;
	}
	
	@Override
	public int addAdaptee(int x, int y) {
		return c.addClient(x,y);
	}

	@Override
	public int addClient(int x, int y) {
		return a.addAdaptee(x, y);
	}
	

}
