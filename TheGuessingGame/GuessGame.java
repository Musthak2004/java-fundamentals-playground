package TheGuessingGame;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {

            p1.guess();
            p2.guess();
            p3.guess();

            if (p1.number == targetNumber ||
                    p2.number == targetNumber ||
                    p3.number == targetNumber) {

                System.out.println("We have a winner!");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
