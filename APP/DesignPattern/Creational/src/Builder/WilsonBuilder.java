package Builder;


/**
 * Abstract builder has 2 concrete method for getProduct and createProduct
 * various abstract methods that depends on the class that extends this abstract class
 * 
 * 
 * @author DKM
 *
 */
abstract class WilsonBuilder {
	WilsonRaquetProduct wilsonRaquet;
				
	public WilsonRaquetProduct getRaquet() {
		return wilsonRaquet;
	}
	
	public void createNewRaquet()
	{
		wilsonRaquet = new WilsonRaquetProduct();
	}

	abstract void buildHeadSize();
	abstract void buildRaquetLength();
	abstract void buildFrameStiffness();
	abstract void buildHeaviness();

}
