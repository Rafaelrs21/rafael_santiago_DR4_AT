package q5;

public class NotificationService {
    public void notifyUser(String channel, String message) {
        Notifier notifier = NotifierFactory.getNotifier(channel);
        notifier.notify(message);
    }
}

