
/**
 * director is normally the one that tells builders to create a product. 
 * Director basically has 3 methods:
 * 1) setBuilder - to know which builder he is working with
 * 2) createProduct - given that the director knows which builder he is working with, he can now
 * 					use order builders to create different parts for the product
 * 3) getProduct - gets the final product
 */

package Builder;

public class WilsonDirector {
	WilsonBuilder builder;

	
	public void setBuilder(WilsonBuilder b)
	{
		builder = b;
	}
	
	public WilsonRaquetProduct getRaquet()
	{
		return builder.getRaquet();
	}
	
	public void constructRaquet()
	{
		builder.createNewRaquet();
		builder.buildFrameStiffness();
		builder.buildHeadSize();
		builder.buildRaquetLength();
		builder.buildHeaviness();
	}
}
