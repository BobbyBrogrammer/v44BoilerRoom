package org.example.service;

import org.example.discounts.DiscountPolicy;
import org.example.model.Customer;
import org.example.model.ShoppingCart;
import org.example.notifications.ReceiptPrinter;

public class CheckoutService {
    package org.example.service;

import org.example.discounts.DiscountPolicy;
import org.example.model.Customer;
import org.example.model.ShoppingCart;
import org.example.notifications.ReceiptPrinter;

    public class CheckoutService {
        private final DiscountPolicy discountPolicy;
        private final NotificationService notificationService;
        private final ReceiptPrinter receiptPrinter;

        public CheckoutService(DiscountPolicy discountPolicy, NotificationService notificationService,
                               ReceiptPrinter receiptPrinter) {
            this.discountPolicy = discountPolicy;
            this.notificationService = notificationService;
            this.receiptPrinter = receiptPrinter;
        }

        public void checkout(ShoppingCart cart, Customer customer) {
            if (customer == null || customer.getEmail() == null || customer.getEmail().isBlank()) {
                throw new IllegalArgumentException("Tom email adress...");
            }
            if (cart.gettotPrice() <= 0) {
                throw new IllegalArgumentException("Ogiltigt pris: tom varukorg!");
            }
        }
        double finalPrice = discountPolicy.applyDiscount(cart);
    receiptPrinter.printReceipt(finalPrice);
    notificationService.applyCustomer("Hej " + customer.getName() + "! Ditt köp gick igenom, Totalt: " +
        finalPrice + " kr");
    }


}
