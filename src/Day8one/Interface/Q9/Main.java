package Day8one.Interface.Q9;

public class Main {
    public static void main(String[] args) {
        
        EmailSender emailSender = new EmailSender();
        emailSender.sendMessage("Hello");
        SmsSender smsSender = new SmsSender();
        smsSender.sendMessage("Hey Hey Hey");

    }
    
}
