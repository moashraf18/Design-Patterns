public class Main {
    public static void main(String[] args) {

        Subject YouTubeChannel = new YouTubeChannel();
        Observer s1 = new Subscriber("Mohamed Ashraf Taha");
        Observer s2 = new Subscriber("Mohamed Ashraf Mahmoud");
        Observer s3 = new Subscriber("Moamen Wael Saber");

        YouTubeChannel.subscribe(s1, "Mohamed Ashraf Taha");
        YouTubeChannel.subscribe(s2, "Mohamed Ashraf Mahmoud");
        YouTubeChannel.subscribe(s3, "Moamen Wael Saber\n");

        YouTubeChannel.unsubscribe(s1, "Mohamed Ashraf Taha\n");

        YouTubeChannel.notifyObservers("New Observer Design Pattern video Uploaded!");
    }
}