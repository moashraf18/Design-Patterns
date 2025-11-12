public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("EMAIL");
        email.send();

        Notification sms = factory.createNotification("SMS");
        sms.send();

        Notification mail = factory.createNotification("MAIL"); // Invalid Notification Type!! Only Email and SMS.
        mail.send();
    }
}