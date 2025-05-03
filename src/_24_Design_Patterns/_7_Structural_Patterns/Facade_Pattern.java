package _24_Design_Patterns._7_Structural_Patterns;

// Description:
// Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

public class Facade_Pattern {
    // Don't apply pattern

    class Customer {
        public void addCustomer() {
            // Add customer logic
            System.out.println("Customer added.");
        }
    }

    // Apply pattern

    class CustomerFacade {
        public void addCustomer() {
            // Simplified interface to add customer
            System.out.println("Customer added through facade.");
        }
    }

    class Customer1 {
        private CustomerFacade facade;

        public Customer1() {
            facade = new CustomerFacade();
        }

        public void addCustomer() {
            facade.addCustomer();
        }
    }
}
