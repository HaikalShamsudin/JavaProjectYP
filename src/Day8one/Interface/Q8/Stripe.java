package Day8one.Interface.Q8;

public class Stripe implements PaymentGateway {

    private boolean paymentSuccessful;

    @Override
    public void processPayment(double amount) {
        //simulate the payment logic
        System.out.println("Processing payment Stripe: $" + amount);
        paymentSuccessful = Math.random() < 0.95; // 95% rate success
    }

    @Override
    public boolean isPaymentSuccesful() {
        return paymentSuccessful;
    }
    
}
