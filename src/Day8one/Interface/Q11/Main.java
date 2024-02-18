package Day8one.Interface.Q11;

public class Main {
    public static void main(String[] args) {
        
        StereoRemote stereoRemote = new StereoRemote();
        stereoRemote.powerOn("Turn ON");
        stereoRemote.volumeUp("Increases");
        stereoRemote.volumeDown("Decreses");
        stereoRemote.powerOff("Turn OFF");
        System.out.println();

        TVRemote tvRemote = new TVRemote();
        tvRemote.powerOn("Turn ON");
        tvRemote.volumeUp("Increases");
        tvRemote.volumeDown("Decreses");
        tvRemote.powerOff("Turn OFF");

    }
}
