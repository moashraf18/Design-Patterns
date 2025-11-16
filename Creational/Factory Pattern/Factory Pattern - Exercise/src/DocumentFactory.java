public class DocumentFactory {

    public Documents generateDocuments(String type) {
        if (type.equalsIgnoreCase("PDF")) {
            return new PDFDocument();
        } else if (type.equalsIgnoreCase("Word")) {
            return new WordDocument();
        }
        return null;
    }
}