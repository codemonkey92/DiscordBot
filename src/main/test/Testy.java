
import emily.command.administrative.*;
import emily.command.administrative.AutoReplyCommand;
import emily.command.fun.BlackJackCommand;
import emily.command.fun.CatFactCommand;
import emily.command.fun.EightballCommand;
import emily.command.fun.EmojifyCommand;
<<<<<<< HEAD
=======

>>>>>>> 8b14f32ceb0abf8803adc671cccb9ac19e7ca008
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testy {
    @Test
    public void testGetCommandEqualsAutoReply(){
        AutoReplyCommand sut = new AutoReplyCommand();
        assertEquals("autoreply",sut.getCommand());
    }

    @Test
    public void testAutoReplyGetDescription() {
        AutoReplyCommand sut = new AutoReplyCommand();
        assertEquals("regular expression Patterns where the bot auto-replies to. ", sut.getDescription());
    }

    @Test
    public void testGetCommandBan(){
        BanCommand sut = new BanCommand();
        assertEquals("ban",sut.getCommand());
    }

    @Test
    public void testBanGetDescription() {
        BanCommand sut = new BanCommand();
        assertEquals("bans a member from your guild", sut.getDescription());
    }

    @Test
    public void testGetCaseCommand() {
        CaseCommand sut = new CaseCommand();
        assertEquals("case", sut.getCommand());
    }

    @Test
    public void testCaseCommandDescription() {
        CaseCommand sut = new CaseCommand();
        assertEquals("Moderate the mod-cases", sut.getDescription());
    }

    @Test
    public void testGetCommandAdminCommand()
    {
        CommandAdminCommand sut = new CommandAdminCommand();
        assertEquals("commandadmin",sut.getCommand());
    }
    @Test
    public void testCommandAdminCommandDescription()
    {
        CommandAdminCommand sut = new CommandAdminCommand();
        assertEquals("Commands can be enabled/disabled through this command.\n" +
                "A channel specific setting will always override the guild setting \n\n" +
                "You can also give/deny permission to roles to use certain commands", sut.getDescription());
    }

    @Test
    public void testGetConfigCommand()
    {
        ConfigCommand sut = new ConfigCommand();
        assertEquals("config",sut.getCommand());
    }
    @Test
    public void testConfigCommandDescription()
    {
        ConfigCommand sut = new ConfigCommand();
        assertEquals("Gets/sets the configuration of the bot", sut.getDescription());
    }
    @Test
    public void testGetCustomCommand()
    {
        CustomCommand sut = new CustomCommand();
        assertEquals("command",sut.getCommand());
    }
    @Test
    public void testCustomCommandDescription()
    {
        CustomCommand sut = new CustomCommand();
        assertEquals("Add and remove custom commands.\n" +
                "There are a few keywords you can use in commands. These tags will be replaced by its value \n\n" +
                "Key                Replacement\n" +
                "---                ---\n" +
                "%user%             Username \n" +
                "%args%             everything the user said besides the command \n" +
                "%arg1%             the first argument of the user \n" +
                "%arg9%             the 9th argument etc. a new argument starts after a space \n" +
                "%user-mention%     Mentions user \n" +
                "%user-id%          ID of user\n" +
                "%nick%             Nickname\n" +
                "%discrim%          discrim\n" +
                "%guild%            Guild name\n" +
                "%guild-id%         guild id\n" +
                "%guild-users%      amount of users in the guild\n" +
                "%channel%          channel name\n" +
                "%channel-id%       channel id\n" +
                "%channel-mention%  Mentions channel\n" +
                "%rand-user%        random user in guild\n" +
                "%rand-user-online% random ONLINE user in guild", sut.getDescription());
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
