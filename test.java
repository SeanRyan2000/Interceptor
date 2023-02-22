// create junit tests for the following methods
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test1() {
        CdPlayer cdPlayer = new CdPlayer();
        Button playButton = new Button(cdPlayer);
        Button stopButton = new Button(cdPlayer);

        cdPlayer.setPlayButton(playButton);
        cdPlayer.setStopButton(stopButton);
        
        // interception point
        playButton.push();
        stopButton.push();
        
        assertEquals("play", cdPlayer.getPlayButton().getButtonState());
        assertEquals("stop", cdPlayer.getStopButton().getButtonState());
    }
    
}
