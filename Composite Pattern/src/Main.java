public class Main {
    public static void main(String[] args) {

        // Files
        File f1 = new File("Resume.docx");
        File f2 = new File("Report.pdf");
        File f3 = new File("photo1.png");
        File f4 = new File("photo2.jpg");

        // Folders
        Folder documents = new Folder("Documents");
        documents.addComponent(f1);
        documents.addComponent(f2);

        Folder pictures = new Folder("Pictures");
        pictures.addComponent(f3);
        pictures.addComponent(f4);

        Folder root = new Folder("Root");
        root.addComponent(documents);
        root.addComponent(pictures);

        // Display all contents
        root.showDetails();
    }
}