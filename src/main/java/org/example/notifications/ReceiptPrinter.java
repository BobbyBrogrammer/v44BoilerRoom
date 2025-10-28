package org.example.notifications;

public class ReceiptPrinter {
    public void printReceipt(double total) {
        System.out.println("\n--- Kvitto ---");
        System.out.println("Total: " + total + " kr");
    }

}
