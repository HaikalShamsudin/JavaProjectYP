package Day8one.Interface.Q8;

public class Main {
    
    public static void main(String[] args) {
        
       
        // Create instances of payment gateways
        PaymentGateway paypalGateway = new Paypal();
        PaymentGateway stripeGateway = new Stripe();

        // Test payments through different gateways
        processPayment(paypalGateway, 100.0);
        processPayment(stripeGateway, 150.0);
    }

    // Method to test payment processing
    private static void processPayment(PaymentGateway gateway, double amount) {
        // Process payment
        gateway.processPayment(amount);

        // Check if payment was successful
        if (gateway.isPaymentSuccesful()) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please try again.");
        }

        System.out.println();
    }
    
}
