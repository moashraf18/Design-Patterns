public class Google extends FileDownloader {
    @Override
    void authenticate() {
        System.out.println("Authenticating with Google OAuth...");
    }

    @Override
    void transferFile() {
        System.out.println("Downloading file from Google Drive...");
    }
}
