public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop.LaptopBuilder()
                .setCPU("I7 - 11800")
                .setGPU("RTX - 3050")
                .setOS("Windows")
                .setRAM(16)
                .setStorage(1024)
                .setScreenSize(19.2)
                .build();

        laptop.showDetails();
    }
}