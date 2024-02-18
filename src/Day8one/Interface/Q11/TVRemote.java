package Day8one.Interface.Q11;

public class TVRemote implements RemoteControl {

    @Override
    public void powerOn(String on) {
        System.out.println("TV is:" + on);
    }

    @Override
    public void powerOff(String off) {
        System.out.println("TV is:" + off);
    }

    @Override
    public void volumeUp(String up) {
        System.out.println("TV volume is:" + up);
    }

    @Override
    public void volumeDown(String down) {
        System.out.println("TV volume is:" + down);
    }
    
}
