public class MealDirector {

    public Meal buildMeal(MealsBuilder meal) {
        meal.buildMainDish();
        meal.buildSideDish();
        meal.buildDrink();
        return meal.getMeal();
    }
}