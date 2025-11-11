public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing the coffee...");
    }

    @Override
    void addExtras() {
        System.out.println("Adding milk and sugar...");
    }
}
