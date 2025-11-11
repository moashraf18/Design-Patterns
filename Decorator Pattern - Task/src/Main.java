public class Main {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("Mo is happy!");

        notification = new SMSNotification(notification);
        notification.send("Mo is happy!");
    }
}