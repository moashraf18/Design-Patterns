public class WhatsAppDecorator extends NotificationDecorator {

    public WhatsAppDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String send(String msg) {
        return notification.send(msg) + " Sent via WhatsApp!";
    }
}
