public abstract class Beverage {

    // Template Method
    public void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addExtras();
    }

    void boilWater() {
        System.out.println("Boiling water...");
    }

    void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Steps to be implemented by subclasses
    abstract void brew();
    abstract void addExtras();
}
