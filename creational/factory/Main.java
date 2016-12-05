package factory;

/**
 * Main class
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileTarrifFactory factory = new MobileTarrifFactory();
		System.out.println(factory.getMobileTarrif("Smartphone 3G").toString());
		System.out.println(factory.getMobileTarrif("Smart familly").toString());
	}

}
