import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    @org.junit.Test
    public void should_init_with_map() throws Exception {
        Game game = new Game(new GameMap(GameMap.START_POINT));
        assertThat(game.print(), is(GameMap.START_POINT));
    }

    @Test
    public void should_add_player() throws Exception {
        Game game = new Game(new GameMap("S00"));
        game.add(new Player("P"));
        assertThat(game.print(), is("P00"));
    }

    @Test
    public void should_prompt() throws Exception {
        Game game = new Game(new GameMap("S00"));
        Player player = new Player("P");
        game.add(player);
        assertThat(game.promptCommands(), is("roll\nhelp\nquit\n"));
        game.execCommand("roll");
        assertThat(game.print(), is("SP0"));
        assertThat(game.promptBuyOrNot(), is("200 yuan, buy?[Y/N]"));
        game.execCommand("Y");
        assertThat(game.execCommand("query"), is("property position: 1"));

    }


}
