package _24_Design_Patterns._11_Behavioral_Patterns;

// Describe the Observer Pattern

// Observer is a behavioral design pattern that lets you define a subscription 
// mechanism to notify multiple objects about any events that happen to the object they’re observing.

public class Observer_Pattern {
    // Don't apply pattern

    // Asume we are Apple Inc. and we have new iPhone20 release, we need to notify
    // all our customers about it.
    // But we have 10 million customers, and we need to notify all of them.
    // But we don't know how many customers in there are interested in iPhone20,
    // maybe only 0.1% of them.
    // So we need to notify only those customers who are interested in iPhone20.
    private static final int MAX_CUSTOMERS = 10000000;

    public void notifyCustomers() {

        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            System.out.println("Notify customer " + i + " about iPhone20 release.");
        }
    }

    // Apply pattern

    private static int[] customers = new int[100];

    // Customer, who is interested in iPhone20, will subscribe to the notification
    public void subscribe(int customerId) {
        customers[customerId] = 1;
    }

    // When iPhone20 is released, we will notify only those customers who are
    // interested in it
    public void notifyCustomersWithPattern() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == 1) {
                System.out.println("Notify customer " + i + " about iPhone20 release.");
            }
        }
    }
}