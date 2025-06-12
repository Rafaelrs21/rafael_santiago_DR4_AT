package q5;

public class PushNotifier implements Notifier {
    public void notify(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}