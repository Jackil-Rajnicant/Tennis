import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class TestTennis {

    @Test
    public void ifPlayerScoresZeroThenReturnLove(){

        Tennis tennis = new Tennis();

        String score = tennis.getScore(0);

        assertThat("Love",equalTo(score));

    }

    @Test
    public void ifPlayerScoresOneThenReturnFifthteen(){

        Tennis tennis = new Tennis();

        String score = tennis.getScore(1);

        assertThat("Fifteen", equalTo(score));
    }

    @Test
    public void ifPlayerScoresTwoThenReturnThirty(){

        Tennis tennis = new Tennis();

        String score = tennis.getScore(2);

        assertThat("Thirty", equalTo(score));
    }

    @Test
    public void ifPlayerScoresThreeThenReturnForty(){

        Tennis tennis = new Tennis();

        String score = tennis.getScore(3);

        assertThat("Forty", equalTo(score));
    }




}
