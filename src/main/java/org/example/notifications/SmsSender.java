package org.example.notifications;

public class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS skickad: " + message);
    }

}
