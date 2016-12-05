package abstract_factory;

/**
 * This class represents a "factory" of mobile operators
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class MobileOperatorFactory extends AbstractFactory {
	@Override
	public MobileOperator getMobileOperator(String tarrifType) {
		if (tarrifType == null) {
			return null;
		}
		if (tarrifType.equalsIgnoreCase("Life")) {
			return new OperatorLife("Life");
		}
		if (tarrifType.equalsIgnoreCase("MTS")) {
			return new OperatorMTS("MTS");
		}
		return null;
	}

	@Override
	Tarrif getMobileTarrif(String tarrif) {
		// TODO Auto-generated method stub
		return null;
	}

}
