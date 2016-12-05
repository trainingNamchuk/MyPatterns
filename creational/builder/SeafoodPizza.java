package builder;

/**
 * 
 * @author Sveta
 *
 */
public class SeafoodPizza extends Pizza {

	@Override
	public double price() {
		return 140.0;
	}

	@Override
	public String name() {
		return "Seafood pizza";
	}
}
