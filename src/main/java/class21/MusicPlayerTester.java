package class21;

public class MusicPlayerTester {

    public static void main(String[] args) {
        MusicPlayer mp3Player = new MP3Player();
        mp3Player.currentTrack = "Song1.mp3";
        mp3Player.volume = 75;

        MusicPlayer cdPlayer = new CDPlayer();
        cdPlayer.currentTrack = "Track2";
        cdPlayer.volume = 80;

        MusicPlayer streamingPlayer = new StreamingPlayer();
        streamingPlayer.currentTrack = "Streaming Song";
        streamingPlayer.volume = 90;

        System.out.println("------ MP3 Player ------");
        mp3Player.play();
        mp3Player.musicInfo();
        mp3Player.pause();
        mp3Player.stop();

        System.out.println("------ CD Player ------");
        cdPlayer.play();
        cdPlayer.musicInfo();
        cdPlayer.pause();
        cdPlayer.stop();

        System.out.println("\n------ Streaming Player ------");
        streamingPlayer.play();
        streamingPlayer.musicInfo();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}

