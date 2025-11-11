public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String send(String msg) {
        return notification.send(msg) + " Sent via SMS!";
    }
}
