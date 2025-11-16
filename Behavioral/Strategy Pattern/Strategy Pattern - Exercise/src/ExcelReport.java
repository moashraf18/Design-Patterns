public class ExcelReport implements ReportStrategy {
    @Override
    public void generateReport(String filename) {
        System.out.println("Generating Excel report: " + filename + ".xlsx");
    }
}
