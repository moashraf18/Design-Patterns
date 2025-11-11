public class Main {
    public static void main(String[] args) {
        System.out.println("Iron Man:");
        System.out.println("---------");
        Avengers ironMan = new IronMan();
        ironMan.actions();

        System.out.println("\nCaptain America:");
        System.out.println("----------------");
        Avengers captainAmerica = new CaptainAmerica();
        captainAmerica.actions();

        System.out.println("\nThor:");
        System.out.println("-----");
        Avengers thor = new Thor();
        thor.actions();
    }
}