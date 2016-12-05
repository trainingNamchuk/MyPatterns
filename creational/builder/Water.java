package builder;

/**
 * 
 * @author Sveta
 *
 */
public abstract class Water implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract double price();
}
