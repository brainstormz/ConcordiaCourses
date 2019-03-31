package Decorator;

public class ConcreteComponent extends Component {
	
	String description = "componentA";
	
	@Override
	int cost() {
		return 1;
	}
	
}
