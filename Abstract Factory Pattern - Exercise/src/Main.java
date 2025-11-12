import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GamingFactory factory;
        System.out.println("=== Hello in Gaming Platform ===");
        while (true) {
            System.out.println("\nChoose Platform:");
            System.out.println("----------------");
            System.out.println("1- Playstation");
            System.out.println("2- Xbox");
            System.out.println("3- Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                factory = new PlayStationFactory();
            } else if (choice == 2) {
                factory = new XboxFactory();
            } else if (choice == 3) {
                System.out.println("\nExiting Program. Thank you for using it!");
                return;
            } else {
                System.out.println("Invalid Choice!");
                continue;
            }

            GameController controller = factory.createController();
            GameDisc disc = factory.createDisc();
            controller.controller();
            disc.startGame();
        }
    }
}