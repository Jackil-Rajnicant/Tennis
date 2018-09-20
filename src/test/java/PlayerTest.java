import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PlayerTest {


    private Player createPlayer() {

        return new Player("Jack");

    }

    @Test
    public void checkPlayerName() {
        Player player = createPlayer();

        assertThat("Jack", equalTo(player.getName()));
    }

    @Test
    public void checkPlayerScoreIsZero() {

        Player player = createPlayer();

        assertThat(0, equalTo(player.getActualScore()));
    }

    @Test
    public void checkPlayerScoresPoints() {
        Player player = createPlayer();
        player.scorePoint();
        player.scorePoint();
        assertThat(2, equalTo(player.getActualScore()));

    }

    @Test
    public void checkPlayerScoreDescription() {
        Player player = createPlayer();
        player.scorePoint();
        player.scorePoint();
        assertThat("Thirty", equalTo(player.getScoreDescription()));
    }

}
