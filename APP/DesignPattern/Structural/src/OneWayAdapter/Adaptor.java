package OneWayAdapter;


public class Adaptor extends Client {
	
	Adaptee adaptee;
	
	Adaptor(Adaptee a)
	{
		adaptee = a;
	}
	
	@Override
	void costClient() {
		adaptee.costAdaptee();
	}		
}
