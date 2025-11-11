public abstract class Avengers {
    public final void actions() {
        this.prepare();
        this.attack();
        this.defend();
    }

    void prepare() {
        System.out.println("Prepare Actions...");
    }

    void defend() {
        System.out.println("Defend Actions...");
    }
    abstract void attack();
}