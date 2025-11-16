public class Main {
    public static void main(String[] args) {

        MealDirector director = new MealDirector();

        Meal kidsMeal = director.buildMeal(new KidsMealBuilder());
        Meal regularMeal = director.buildMeal(new RegularMealBuilder());
        Meal dietMeal = director.buildMeal(new DietMealBuilder());

        System.out.println("Kids Meal:");
        System.out.println("----------");
        kidsMeal.displayMeal();

        System.out.println("\nRegular Meal:");
        System.out.println("-------------");
        regularMeal.displayMeal();

        System.out.println("\nDiet Meal:");
        System.out.println("----------");
        dietMeal.displayMeal();
    }
}