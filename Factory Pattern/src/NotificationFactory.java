public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }

        else if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }
        else {
            System.out.println("Invalid Notification Type!");
            return null;
        }
    }
}