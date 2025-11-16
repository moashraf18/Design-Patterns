public class Main {
    public static void main(String[] args) {
        ReportStrategy pdf = new PDFReport();
        ReportStrategy excel = new ExcelReport();

        ReportGenerator generator = new ReportGenerator(pdf);
        generator.generateReport("Assignment");

        generator = new ReportGenerator(excel);
        generator.generateReport("Project Tasks");
    }
}
