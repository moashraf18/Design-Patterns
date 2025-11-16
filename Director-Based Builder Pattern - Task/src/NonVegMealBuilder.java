public class NonVegMealBuilder implements MealBuilder {
    Meal nonVegMeal = new Meal();

    @Override
    public void buildMainDish() {
        nonVegMeal.setMainDish("Non-Veg Meal");
    }

    @Override
    public void buildDrink() {
        nonVegMeal.setDrink("Non-Veg Drink");
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}