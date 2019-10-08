import java.util.*;

public class Carte {

    public static List<Integer> listCarte() {

        ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int j = 0; j < 4; j++) {

            for (int i = 1; i <= 13; i++) {
                cards.add(i);
            }
        }

        return cards;

    }
}
