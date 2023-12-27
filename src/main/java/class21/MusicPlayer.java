package class21;
/*  Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume. Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer, each with their unique implementations of
the play() method (e.g., streaming from the internet, playing from a CD).
 */
public abstract class MusicPlayer {

    protected String currentTrack;
    protected int volume;

    public abstract void play();
    public void pause() {
        System.out.println("The music is paused");
    }
public void stop() {
    System.out.println("The music stoped");
}
    public void musicInfo() {
        System.out.println(currentTrack + " " + volume);
    }
    }
class MP3Player extends MusicPlayer {
    @Override

    public void play() {
        System.out.println("Playing from MP3 file");
    }
}
class CDPlayer extends MusicPlayer{
    @Override
    public void play(){
        System.out.println("Playing from CD");
    }
}
class StreamingPlayer extends MusicPlayer{

    @Override
    public void play(){
        System.out.println("Streaming from the internet");
    }
}
