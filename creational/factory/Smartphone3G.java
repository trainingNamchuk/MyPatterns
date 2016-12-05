package factory;

/**
 * This class represents one of the current tariff in the mobile company
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class Smartphone3G extends Tarrif {

	public Smartphone3G() {
		super("Smartphone 3G");
		this.priceInternet3G = 60.0;
	}

	@Override
	public String toString() {
		return "Smartphone3G [priceInternet3G=" + priceInternet3G + " name=" +super.getName()+"]";
	}

	private Double priceInternet3G;

	public Double getPriceInternet3G() {
		return priceInternet3G;
	}

}
