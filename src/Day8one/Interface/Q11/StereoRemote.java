package Day8one.Interface.Q11;

public class StereoRemote implements RemoteControl {

    @Override
    public void powerOn(String on) {
        System.out.println("Stereo is:" + on);
    }

    @Override
    public void powerOff(String off) {
        System.out.println("Stereo is:" + off);
    }

    @Override
    public void volumeUp(String up) {
        System.out.println("Stereo volume is:" + up);
    }

    @Override
    public void volumeDown(String down) {
        System.out.println("Stereo volume is:" + down);
    }
    
}
