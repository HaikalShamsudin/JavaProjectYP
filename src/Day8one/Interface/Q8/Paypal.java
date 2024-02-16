package Day8one.Interface.Q8;

public class Paypal implements PaymentGateway {

    private boolean paymentSuccessful;

    @Override
    public void processPayment(double amount) {
        //simulate payment logic
        System.out.println("Processing payment Paypal: $" + amount);
        //simulate success or failure
        paymentSuccessful = Math.random() < 0.85; // 85% success rate
    }

    @Override
    public boolean isPaymentSuccesful() {
        return paymentSuccessful;
    }
    
}
