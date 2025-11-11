public class Main {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();
        System.out.println(notification.send("Mo is happy!"));

        notification = new SMSDecorator(notification);
        System.out.println(notification.send("Mo is happy!"));

        notification = new EmailDecorator(notification);
        System.out.println(notification.send("Mo is happy!"));

        notification = new WhatsAppDecorator(notification);
        System.out.println(notification.send("Mo is happy!"));
    }
}