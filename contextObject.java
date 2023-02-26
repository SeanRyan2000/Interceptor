public class contextObject {
    static String trackId;

    public static String setTrackId() {
        int trackNumber;
        trackNumber = (int)(Math.random() * 5) + 1;
        if (trackNumber == 1) {
            trackId = "Taylor Swift";
        } else if (trackNumber == 2) {
            trackId = "Eminem";
        } else if (trackNumber == 3) {
            trackId = "Jon Bellion";
        } else if (trackNumber == 4) {
            trackId = "Beyonce";
        } else if (trackNumber == 5) {
            trackId = "Dermot Kennedy";
        }
        // System.out.println(trackId);
        return trackId;
    }

    public static String getTrackId() {
        // System.out.println(trackId);
        return trackId;
    }

    public static void playSong() {
        System.out.println(setTrackId() + " is playing\n");
    }

    public static void stopSong() {
        System.out.println(getTrackId() + " is stopped\n");
    }
}