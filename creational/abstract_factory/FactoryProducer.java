package abstract_factory;

/**
 * This class represents an "factory producer" of mobile tariffs and mobile
 * operators
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Operator")) {
			return new MobileOperatorFactory();
		} else if (choice.equalsIgnoreCase("Tarrif")) {
			return new MobileTarrifFactory();
		}
		return null;
	}

}
