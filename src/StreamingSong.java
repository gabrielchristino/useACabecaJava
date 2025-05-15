public class StreamingSong {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}

class StrimmingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();
        song.title = "The Sound of Silence";
        song.artist = "Simon & Garfunkel";
        song.duration = 3;

        song.play();
        song.printDetails();
    }
}