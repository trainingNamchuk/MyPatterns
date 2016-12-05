package abstract_factory;

/**
 * This class represents one of the current tariff in the mobile company
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class SmartFamilly extends Tarrif {

	public SmartFamilly() {
		super("Smart Familly");
		this.numberOfUsers = new Integer(3);
	}

	private Integer numberOfUsers;

	public Double getNumberOfUsers() {
		return numberOfUsers.doubleValue();
	}

	@Override
	public String toString() {
		return "SmartFamilly [numberOfUsers=" + numberOfUsers + " name=" + super.getName() + "]";
	}

}
