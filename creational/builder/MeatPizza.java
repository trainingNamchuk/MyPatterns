package builder;

/**
 * 
 * @author Sveta
 *
 */
public class MeatPizza extends Pizza {

	@Override
	public double price() {
		return 75.0;
	}

	@Override
	public String name() {
		return "Meat pizza";
	}
}