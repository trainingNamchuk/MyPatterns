package abstract_factory;

/**
 * This class represents one of the current mobile operator
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class OperatorMTS extends MobileOperator {
	private String contract;

	public OperatorMTS(String name) {
		super(name);
		this.contract = "Available";
		// TODO Auto-generated constructor stub
	}

	public String getContract() {
		return contract;
	}

}
