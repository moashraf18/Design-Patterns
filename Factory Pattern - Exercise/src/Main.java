public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Documents pdf = factory.generateDocuments("PDF");
        pdf.generate();

        Documents word = factory.generateDocuments("Word");
        word.generate();
    }
}