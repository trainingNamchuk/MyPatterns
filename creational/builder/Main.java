package builder;

/**
 * 
 * @author Sveta
 *
 */
public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal MeatPizza = mealBuilder.prepareMeatPizza();
		System.out.println("Meat pizza");
		MeatPizza.showItems();
		System.out.println("Total Cost: " + MeatPizza.getCost());
		Meal SeafoodPizza = mealBuilder.prepareSeafoodPizza();
		System.out.println("Seafood pizza");
		SeafoodPizza.showItems();
		System.out.println("Total Cost: " + SeafoodPizza.getCost());
	}
}
