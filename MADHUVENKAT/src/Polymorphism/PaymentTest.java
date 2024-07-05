package Polymorphism;
public class PaymentTest {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        PaymentMethod payment1 = new PhonePay();
        PaymentMethod payment2 = new GooglePay();
        PaymentMethod payment3 = new Paytm();

       makePayment(payment2, 100.0);
//        makePayment(payment2, 50.0);
//        makePayment(payment3, 75.0
//        payment1.processPayment(500);
//        payment2.processPayment(6000);
    }

    public static void makePayment(PaymentMethod method, double amount) {
        method.processPayment(amount);
    }
}
