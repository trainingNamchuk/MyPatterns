package builder;

/**
 * 
 * @author Sveta
 *
 */
public abstract class Pizza implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract double price();
}