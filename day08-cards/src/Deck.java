import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Deck {
    
    public static final String[] SUITS = {"Clubs", "Diamond", "Spade", "Heart"};

    public static final String[] CARD_NAME = {
        "ACE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT",
        "NINE", "TEN", "JACK", "QUEEN", "KING"
    };

    public static final Integer[] CARD_VALUE = {
        1, 2, 3, 4,
        5, 6, 7, 8,
        9, 10, 10, 10, 10
    };

    List<Card> cards = new LinkedList<>();

    public Deck() {
        this.cards = createDeck();
    }

    public Optional<Card> take () {
        if (cards.size() > 0) {
            Card c = cards.remove(0);
            return Optional.of(c);
        }
        return Optional.empty();
    }

    public void shuffle () {
        Random rnd = new SecureRandom();

        for (Integer i = 0; i < cards.size(); i++) {
            Integer randomIdx = rnd.nextInt(cards.size());
            Card card0 = cards.get(i);
            Card card1 = cards.get(randomIdx);
            cards.set(i, card1);
            cards.set(randomIdx, card0);
        }
    }

    private List<Card> createDeck() {
        List<Card> cards = new LinkedList<>();
        for (String suit: SUITS) {
            for (Integer i = 0; i < CARD_NAME.length; i++) {
                Card card = new Card(suit, CARD_NAME[i], CARD_VALUE[i]);
                cards.add(card);
            }
        }
        return cards;
    }

    @Override
    public String toString() {
        return "Deck = " + cards;
    }
}
