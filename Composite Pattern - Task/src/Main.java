public class Main {
    public static void main(String[] args) {
        File f1 = new File("File 1");
        File f2 = new File("File 2");
        File f3 = new File("File 3");
        File f4 = new File("File 4");

        Folder f5 = new Folder("Root Folder");
        f5.addFile(f1);
        f5.addFile(f2);

        Folder f6 = new Folder("Folder Inside the Root Folder");
        f6.addFile(f3);
        f6.addFile(f4);
        f5.addFile(f6);
        f5.showDetails();
    }
}