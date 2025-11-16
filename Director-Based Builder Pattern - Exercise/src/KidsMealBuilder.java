public class KidsMealBuilder implements MealsBuilder {
    private Meal kidsMeal = new Meal();

    @Override
    public void buildMainDish() {
        kidsMeal.setMainDish("Chicken Nuggets");
    }

    @Override
    public void buildSideDish() {
        kidsMeal.setSideDish("Fries");
    }

    @Override
    public void buildDrink() {
        kidsMeal.setDrink("Juice Box");
    }

    @Override
    public Meal getMeal() {
        return kidsMeal;
    }
}