package org.example.notifications;

public class SmsSender implements MessageSender {
    @Override
    public void send(String to, String message) {
        System.out.println("SMS skickad till: " + to + " med meddelande:  " + message);
    }

}
