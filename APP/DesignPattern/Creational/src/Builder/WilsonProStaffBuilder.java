package Builder;

/**
 * this class implements methods that have specific implementation within similar process
 * @author DKM
 *
 */
public class WilsonProStaffBuilder extends WilsonBuilder{

	@Override
	void buildHeadSize() {
		wilsonRaquet.setHeadSize("17 inch");
	}

	@Override
	void buildRaquetLength() {
		wilsonRaquet.setRaquetLength("20 inch");
	}

	@Override
	void buildFrameStiffness() {
		wilsonRaquet.setFrameStiffness("high");
	}

	@Override
	void buildHeaviness() {
		wilsonRaquet.setHeaviness("320 gram");
	}

	

}
