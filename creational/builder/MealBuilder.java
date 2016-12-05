package builder;

/**
 * 
 * @author Sveta
 *
 */
public class MealBuilder {

	public Meal prepareMeatPizza() {
		Meal meal = new Meal();
		meal.addItem(new MeatPizza());
		meal.addItem(new Still());
		return meal;
	}

	public Meal prepareSeafoodPizza() {
		Meal meal = new Meal();
		meal.addItem(new SeafoodPizza());
		meal.addItem(new Ñarbonated());
		return meal;
	}
}