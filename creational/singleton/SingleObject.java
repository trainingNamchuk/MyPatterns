package singleton;

public class SingleObject {
	private static SingleObject obj = new SingleObject();

	private SingleObject() {
	};

	public static SingleObject getObject() {
		return obj;
	}

	public void printMessage() {
		System.out.println("My Singleton pattern");
	}
}
