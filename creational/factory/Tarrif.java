package factory;

/**
 * This abstract class describes general structure of mobile tariff in the
 * mobile company
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public abstract class Tarrif {
	private String name;

	public Tarrif(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
