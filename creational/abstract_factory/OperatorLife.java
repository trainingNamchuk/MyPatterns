package abstract_factory;

/**
 * This class represents one of the current mobile operator
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class OperatorLife extends MobileOperator {
	private String abroad;

	public OperatorLife(String name) {
		super(name);
		this.abroad = "available";
		// TODO Auto-generated constructor stub
	}

	public String getAbroad() {
		return abroad;
	}

}
