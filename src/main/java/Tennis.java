import java.util.Arrays;
import java.util.List;

public class Tennis {

    public static final List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");

    public String getScore(int score) {
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
}
