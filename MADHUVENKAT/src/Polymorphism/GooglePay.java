package Polymorphism;
  public  class GooglePay extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing" + amount + " via Google Pay.");
        }
    }


