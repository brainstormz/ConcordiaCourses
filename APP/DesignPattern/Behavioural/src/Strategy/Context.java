package Strategy;

public class Context {
	Strategy strat;
	
	Context(Strategy s)
	{
		strat = s;
	}
	
	public void compute()
	{
		strat.compute();
	}
	
	public void setStrategy(Strategy s)
	{
		strat = s;
	}
}
