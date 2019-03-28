package Builder;

public class Run {
	public static void main (String [] args)
	{
		WilsonDirector director = new WilsonDirector();
		director.setBuilder(new WilsonProStaffBuilder());
		director.constructRaquet();
		WilsonRaquetProduct raquet = director.getRaquet();
		raquet.getSpecs();	
	}
}
