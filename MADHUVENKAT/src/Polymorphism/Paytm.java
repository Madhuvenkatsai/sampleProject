package Polymorphism;

    class Paytm extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing" + amount + " via Paytm.");
        }
    }
