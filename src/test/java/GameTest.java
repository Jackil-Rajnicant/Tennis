import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GameTest {

    Game game;

    @Test
    public void createTwoPlayers() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        assertThat("Jack", equalTo(playerA.getName()));

        assertThat("Josh", equalTo(playerB.getName()));
    }

    @Test
    public void PlayerAreScoresZeroThenReturnLove() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        assertThat("Love : Love", equalTo(game.getScore()));

    }

    @Test
    public void ifPlayerAScoresOneThenReturnFifteen() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();

        assertThat("Fifteen : Love", equalTo(game.getScore()));

    }

    @Test
    public void ifPlayerBScoresTwoThenReturnThirty() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();

        playerA.scorePoint();

        assertThat("Thirty : Love", equalTo(game.getScore()));
    }

    @Test
    public void ifPlayerScoresThreeThenReturnForty() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();

        assertThat("Forty : Love", equalTo(game.getScore()));

    }

    @Test
    public void checkAdvantage() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Jack Advantage.", equalTo(game.getScore()));


    }

    @Test
    public void checkDeuce() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Deuce.", equalTo(game.getScore()));

    }

    @Test
    public void checkPlayerAWon() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Jack Won.", equalTo(game.getScore()));

    }

    @Test
    public void checkPlayerBWon() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Josh Won.", equalTo(game.getScore()));

    }


    @Test
    public void checkPlayerAHasFifteenAndPlayerBHasForty() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Josh Won.", equalTo(game.getScore()));

    }

    @Test
    public void checkPlayerAHasThirtyAndPlayerBHasForty() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Josh Won.", equalTo(game.getScore()));

    }

    @Test
    public void checkPlayerAHasZeroAndPlayerBHasForty() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Josh Won.", equalTo(game.getScore()));

    }

    @Test
    public void checkNotDeuceButEqualPoint() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Thirty : Thirty", equalTo(game.getScore()));

    }

    @Test
    public void checkFifteenEqualPoints() {

        Player playerA = new Player("Jack");
        Player playerB = new Player("Josh");
        game = new Game(playerA, playerB);

        playerA.scorePoint();

        playerB.scorePoint();

        assertThat("Fifteen : Fifteen", equalTo(game.getScore()));

    }

}
