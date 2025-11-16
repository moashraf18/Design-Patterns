public class VegMealBuilder implements MealBuilder {
    Meal vegMeal = new Meal();

    @Override
    public void buildMainDish() {
        vegMeal.setMainDish("Veg Meal");
    }

    @Override
    public void buildDrink() {
        vegMeal.setDrink("Veg Drink");
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}