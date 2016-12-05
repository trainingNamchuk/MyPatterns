package abstract_factory;

/**
 * Main class
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory tarrifFactory = FactoryProducer.getFactory("Tarrif");
		AbstractFactory operatorFactory = FactoryProducer.getFactory("Operator");
		Tarrif tarrif = tarrifFactory.getMobileTarrif("Smart familly");
		System.out.println(tarrif.toString());
		MobileOperator operator = operatorFactory.getMobileOperator("Life");
		System.out.println(operator.toString());

	}
}
