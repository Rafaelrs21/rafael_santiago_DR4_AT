package q5;


public class SmsNotifier implements Notifier {
    public void notify(String message) {
        System.out.println("Sending SMS: " + message);
    }
}