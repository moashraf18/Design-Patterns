public class ReportGenerator {
    private ReportStrategy reportStrategy;

    public ReportGenerator(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }
    public void generateReport(String filename){
        reportStrategy.generateReport(filename);
    }
}
