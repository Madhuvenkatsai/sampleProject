package Polymorphism;
 class PhonePay extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing" + amount + " via PhonePe.");
        }
    }

