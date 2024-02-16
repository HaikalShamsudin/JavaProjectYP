package Day8one.Interface.Q9;

public class SmsSender implements MessageSender {

    @Override
    public void sendMessage(String sms) {
        System.out.println("Sending SMS:" + sms);
    }
    
}
