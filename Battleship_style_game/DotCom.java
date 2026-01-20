package Battleship_style_game;

import java.util.ArrayList;

public class DotCom {

    ArrayList<Integer> locationCells;

    String checkYourself(int guess) {
        String result = "miss";

        if (locationCells.contains(guess)) {
            locationCells.remove(Integer.valueOf(guess));
            result = "hit";

            if (locationCells.isEmpty()) {
                result = "kill";
            }
        }
        return result;
    }

}
