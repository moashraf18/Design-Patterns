public class RegularMealBuilder implements  MealsBuilder {
    private Meal regularMeal = new Meal();

    @Override
    public void buildMainDish() {
        regularMeal.setMainDish("Beef Burger");
    }

    @Override
    public void buildSideDish() {
        regularMeal.setSideDish("Salad");
    }

    @Override
    public void buildDrink() {
        regularMeal.setDrink("Soda");
    }

    @Override
    public Meal getMeal() {
        return regularMeal;
    }
}