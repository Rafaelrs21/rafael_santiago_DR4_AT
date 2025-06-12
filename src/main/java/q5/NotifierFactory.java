package q5;

public class NotifierFactory {
    public static Notifier getNotifier(String channel) {
        return switch (channel.toUpperCase()) {
            case "EMAIL" -> new EmailNotifier();
            case "SMS" -> new SmsNotifier();
            case "PUSH" -> new PushNotifier();
            default -> throw new IllegalArgumentException("Canal de notificação desconhecido: " + channel);
        };
    }
}

