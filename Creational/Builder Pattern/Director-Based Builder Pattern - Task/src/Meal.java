public class Meal {
    private String mainDish;
    private String drink;

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void display() {
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Drink: " + drink);
    }
}