public class Main {
    public static void main(String[] args) {
        System.out.println("Google:");
        System.out.println("-------");
        FileDownloader google = new Google();
        google.downloadFile();

        System.out.println("\nFTP:");
        System.out.println("----");
        FileDownloader ftp = new FTP();
        ftp.downloadFile();
    }
}
