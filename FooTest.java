// create a test case
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FooTest {

    @Test
    public void ensureTrackIdIsCorrect() {
        ContextObject contextObject = new ContextObject();
        contextObject.setTrackId(true);

        assertEquals(ContextObject.getTrackId(), "Taylor Swift");

    }
}