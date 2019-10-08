import java.util.*;

class Play{


	public static void main(String[] args) {

        List<Integer> hand = new ArrayList<Integer>();
        boolean stop = false;

        List<Integer> cards = Carte.listCarte();
        while(cards.size() > 0 && !stop) {
            int random = (int)((Math.random()*cards.size()));

            hand.add( cards.remove(random) );
            System.out.println("your hand is now:");
            for(Integer card : hand) {
                System.out.println(card);
            }
            if(hand.size() >= 2) {
                stop = true;
            }
        }
        System.out.println("Hello World");
    }
}