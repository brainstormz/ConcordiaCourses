package OneWayAdapter;

public class Run {
	public static void main (String [] args)
	{
		Client client = new Adaptor(new Adaptee());
		client.costClient();
	}
	
}
