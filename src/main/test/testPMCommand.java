import emily.command.administrative.PMCommand;
import emily.handler.SecurityHandler;
import emily.main.DiscordBot;
import emily.permission.SimpleRank;
import emily.templates.Template;
import emily.templates.Templates;
import emily.util.DisUtil;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.entities.impl.TextChannelImpl;
import net.dv8tion.jda.core.entities.impl.UserImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testPMCommand {
    PMCommand sut;

    @Mock
    DiscordBot bot = mock(DiscordBot.class, Mockito.RETURNS_DEEP_STUBS);
    UserImpl author = mock(UserImpl.class, Mockito.RETURNS_DEEP_STUBS);
    UserImpl target = mock(UserImpl.class, Mockito.RETURNS_DEEP_STUBS);
    TextChannelImpl channel = mock(TextChannelImpl.class, Mockito.RETURNS_DEEP_STUBS);
    Message inputMessage = mock(Message.class, Mockito.RETURNS_DEEP_STUBS);
    SecurityHandler security = mock(SecurityHandler.class, Mockito.RETURNS_DEEP_STUBS);

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        sut = new PMCommand();
    }

    @Ignore
    @Test
    public void givenLessThanUser_whenExecute_thenNoPermissions(){
        String[] args = {"unpleasant_peasant","I","am","away","from","the","keyboard"};

        when(author.getIdLong()).thenReturn((long) 1);

        when(security.getSimpleRank(author,channel)).thenReturn(SimpleRank.BANNED_USER);

        //when(DisUtil.findUser((TextChannel) channel, args[0])).thenReturn(target);

        when(channel.getType()).thenReturn(ChannelType.TEXT);

        when(((TextChannel) channel).getGuild().getIdLong()).thenReturn((long) 1);

        assertEquals(Templates.no_permission.formatGuild(channel),sut.execute(bot, args, channel, author, inputMessage));
    }
}
