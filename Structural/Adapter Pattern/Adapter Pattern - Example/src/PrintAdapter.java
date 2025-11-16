// Adapter
class PrinterAdapter implements NewPrinter {
    LegacyPrinter LegacyPrinter = new LegacyPrinter();

    @Override
    public void print() {
        LegacyPrinter.printOld();
    }
}