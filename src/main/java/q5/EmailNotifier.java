package q5;

public class EmailNotifier implements Notifier {
    public void notify(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
