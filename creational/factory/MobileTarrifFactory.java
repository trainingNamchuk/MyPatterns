package factory;

/**
 * This class represents a "factory" of mobile tariffs
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class MobileTarrifFactory {
	public Tarrif getMobileTarrif(String tarrifType) {
		if (tarrifType == null) {
			return null;
		}
		if (tarrifType.equalsIgnoreCase("Smart Familly")) {
			return  new SmartFamilly();
		}
		if (tarrifType.equalsIgnoreCase("Smartphone 3G")) {
			return new Smartphone3G();
		}
		return null;
	}
}
