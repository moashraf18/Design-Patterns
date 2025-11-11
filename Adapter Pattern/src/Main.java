public class Main {
    public static void print(NewPrinter Printer) {
        Printer.print();
    }

    public static void main(String[] args) {
        PrinterAdapter adapter = new PrinterAdapter();
        print(adapter);
        // adapter.print(); and remove the above fn. and it will be the same!
        /*
        public static void main(String[] args) {
        PrinterAdapter adapter = new PrinterAdapter();
        adapter.print();
         */
    }
}