import emily.command.administrative.AutoReplyCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testy {
    @Test
    public void testGetCommandEqualsAutoReply(){
        AutoReplyCommand sut = new AutoReplyCommand();
        assertEquals("autoreply",sut.getCommand());
    }
}
