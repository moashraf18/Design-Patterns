public class EmailDecorator extends NotificationDecorator{

    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String send(String msg) {
        return notification.send(msg) + " Sent via Email!";
    }
}
