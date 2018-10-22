import emily.command.administrative.AutoReplyCommand;
import emily.command.fun.BlackJackCommand;
import emily.command.fun.CatFactCommand;
import emily.command.fun.EightballCommand;
import emily.command.fun.EmojifyCommand;
import emoji4j.Emoji;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testy {
    @Test
    public void testGetCommandEqualsAutoReply(){
        AutoReplyCommand sut = new AutoReplyCommand();
        assertEquals("autoreply",sut.getCommand());
    }

    @Test
    public void testGetCommandEqualsBlackjack(){
        BlackJackCommand sut = new BlackJackCommand();
        assertEquals("blackjack", sut.getCommand());
    }

    @Test
    public void testGetCommandEqualsCatFact(){
        CatFactCommand sut = new CatFactCommand();
        assertEquals("catfact", sut.getCommand());
    }

    @Test
    public void testGetCommandEquals8ball(){
        EightballCommand sut = new EightballCommand();
        assertEquals("8ball", sut.getCommand());
    }

    @Test
    public void testGetCommandEqualsEmojify(){
        EmojifyCommand sut = new EmojifyCommand();
        assertEquals("emojify", sut.getCommand());
    }
}
