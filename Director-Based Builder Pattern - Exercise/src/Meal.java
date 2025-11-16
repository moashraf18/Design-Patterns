public class Meal {
    private String mainDish;
    private String sideDish;
    private String drink;

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void displayMeal() {
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Drink: " + drink);
    }
}