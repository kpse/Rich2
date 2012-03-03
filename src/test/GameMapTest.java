import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameMapTest {
    @Test
    public void should_construct_with_string() throws Exception {
        GameMap map = new GameMap("S0");
        assertThat(map.print(), is("S0"));
    }

    @Test
    public void should_print_player_at_second_position() throws Exception {
        GameMap map = new GameMap("S00");
        assertThat(map.print(new Player("P",1)), is("SP0"));
    }
    
}
