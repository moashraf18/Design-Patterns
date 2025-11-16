public class Main {
    public static void main(String[] args) {
        System.out.println("Making Tea:");
        System.out.println("-----------");
        
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nMaking Coffee:");
        System.out.println("--------------");

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
