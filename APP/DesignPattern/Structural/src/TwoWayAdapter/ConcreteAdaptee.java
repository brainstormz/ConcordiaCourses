package TwoWayAdapter;

public class ConcreteAdaptee implements Adaptee{

	@Override
	public int addAdaptee(int x, int y) {
		return x+y;
	}
}
