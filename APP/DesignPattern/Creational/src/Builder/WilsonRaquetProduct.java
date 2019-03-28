package Builder;

/**
 * blue print for product - normally only has setter methods
 * 
 * @author DKM
 *
 */
public class WilsonRaquetProduct {
	String headSize;
	String raquetLength;
	String frameStiffness;
	String heaviness;
	
	public void setHeadSize(String headSize2)
	{
		this.headSize = headSize2;
	}
	
	public void setRaquetLength(String raquetLength2)
	{
		this.raquetLength = raquetLength2;
	}
	
	public void setFrameStiffness(String frameStiffness2)
	{
		this.frameStiffness = frameStiffness2;
	}
	
	public void setHeaviness(String heaviness2)
	{
		this.heaviness = heaviness2;
	}	
	
	public void getSpecs()
	{
		System.out.println("your new raquet is has : " + headSize + " / " +  raquetLength +  " / " + frameStiffness + " / " + heaviness);
	}
}



