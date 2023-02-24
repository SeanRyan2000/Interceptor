public class contextObject {
    String trackId;

    public String setTrackId() {
        int trackNumber;
        trackNumber = (int)(Math.random() * 5) + 1;
        if (trackNumber == 1) {
            trackId = "Taylor Swift is playing";
        } else if (trackNumber == 2) {
            trackId = "Eminem is playing";
        } else if (trackNumber == 3) {
            trackId = "Jon Bellion is playing";
        } else if (trackNumber == 4) {
            trackId = "Beyonce is playing";
        } else if (trackNumber == 5) {
            trackId = "Dermot Kennedy is playing";
        }
        return trackId;
    }

    public String getTrackId() {
        System.out.println(trackId);
        return trackId;
    }
}