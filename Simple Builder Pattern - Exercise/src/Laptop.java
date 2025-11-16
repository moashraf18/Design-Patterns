public class Laptop {
    private String CPU;
    private String OS;
    private String GPU;
    private int RAM;
    private int Storage;
    private double ScreenSize;

    private Laptop (LaptopBuilder builder) {
        this.CPU = builder.CPU;
        this.OS = builder.OS;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.ScreenSize = builder.ScreenSize;
    }

    public void showDetails() {
        System.out.println("CPU: " + CPU);
        System.out.println("OS: " + OS);
        System.out.println("GPU: " + GPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage);
        System.out.println("ScreenSize: " + ScreenSize);
    }

    public static class LaptopBuilder {
        private String CPU;
        private String OS;
        private String GPU;
        private int RAM;
        private int Storage;
        private double ScreenSize;

        public LaptopBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public LaptopBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public LaptopBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public LaptopBuilder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public LaptopBuilder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        public LaptopBuilder setScreenSize(double ScreenSize) {
            this.ScreenSize = ScreenSize;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
