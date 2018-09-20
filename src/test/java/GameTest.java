import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GameTest {

    Game game;
    Player playerA;
    Player playerB;


    private Game beforeGameTest(){
        playerA = new Player("Jack");
        playerB = new Player("Josh");
        return new Game(playerA,playerB);
    }

    @Test
    public void createTwoPlayers() {

        game = beforeGameTest();

        assertThat("Jack", equalTo(playerA.getName()));
        assertThat("Josh", equalTo(playerB.getName()));
    }

    @Test
    public void PlayerAreScoresZeroThenReturnLove() {

        game = beforeGameTest();

        assertThat("Love : Love", equalTo(game.getScore()));

    }

    @Test
    public void ifPlayerAScoresOneThenReturnFifteen() {

        game = beforeGameTest();

        playerA.scorePoint();

        assertThat("Fifteen : Love", equalTo(game.getScore()));

    }

    @Test
    public void ifPlayerBScoresTwoThenReturnThirty() {

        game = beforeGameTest();

        playerA.scorePoint();

        playerA.scorePoint();

        assertThat("Thirty : Love", equalTo(game.getScore()));
    }

    @Test
    public void ifPlayerScoresThreeThenReturnForty() {

        game = beforeGameTest();

        playerA.scorePoint();
        playerA.scorePoint();
        playerA.scorePoint();

        assertThat("Forty : Love", equalTo(game.getScore()));

    }

    @Test
    public void checkAdvantage() {

        game = beforeGameTest();

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

        game = beforeGameTest();

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

        game = beforeGameTest();

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

        game = beforeGameTest();

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

        game = beforeGameTest();

        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Josh Won.", equalTo(game.getScore()));

    }

    @Test
    public void checkPlayerAHasThirtyAndPlayerBHasForty() {

        game = beforeGameTest();

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

        game = beforeGameTest();

        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Josh Won.", equalTo(game.getScore()));

    }

    @Test
    public void checkNotDeuceButEqualPoint() {

        game = beforeGameTest();

        playerA.scorePoint();
        playerA.scorePoint();

        playerB.scorePoint();
        playerB.scorePoint();

        assertThat("Thirty : Thirty", equalTo(game.getScore()));

    }

    @Test
    public void checkFifteenEqualPoints() {

        game = beforeGameTest();

        playerA.scorePoint();

        playerB.scorePoint();

        assertThat("Fifteen : Fifteen", equalTo(game.getScore()));

    }

}
