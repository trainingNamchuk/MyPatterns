package abstract_factory;

public abstract class MobileOperator {
	private String name;

	public MobileOperator(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
