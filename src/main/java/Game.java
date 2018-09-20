public class Game {

    Player playerA;
    Player playerB;

    public Game(Player playerOneName, Player playerTwoName) {
        playerA = playerOneName;
        playerB = playerTwoName;
    }

    public String getScore() {

        // System.out.println(playerA.getActualScore());
        // System.out.println(playerB.getActualScore());

        if (playerA.getActualScore() >= 3 && playerB.getActualScore() >= 3) {

            if ((playerA.getActualScore() - playerB.getActualScore()) >= 2) {
                return playerA.getName() + " Won.";

            } else if ((playerB.getActualScore() - playerA.getActualScore()) >= 2) {
                return playerB.getName() + " Won.";

            } else if (playerA.getActualScore() > playerB.getActualScore()) {
                return playerA.getName() + " Advantage.";

            } else if (playerB.getActualScore() > playerA.getActualScore()) {
                return playerB.getName() + " Advantage.";

            } else if (playerA.getActualScore() == playerB.getActualScore()) {
                return "Deuce.";

            } else {
                return playerA.getScoreDescription() + " : " + playerB.getScoreDescription();
            }


        } else if (playerA.getActualScore() > 3 || playerB.getActualScore() > 3) {

            return playerA.getActualScore() > playerB.getActualScore() ? playerA.getName() + " Won." : playerB.getName() + " Won.";
        } else {
            return playerA.getScoreDescription() + " : " + playerB.getScoreDescription();
        }

    }


}
