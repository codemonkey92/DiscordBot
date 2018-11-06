import emily.command.administrative.PMCommand;
import emily.handler.SecurityHandler;
import emily.main.DiscordBot;
import emily.permission.SimpleRank;
import emily.templates.Templates;
import emily.util.DisUtil;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class testPMCommand {
    PMCommand sut;

    @Mock
    DiscordBot bot;
    User author;
    User target;
    MessageChannel channel;
    Message inputMessage;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenLessThanUser_whenExecute_thenNoPermissions(){
        String[] args = {"unpleasant_peasant","I","am","away","from","the","keyboard"};

        when(bot.security.getSimpleRank(author,channel)).thenReturn(SimpleRank.BANNED_USER);

        when(DisUtil.findUser((TextChannel) channel, args[0])).thenReturn(target);

        assertEquals(Templates.no_permission.formatGuild(channel),sut.execute(bot, args, channel, author, inputMessage));
    }
}
