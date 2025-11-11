public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    void addExtras() {
        System.out.println("Adding lemon...");
    }
}
