import java.util.Arrays;
import java.util.List;

public class Player {

    private static final List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");
    private String name = "";
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getActualScore() {
        return score;
    }

    public String getScoreDescription() {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }

    public void scorePoint() {
        this.score = this.score + 1;
    }

}
