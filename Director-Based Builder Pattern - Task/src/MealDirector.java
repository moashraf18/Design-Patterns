public class MealDirector {

    public Meal buildMeal(MealBuilder meal) {
        meal.buildMainDish();
        meal.buildDrink();
        return meal.getMeal();
    }
}