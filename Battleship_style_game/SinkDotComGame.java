package Battleship_style_game;

import java.util.ArrayList;
import java.util.Scanner;

public class SinkDotComGame {
    public static void main(String[] args) {

        DotCom dot = new DotCom();
        ArrayList<Integer> locations = new ArrayList<>();

        locations.add(2);
        locations.add(3);
        locations.add(4);

        dot.locationCells = locations;

        Scanner scanner = new Scanner(System.in);
        int numOfGuesses = 0;
        boolean isAlive = true;

        System.out.println("🎯 Sink a Dot Com Game Started!");

        while (isAlive) {
            System.out.print("Enter a number (0-6): ");
            int guess = scanner.nextInt();
            numOfGuesses++;

            String result = dot.checkYourself(guess);
            System.out.println(result);

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("💥 You sunk the Dot Com!");
                System.out.println("Total guesses: " + numOfGuesses);
            }
        }
        scanner.close();
    }
}
