/**
 * Created by simonhamermesh on 1/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SpecConnectionManager {

    @Test
    public void testConnectionManager_addConnection(){

        assertTrue(ConnectionManager.addConnection(1,"1") instanceof Connection );
    }





}
