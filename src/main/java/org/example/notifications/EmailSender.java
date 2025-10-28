package org.example.notifications;

public class EmailSender implements MessageSender {
    @Override
    public void send(String to, String message) {
        System.out.println("Email skickad till:  " + to + " med meddelande: " + message);
    }

}
