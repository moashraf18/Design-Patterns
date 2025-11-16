public class FTP extends FileDownloader {
    @Override
    void authenticate() {
        System.out.println("Authenticating with FTP credentials...");
    }

    @Override
    void transferFile() {
        System.out.println("Downloading file from FTP server...");
    }
}
