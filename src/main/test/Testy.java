import emily.command.administrative.*;
import emily.games.blackjack.Blackjack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testy {
    @Test
    public void testGetCommandEqualsAutoReply(){
        AutoReplyCommand sut = new AutoReplyCommand();
        assertEquals("autoreply",sut.getCommand());
    }
    @Test
    public void testGetCommandKickCommand()
    {
        KickCommand sut = new KickCommand();
        assertEquals("kick",sut.getCommand());
    }
    @Test
    public void testaGetCommandBanCommand()
    {
        BanCommand sut = new BanCommand();
        assertEquals("ban", sut.getCommand());
    }
    @Test
    public void testAutoReplyGetDescription()
    {
        AutoReplyCommand sut = new AutoReplyCommand();
        assertEquals("regular expression Patterns where the bot auto-replies to. ", sut.getDescription());
    }
}
