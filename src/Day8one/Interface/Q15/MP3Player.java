package Day8one.Interface.Q15;

public class MP3Player implements MusicPlayer {

    private String currentSong;
    private String nextSong;

    //constructor
    public MP3Player (String currentSong, String nextSong) {
        this.currentSong = currentSong;
        this.nextSong = nextSong;
    }

    @Override
    public void play() {
       System.out.println("Playing current song.." + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Pause current song.." + currentSong);
       
    }

    @Override
    public void next() {
        playSong(nextSong);
        String temp = currentSong;
        currentSong = nextSong;
        nextSong = temp;
    }

    @Override
    public void previous() {
       String newSong = backPreviousSong();
       playSong(newSong);
       currentSong = newSong;
    }

    //MAKE ANOTHER METHOD FOR SONG NAME
    private void playSong (String songTitle){
        System.out.println("Playing next song.." + songTitle);
    }

    private String backPreviousSong() {
        
    }
    
}
