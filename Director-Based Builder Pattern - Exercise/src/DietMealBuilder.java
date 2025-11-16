public class DietMealBuilder implements  MealsBuilder {
    private Meal deitMeal = new Meal();

    @Override
    public void buildMainDish() {
        deitMeal.setMainDish("Grilled Chicken");
    }

    @Override
    public void buildSideDish() {
        deitMeal.setSideDish("Vegetables");
    }

    @Override
    public void buildDrink() {
        deitMeal.setDrink("Water");
    }

    @Override
    public Meal getMeal() {
        return deitMeal;
    }
}