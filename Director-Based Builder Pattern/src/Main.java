public class Main {
    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();

        Computer gamingPC = director.build(new GamingComputerBuilder());
        Computer officePC = director.build(new OfficeComputerBuilder());

        System.out.println("Gaming PC:");
        System.out.println("----------");
        gamingPC.displayInfo();

        System.out.println("\nOffice PC:");
        System.out.println("----------");
        officePC.displayInfo();
    }
}