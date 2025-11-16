public class Main {
    public static void main(String[] args) {
        MealDirector director = new MealDirector();

        Meal vegMeal = director.buildMeal(new VegMealBuilder());
        Meal nonVegMeal = director.buildMeal(new NonVegMealBuilder());

        vegMeal.display();
        System.out.println("----------------");
        nonVegMeal.display();
    }
}