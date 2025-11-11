public class PDFReport implements ReportStrategy {
    @Override
    public void generateReport(String filename) {
        System.out.println("Generating PDF report: " + filename + ".pdf");
    }
}
