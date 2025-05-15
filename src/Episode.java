public class Episode {
    int seriesNumber;
    int episodeNumber;

    void play() {
        System.out.println("Playing episode " + episodeNumber + " of series " + seriesNumber);
    }

    void SkipIntro() {
        System.out.println("Skipping intro");
    }

    void SkipToNext() {
        System.out.println("Skipping to next episode");
    }
}

class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 1;

        episode.play();
        episode.SkipIntro();
        episode.SkipToNext();
    }
}
