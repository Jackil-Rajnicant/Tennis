import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PlayerTest {

    @Test
    public void createPlayer() {

        Player player = new Player("Jack");

        assertThat("Jack", equalTo(player.getName()));
    }

    @Test
    public void checkPlayerName() {
        Player player = new Player("Jack");

        assertThat("Jack", equalTo(player.getName()));
    }

    @Test
    public void checkPlayerScoreIsZero() {

        Player player = new Player("Jack");

        assertThat(0, equalTo(player.getActualScore()));
    }

    @Test
    public void checkPlayerScoresPoints() {
        Player player = new Player("Jack");
        player.scorePoint();
        player.scorePoint();
        assertThat(2, equalTo(player.getActualScore()));

    }

    @Test
    public void checkPlayerScoreDescription() {
        Player player = new Player("Jack");
        player.scorePoint();
        player.scorePoint();
        assertThat("Thirty", equalTo(player.getScoreDescription()));
    }

}
