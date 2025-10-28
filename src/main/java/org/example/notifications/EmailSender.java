package org.example.notifications;

public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email skickad: " + message);
    }

}
