public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i5");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("8GB");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("500GB HDD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}