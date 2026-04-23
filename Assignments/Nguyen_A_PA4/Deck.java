import java.util.*;

public class Deck {
    //
    LinkedList<Integer> m_cards = new LinkedList<>();
    Card card;

    public Deck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card = new Card(i, j);

                m_cards.add(card);
                System.out.println(card);
            }
        }

    }

    //constructor
    public class Deck() {
        
    }


}
