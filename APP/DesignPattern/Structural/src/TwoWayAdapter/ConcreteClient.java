package TwoWayAdapter;

public class ConcreteClient implements Client{

	@Override
	public int addClient(int x, int y) {
		return x+y;
	}
}