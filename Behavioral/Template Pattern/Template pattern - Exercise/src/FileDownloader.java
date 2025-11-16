public abstract class FileDownloader {

    public final void downloadFile() {
        connectToServer();
        authenticate();
        transferFile();
        disconnect();
    }

    void connectToServer() {
        System.out.println("Connecting to server...");
    }

    void disconnect() {
        System.out.println("Disconnecting from server...");
    }

    abstract void authenticate();
    abstract void transferFile();
}
